package ins.platform.service.spring;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.framework.rule.RuleService;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.UserService;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.token.Sha512DigestUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import ins.framework.utils.DataUtils;

@Service("userService")
public class UserServiceSpringImpl extends
		GenericDaoHibernate<PrpDuser, String> implements UserService {
	private static final Log logger = LogFactory
			.getLog(UserServiceSpringImpl.class);

	private static CacheService cacheManager = CacheManager.getInstance("User");
	private RuleService ruleService;
	private PrpAreaInfoService prpAreaInfoService;

	public PrpAreaInfoService getPrpAreaInfoService() {
		return prpAreaInfoService;
	}

	public void setPrpAreaInfoService(PrpAreaInfoService prpAreaInfoService) {
		this.prpAreaInfoService = prpAreaInfoService;
	}

	public RuleService getRuleService() {
		return this.ruleService;
	}

	public void setRuleService(RuleService ruleService) {
		this.ruleService = ruleService;
	}

	public PrpDuser getUserByUserCode(String userCode) {
		String key = cacheManager.generateCacheKey(new Object[] { "userCode",
				userCode });
		Object result = cacheManager.getCache(key);
		if (result != null) {
			return ((PrpDuser) result);
		}
		cacheManager.putCache(key, super.get(userCode));
		return ((PrpDuser) super.get(userCode));
	}

	public PrpDuser getUser(String userCode) {
		logger.debug("get " + userCode + " by userCode");
		return ((PrpDuser) super.get(userCode));
	}

	public Page findUser(QueryRule queryRule, int pageNo, int pageSize) {
		logger.debug("finduser");
		return super.find(queryRule, pageNo, pageSize);
	}

	@Transactional(propagation = Propagation.NEVER)
	public void delete(String userCode) {
		logger.debug("delete " + userCode + " .");
		super.deleteByPK(userCode);
	}

	public void save(PrpDuser prpDuser) {
		logger.debug("save user");
		prpDuser.setPassword(Sha512DigestUtils.shaHex(prpDuser.getPassword()));

		if ((prpDuser.getValidStatus() == null)
				|| ("".equals(prpDuser.getValidStatus()))) {
			prpDuser.setValidStatus("1");
		}
		super.save(prpDuser);
	}

	public void update(PrpDuser prpDuser) {
		Assert.notNull(prpDuser, "prpDuser must have value.");
		Assert.hasText(prpDuser.getUserCode(),
				"prpDuser.getUserCode() must have value.");

		PrpDuser po = (PrpDuser) get(prpDuser.getUserCode());
		if ((prpDuser.getPassword() != null)
				&& (prpDuser.getPassword().trim().length() > 0)) {
			prpDuser.setPassword(Sha512DigestUtils.shaHex(prpDuser
					.getPassword()));
		}
		if(prpDuser.getPrpAreaInfo() != null && prpDuser.getPrpAreaInfo().getComCode() != null &&
				!"".equals(prpDuser.getPrpAreaInfo().getComCode())) {
			PrpAreaInfo areaInfo = this.prpAreaInfoService.findAreaInfoByComCode(prpDuser.getPrpAreaInfo().getComCode());
			po.setPrpAreaInfo(areaInfo);
		}
		
		DataUtils.copySimpleObjectToTargetFromSource(po, prpDuser, false);
	}

	public void updateNothing() {
		System.out.println("===============updateNothing===============");
	}

	public void changePassword(String userCode, String password,
			String newpassword) {
		PrpDuser user = (PrpDuser) get(userCode);

		String pd = Sha512DigestUtils.shaHex(password);
		System.out.println("PP");
		String PW = user.getPassword();
		if (!(PW.equals(pd)))
			return;
		String pass = newpassword;

		user.setPassword(pass);

		save(user);
	}

	public PrpDuser findUserByUserName(String userCode) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		queryRule.addEqual("userCode", userCode);
		return super.findUnique(queryRule);
	}

