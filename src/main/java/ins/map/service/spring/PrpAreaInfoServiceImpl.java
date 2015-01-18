package ins.map.service.spring;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.framework.utils.DataUtils;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.schema.model.PrpDuser;

import java.util.List;

import org.springframework.security.core.token.Sha512DigestUtils;
import org.springframework.util.Assert;

public class PrpAreaInfoServiceImpl extends GenericDaoHibernate<PrpAreaInfo, String> implements PrpAreaInfoService {

	public PrpAreaInfo findAreaInfoByComCode(String comCode) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("comCode", comCode);
		List<PrpAreaInfo> list = this.find(queryRule);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public List<PrpAreaInfo> findAreaInfos() {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("validStatus", "1");
		queryRule.addSql(" 1=1");
		return this.find(queryRule);
	}

	public void addAreaInfo(PrpAreaInfo info) {
		this.addAreaInfo(info);	
	}

	public void delete(String comCode) {
		this.deleteByPK(comCode);
	}

	public void updateAreaInfo(PrpAreaInfo info) {
		Assert.notNull(info, "prpDuser must have value.");
		Assert.hasText(info.getComCode(),
				"prpDuser.getUserCode() must have value.");

		PrpAreaInfo po = (PrpAreaInfo) get(info.getComCode());
		DataUtils.copySimpleObjectToTargetFromSource(po, info, false);
	}
	
	public Page findPrpAreaInfo(QueryRule queryRule, int pageNo, int pageSize) {
		logger.debug("findprpareaInfo");
		return super.find(queryRule, pageNo, pageSize);
	}

	public void save(PrpAreaInfo info) {
		super.save(info);
		
	}

}
