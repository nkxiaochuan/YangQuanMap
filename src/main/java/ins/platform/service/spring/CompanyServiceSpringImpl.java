package ins.platform.service.spring;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.framework.power.PowerService;
import ins.platform.schema.model.PrpDcompany;
import ins.platform.schema.vo.TreeNode;
import ins.platform.service.facade.CompanyService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("companyService")
public class CompanyServiceSpringImpl extends
		GenericDaoHibernate<PrpDcompany, String> implements CompanyService {
	private PowerService powerService;
	private static final Log logger = LogFactory
			.getLog(CompanyServiceSpringImpl.class);

	private static CacheService cacheManager = CacheManager
			.getInstance("Company");

	public PrpDcompany getCompany(String comCode) {
		logger.debug("获取机构代码为" + comCode + "的机构信息");
		return ((PrpDcompany) super.get(comCode));
	}

	public String findComCNameByComCode(String comCode) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("comCode", comCode);
		PrpDcompany prpDcompany = (PrpDcompany) super.findUnique(queryRule);
		return prpDcompany.getComCName();
	}

	public Page findCompany(QueryRule queryRule, int pageNo, int pageSize) {
		logger.debug("获取信机构息列表");
		pageSize = 500;
		return super.find(queryRule, pageNo, pageSize);
	}

	public void delete(String comCode) {
		logger.debug("刪除机构代码为" + comCode + "的机构信息");
		super.deleteByPK(comCode);
	}

	public void save(PrpDcompany prpDcompany) {
		logger.debug("保存机构信息");
		if ((prpDcompany.getValidStatus() == null)
				|| ("".equals(prpDcompany.getValidStatus()))) {
			prpDcompany.setValidStatus("1");
		}
		super.save(prpDcompany);
	}

	public void update(PrpDcompany prpDcompany) {
		logger.debug("更新机构代码为" + prpDcompany.getComCode() + "机构信息");
		if ((prpDcompany.getValidStatus() == null)
				|| ("".equals(prpDcompany.getValidStatus()))) {
			prpDcompany.setValidStatus("1");
		}
		super.update(prpDcompany);
	}

	public List<String> getAllUpperCompanyCode(String comCode) {
		List list = new ArrayList();
		Map companyTree = getCompanyTree();
		TreeNode node = (TreeNode) companyTree.get(comCode);
		TreeNode newComCodeNode = null;

		while (node == null) {
			PrpDcompany prpDcompany = (PrpDcompany) super.get(comCode);
			if ((prpDcompany == null) || (prpDcompany.getNewComCode() == null)
					|| (comCode.equals(prpDcompany.getNewComCode()))) {
				break;
			}
			comCode = prpDcompany.getNewComCode();
			node = (TreeNode) companyTree.get(comCode);
			newComCodeNode = node;
		}

		if (node != null) {
			List<TreeNode> parents = node.getAllParent();
			for (TreeNode parent : parents) {
				list
						.add(((CompanyInfoTreeNode) parent.getValue())
								.getComCode());
			}
			if (newComCodeNode != null) {
				list.add(((CompanyInfoTreeNode) newComCodeNode.getValue())
						.getComCode());
			}
		}
		return list;
	}

	public List<String> getSubAllCompanyCode(String comCode) {
		String key = cacheManager.generateCacheKey(new Object[] {
				"subAllCompanyCode", comCode });
		Object result = cacheManager.getCache(key);
		if (result != null) {
			return ((List) result);
		}
		List comCodeList = new ArrayList(0);
		TreeNode node = (TreeNode) getCompanyTree().get(comCode);
		if (node != null) {
			List<TreeNode> children = node.getAllChildren();
			if ((children != null) && (children.size() != 0)) {
				for (TreeNode child : children) {
					comCodeList.add(((CompanyInfoTreeNode) child.getValue())
							.getComCode());
				}
			}
			comCodeList.add(((CompanyInfoTreeNode) node.getValue())
					.getComCode());
		}
		cacheManager.putCache(key, comCodeList);
		return comCodeList;
	}

	public boolean isUpperComCode(String comCode, String upperComCode) {
		if ((comCode == null) || (upperComCode == null)
				|| (comCode.equals(upperComCode))) {
			return false;
		}
		Map companyTree = getCompanyTree();
		TreeNode node = (TreeNode) companyTree.get(comCode);
		TreeNode parent = (TreeNode) companyTree.get(upperComCode);
		if ((node == null) || (parent == null)) {
			return false;
		}
		if (node.getParent() == parent.getParent()) {
			return false;
		}
		while (node != null) {
			if (node.getParent() == parent) {
				return true;
			}
			node = node.getParent();
		}
		return false;
	}

	private boolean isCityCompanyEx(String comCode) {
		TreeNode node = (TreeNode) getCompanyTree().get(comCode);
		if (node == null) {
			logger.warn(" '" + comCode + "' 该机构代码不存在！");
			return false;
		}
		CompanyInfoTreeNode companyInfoTreeNode = (CompanyInfoTreeNode) node
				.getValue();
		String flag3 = "";
		if ((companyInfoTreeNode.getFlag() != null)
				&& (companyInfoTreeNode.getFlag().length() >= 3)) {
			flag3 = companyInfoTreeNode.getFlag().substring(2, 3);
		}
		boolean cityFlag = false;
		if ((companyInfoTreeNode.getUpperComCode() != null)
				&& (companyInfoTreeNode.getUpperComCode().equals("00000000"))
				&& (flag3.equals("7"))) {
			cityFlag = true;
		}

		return ((flag3 == null) || ((!(flag3.equals("4"))) && (!(cityFlag))));
	}

	private Map<String, TreeNode<CompanyInfoTreeNode>> initCompanyTreeCache() {
		Map<String,TreeNode<CompanyInfoTreeNode>> companyTree = new HashMap(0);
		List<Object[]> comList = super
				.findByHql(
						"select com.comCode, com.upperComCode,com.flag from PrpDcompany com where com.validStatus='1'",
						new Object[0]);

		List<CompanyInfoTreeNode> companyInfoTreeNodeList = new ArrayList(0);
		for (Object[] obj : comList) {
			CompanyInfoTreeNode companyInfoTreeNode = new CompanyInfoTreeNode();
			companyInfoTreeNode.setComCode((String) obj[0]);
			companyInfoTreeNode.setUpperComCode((String) obj[1]);
			companyInfoTreeNode.setFlag((String) obj[2]);
			TreeNode node = new TreeNode(companyInfoTreeNode);
			companyInfoTreeNodeList.add(companyInfoTreeNode);
			companyTree.put(((CompanyInfoTreeNode) node.getValue())
					.getComCode(), node);
		}
		for (CompanyInfoTreeNode companyInfoTreeNode : companyInfoTreeNodeList) {
			TreeNode node = (TreeNode) companyTree.get(companyInfoTreeNode
					.getComCode());
			TreeNode parent = (TreeNode) companyTree.get(companyInfoTreeNode
					.getUpperComCode());
			if ((parent != null)
					&& (!(companyInfoTreeNode.getComCode()
							.equals(companyInfoTreeNode.getUpperComCode())))) {
				node.setParent(parent);
				parent.addChild(node);
			}
		}
		String key = cacheManager
				.generateCacheKey(new Object[] { "CompanyTree" });
		cacheManager.putCache(key, companyTree);
		return companyTree;
	}

	private Map<String, TreeNode<CompanyInfoTreeNode>> getCompanyTree() {
		String key = cacheManager
				.generateCacheKey(new Object[] { "CompanyTree" });
		Map treeNodeMap = (Map) cacheManager.getCache(key);

		if (treeNodeMap == null) {
			treeNodeMap = initCompanyTreeCache();
		}
		return treeNodeMap;
	}

	public PrpDcompany getPrpDcompanyByComCode(String comCode) {
		return ((PrpDcompany) get(comCode));
	}

	public void initCompanyTree() {
		getCompanyTree();
	}

	public PowerService getPowerService() {
		return this.powerService;
	}

	public void setPowerService(PowerService powerService) {
		this.powerService = powerService;
	}

	private class CompanyInfoTreeNode {
		private String comCode;
		private String upperComCode;
		private String flag;

		public String getComCode() {
			return this.comCode;
		}

		public void setComCode(String comCode) {
			this.comCode = comCode;
		}

		public String getUpperComCode() {
			return this.upperComCode;
		}

		public void setUpperComCode(String upperComCode) {
			this.upperComCode = upperComCode;
		}

		public String getFlag() {
			return this.flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}
	}
}