/*	public String getComCodeByUserCode(String userCode) {
		if (userCode == null) {
			return "";
		}
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addLike("userCode", userCode);
		PrpDuser user = (PrpDuser) findUnique(queryRule);
		if (user == null) {
			throw new BusinessException("û���ҵ�Ա��" + userCode + "����Ϣ�����ʵ���ڴ˲�ѯ",
					false);
		}
		if (user.getPrpDcompany() == null) {
			throw new BusinessException("û���ҵ�Ա��" + userCode + "�Ļ���Ϣ�����ʵ���ڴ˲�ѯ",
					false);
		}

		return user.getPrpDcompany().getComCode();
	}*/

	public void unvalidUser(String userCode) {
		PrpDuser user = (PrpDuser) get(userCode);
		user.setValidStatus("0");
		save(user);
	}

	public Page findAllUser(String query, String codeType) {
		StringBuilder hql = new StringBuilder();
		hql
				.append("select prpDuser.userCode,prpDuser.userName from PrpDuser prpDuser where ");

		hql.append(" prpDuser.userCode like '");
		hql.append(query);
		hql.append("'");
		Page page = null;
		try {
			page = findByHql(hql.toString(), 1, 30);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return page;
	}

	private PrpDuser updateNewUserCode(PrpDuser prpDuser) {
		try {
			prpDuser = (PrpDuser) this.ruleService.executeRules("user",
					prpDuser, "/UserRuleApp/UserRule");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prpDuser;
	}

	public List listUserCodeSelect(List<String> transitionList) {
		StringBuilder hql = new StringBuilder();
		List userCodeList = new ArrayList();
		hql.append("select distinct saaUserGrade.userCode ").append(
				" from SaaUserGrade saaUserGrade ");
		hql.append("where saaUserGrade.saaGrade.id in (");
		hql.append("select id from SaaGrade saaGrade where ");
		String preName = "";
		for (int i = 0; i < transitionList.size(); ++i) {
			hql.append("saaGrade.gradeCName like '%");
			preName = ((String) transitionList.get(i)).substring(0, 2);
			hql.append(preName).append("%'");
			if (i < transitionList.size() - 1) {
				hql.append(" or ");
			}
		}
		hql.append(")");
		userCodeList = super.findByHql(hql.toString(), new Object[0]);
		return userCodeList;
	}

	public PrpDuser findByUserCode(String userCode) {
		PrpDuser prpDuser = (PrpDuser) super.get(userCode);
		return prpDuser;
	}

	public List<PrpDuser> findByUserCodeByQueryRule(String userCode) {
		QueryRule queryRule = QueryRule.getInstance().addEqual("userCode",
				userCode);
		return super.find(queryRule);
	}

	public List<PrpDuser> findByPasswordSort(String password) {
		QueryRule queryRule = QueryRule.getInstance().addEqual("password",
				password).addDescOrder("userCode");
		return super.find(queryRule);
	}

	public List<PrpDuser> findByHqlByUserCode(String userCode) {
		List list = super.findByHql(
				"from PrpDuser _user where _user.userCode=?",
				new Object[] { userCode });
		return list;
	}

	public Page findByPage(String password, int pageNo, int pageSize) {
		QueryRule queryRule = QueryRule.getInstance().addEqual("password",
				password);
		return super.find(queryRule, pageNo, pageSize);
	}

	public List<PrpDuser> findByHqlByComCode(String comCode) {
		List list = super.findByHql(
				"from PrpDuser _user where _user.prpDcompany.comCode=?",
				new Object[] { comCode });
		return list;
	}

	public List<String> findByHqlByValidStatus(String validStatus) {
		List list = super
				.findByHql(
						"select user.userName from PrpDuser user where user.validStatus=?",
						new Object[] { validStatus });
		return list;
	}

	public List<Object[]> findByHqlByArticleCode(String articleCode) {
		List list = super
				.findByHql(
						"select user.userName,user.password from PrpDuser user where user.articleCode=?",
						new Object[] { articleCode });
		return list;
	}

	public List<Object[]> findByHqlByAllStatus(String userStatus,
			String comStatus) {
		List list = super
				.findByHql(
						"select user.userName,com.comCName from PrpDuser user,PrpDcompany com where user.validStatus=? and com.validStatus=?",
						new Object[] { userStatus, comStatus });
		return list;
	}

	public List<PrpDuser> findByHqlSort() {
		List list = super.findByHql(
				"from PrpDuser _user order by _user.userCode", new Object[0]);
		return list;
	}

	public List<PrpDuser> findByHqlTop5() {
		List list = super.getSession().createQuery(
				"from PrpDuser _user order by _user.userCode").setMaxResults(5)
				.list();
		return list;
	}

	public String getComCodeByUserCode(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public PrpDuser findUserByUserCode(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PrpDuser> findUserListByComCode(String comCode) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		queryRule.addEqual("prpAreaInfo.comCode", comCode);
		return super.find(queryRule);
	}

}