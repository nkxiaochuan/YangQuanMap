package ins.map.service.spring;

import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.PrpAreaInfoService;

import java.util.List;

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

	public void deleteAreaInfo(PrpAreaInfo info) {
		this.deleteAreaInfo(info);
	}

	public void updateAreaInfo(PrpAreaInfo info) {
		this.updateAreaInfo(info);
	}

}
