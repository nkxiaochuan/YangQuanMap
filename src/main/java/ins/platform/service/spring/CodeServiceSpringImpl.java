package ins.platform.service.spring;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.framework.utils.StringUtils;
import ins.platform.schema.vo.Code;
import ins.platform.service.facade.CodeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service("codeService")
public class CodeServiceSpringImpl extends GenericDaoHibernate implements
		CodeService {
	private static CacheService cacheManager = CacheManager.getInstance("code");

	public Page listCodeSelect(String codeType, String riskCode,
			String language, String matches, int pageNo, int pageSize,
			String userCode, String typeParam, String extraCond) {
		String key = cacheManager.generateCacheKey(new Object[] {
				"listCodeSelect", codeType, riskCode, language, matches,
				pageNo, pageSize, typeParam,
				extraCond });

		Object result = cacheManager.getCache(key);
		if ((Page) result != null) {
			return ((Page) result);
		}
		Page page = null;
		String hql = generateCodeSelectHql(codeType, riskCode, language, "asc",
				matches, userCode, typeParam, extraCond);
		page = findByHql(hql, pageNo,pageSize, matches, matches);
		cacheManager.putCache(key, page);
		return page;
	}

	public String translateCode(String codeType, String codeCode,
			String riskCode, String language) {
		if (codeCode == null) {
			return "";
		}
		String key = cacheManager.generateCacheKey(new Object[] {
				"translateCode", codeType, codeCode, riskCode, language });
		Object result = cacheManager.getCache(key);
		if (result != null) {
			return ((String) result);
		}
		String codeName = null;
		StringBuilder buffer = new StringBuilder();
		if (codeCode.indexOf(",") > -1) {
			String[] codes = StringUtils.split(codeCode, ",");
			for (String code : codes) {
				String hql = generateTranslateHql(codeType, code.trim(),
						riskCode, language);
				List nameList = findByHql(hql, new Object[] { code.trim() });
				if (nameList.size() > 0) {
					codeName = nameList.get(0) + "";
					codeName = codeName.trim();
				}
				buffer.append(codeName);
				if (!(code.equals(codes[(codes.length - 1)]))) {
					buffer.append(",");
				}
			}
			codeName = buffer.toString();
		} else {
			String hql = generateTranslateHql(codeType, codeCode, riskCode,
					language);
			List nameList = findByHql(hql, new Object[] { codeCode });
			if (nameList.size() > 0) {
				codeName = nameList.get(0) + "";
				codeName = codeName.trim();
			}
		}
		if (codeName == null) {
			codeName = codeCode;
		}
		cacheManager.putCache(key, codeName);
		return codeName;
	}

	public Map<String, String> listCodes(String codeType, String riskCode,
			String language) {
		String key = cacheManager.generateCacheKey(new Object[] { "listCodes",
				codeType, riskCode, language });
		Object result = cacheManager.getCache(key);
		if (result != null) {
			return ((Map) result);
		}
		TreeMap map = new TreeMap();
		String hql = generateListHql(codeType, riskCode, language, "asc");
		List list = findByHql(hql, new Object[0]);
		for (int i = 0; i < list.size(); ++i) {
			Object[] arrValue = (Object[]) (Object[]) list.get(i);
			String code = arrValue[0] + "".trim();
			String name = arrValue[1] + "".trim();
			map.put(code, name);
		}
		cacheManager.putCache(key, map);
		return map;
	}

	public Map<String, String> listCodes(String codeType, String riskCode,
			String language, String otherCondition) {
		String key = cacheManager.generateCacheKey(new Object[] { "listCodes",
				codeType, riskCode, language, otherCondition });
		Object result = cacheManager.getCache(key);
		if (result != null) {
			return ((Map) result);
		}
		TreeMap map = new TreeMap();
		String hql = generateListHql(codeType, riskCode, language, "");
		if ((otherCondition != null) && (!(otherCondition.trim().equals("")))) {
			hql = hql + " and " + otherCondition;
		}
		List list = findByHql(hql, new Object[0]);
		for (int i = 0; i < list.size(); ++i) {
			Object[] arrValue = (Object[]) (Object[]) list.get(i);
			String code = arrValue[0] + "".trim();
			String name = arrValue[1] + "".trim();
			map.put(code, name);
		}
		cacheManager.putCache(key, map);
		return map;
	}

	public List<Code> listCodeList(String codeType, String riskCode,
			String language) {
		List codes = listOrderCodeList(codeType, riskCode, language, "");
		return codes;
	}

	public List<Code> listOrderCodeList(String codeType, String riskCode,
			String language, String order) {
		String key = cacheManager.generateCacheKey(new Object[] {
				"listOrderCodeList", codeType, riskCode, language, order });
		Object result = cacheManager.getCache(key);
		if (result != null) {
			return ((List) result);
		}
		List codes = new ArrayList();
		String hql = generateListHql(codeType, riskCode, language, order);
		List list = findByHql(hql, new Object[0]);
		for (int i = 0; i < list.size(); ++i) {
			Object[] arrValue = (Object[]) (Object[]) list.get(i);
			String code = arrValue[0] + "".trim();
			String name = arrValue[1] + "".trim();
			codes.add(new Code(code, name));
		}
		cacheManager.putCache(key, codes);
		return codes;
	}

	private String generateTranslateHql(String codeType, String codeCode,
			String riskCode, String language) {
		String hql = null;
		if (codeType.equals("UserCode"))
			hql = "select a.userName from PrpDuser a where a.userCode = ?";
		else if (codeType.equals("ComCode")) {
			if (language.equals("E"))
				hql = "select a.comename from PrpDcompany a where a.comCode = ?";
			else {
				hql = "select a.comCName from PrpDcompany a where a.comCode = ?";
			}
		} else if (language.equals("E")) {
			hql = "select a.codeEName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeCode=b.id.codeCode and a.id.codeType='"
					+ codeType
					+ "' and b.id.riskCode in('PUB', '"
					+ riskCode
					+ "') and a.id.codeCode = ?";
		} else {
			hql = "select a.codeCName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeCode=b.id.codeCode and a.id.codeType='"
					+ codeType
					+ "' and b.id.riskCode in('PUB', '"
					+ riskCode
					+ "') and a.id.codeCode = ?";
		}

		return hql;
	}

	private String generateListHql(String codeType, String riskCode,
			String language, String order) {
		String hql = null;
		if ((riskCode != null) && (!("".equals(riskCode.trim())))) {
			riskCode = riskCode.replaceAll(",", "','");
		}
		if (codeType.equals("UserCode"))
			hql = "select a.userCode,a.userName from PrpDuser a where a.validStatus='1'";
		else if (codeType.equals("ComCode")) {
			if (language.equals("E"))
				hql = "select a.comCode,a.comEName from PrpDcompany a where a.validStatus='1'";
			else {
				hql = "select a.comCode,a.comCName from PrpDcompany a where a.validStatus='1'";
			}
		} else if (language.equals("E")) {
			hql = "select a.id.codeCode,a.codeEName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeCode=b.id.codeCode and a.id.codeType='"
					+ codeType
					+ "' and b.id.riskCode in('PUB', '"
					+ riskCode
					+ "') and a.validStatus='1'";
		} else {
			hql = "select a.id.codeCode,a.codeCName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeCode=b.id.codeCode and a.id.codeType='"
					+ codeType
					+ "' and b.id.riskCode in('PUB', '"
					+ riskCode
					+ "') and a.validStatus='1'";
		}

		if ((order != null)
				&& (((order.equalsIgnoreCase("asc")) || (order
						.equalsIgnoreCase("desc"))))) {
			hql = hql + " order by 1 " + order;
		}
		return hql;
	}

	private String generateCodeSelectHql(String codeType, String riskCode,
			String language, String order, String matches, String userCode,
			String typeParam, String extraCond) {
		if ((riskCode != null) && (!("".equals(riskCode.trim())))) {
			riskCode = riskCode.replaceAll(",", "','");
		}
		String hql = null;
		if (codeType.equals("UserCode")) {
			hql = "select a.userCode,a.userName from PrpDuser a where a.validStatus='1' and (a.userCode like ? or a.userName like ?)";
		} else if (codeType.equals("ComCode")) {
			if (language.equals("E"))
				hql = "select a.comCode,a.comeName,a.upperComCode,a.faxNumber,'' from PrpDcompany a where a.validStatus='1' and (a.comCode like ? or a.comeName like ?) ";
			else {
				hql = "select a.comCode,a.comCName,a.upperComCode,a.faxNumber,'' from PrpDcompany a where a.validStatus='1' and (a.comCode like ? or a.comCName like ?) ";
			}
			hql = hql + " order by a.upperComCode,a.comCode asc";
		} else if ("SelectAllRiskCodeTree".equals(codeType)) {
			hql = "select risk.riskCode,risk.riskCName from SaaRisk risk where risk.validStatus = '1' and (risk.riskCode like ? or risk.riskCName like ?)";
		} else if (language.equals("E")) {
			hql = "select distinct(a.id.codeCode),a.codeEName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeCode=b.id.codeCode and a.id.codeType='"
					+ codeType
					+ "' and (b.id.riskCode in('PUB', '"
					+ riskCode
					+ "') or b.id.riskCode in( select risk.prpDclass.classCode from PrpDrisk risk where risk.riskCode in('"
					+ riskCode
					+ "'))) and a.validStatus='1' and (a.id.codeCode like ? or a.codeEName like ?)";
		} else {
			hql = "select distinct(a.id.codeCode),a.codeCName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeCode=b.id.codeCode and a.id.codeType='"
					+ codeType
					+ "' and (b.id.riskCode in('PUB', '"
					+ riskCode
					+ "') or b.id.riskCode in( select risk.prpDclass.classCode from PrpDrisk risk where risk.riskCode in('"
					+ riskCode
					+ "')))  and a.validStatus='1' and (a.id.codeCode like ? or a.codeCName like ?)";
		}

		if ((typeParam != null) && (!("null".equals(typeParam)))
				&& (!("".equals(typeParam.trim())))) {
			QueryRule queryRule = QueryRule.getInstance();
			queryRule.addEqual("id.typeParam", typeParam);
			queryRule.addEqual("id.codeType", codeType);
			queryRule.addEqual("validstate", "1");
		}
		if ((order != null)
				&& (((order.equalsIgnoreCase("asc")) || (order
						.equalsIgnoreCase("desc"))))) {
			hql = hql + " order by 1 " + order;
			this.logger.debug(hql);
		}
		return hql;
	}

	public String translateCode(String codeType, String codeEName,
			String riskCode) {
		String codeCName = "";
		String hql = "select a.codeCName from PrpDcode a,PrpDcodeRisk b where a.id.codeType=b.id.codeType and a.id.codeType='"
				+ codeType
				+ "' and b.id.riskCode in('PUB', '"
				+ riskCode
				+ "') and a.validStatus='1' and a.codeEName like ?";

		this.logger.debug(hql);
		List nameList = findByHql(hql, new Object[] { codeEName });
		if (nameList.size() > 0) {
			codeCName = nameList.get(0) + "";
			codeCName = codeCName.trim();
		}
		return codeCName;
	}

	public List listNodes(String query, String currentNodeName) {
		StringBuilder builder = new StringBuilder();
		builder
				.append(
						"select distinct (t.name_),t.description_ from jbpm_taskinstance t where t.name_ in(")
				.append(" select n.name_ from jbpm_node n where n.class_ = 'K'")
				.append(" and n.id_ < (").append(
						"select n1.id_ from jbpm_node n1 where n1.name_ = '")
				.append(currentNodeName).append("')").append(")").append(
						"and (t.name_ like '").append(query).append(
						"' or t.description_ like '").append(query)
				.append("')").append("and t.name_ <> '")
				.append(currentNodeName).append("'");

		List nodeList = super.getSession().createSQLQuery(builder.toString())
				.list();
		return nodeList;
	}
}