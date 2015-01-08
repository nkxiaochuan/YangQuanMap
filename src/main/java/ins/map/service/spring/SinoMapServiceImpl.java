package ins.map.service.spring;

import java.util.List;

import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.map.schema.model.LocationInfo;
import ins.map.service.facade.SinoMapService;

public class SinoMapServiceImpl extends GenericDaoHibernate<LocationInfo, String> implements SinoMapService {

	public List<LocationInfo> findLocationInfos() {
		// TODO Auto-generated method stub
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		return this.find(queryRule);
	}

	public LocationInfo findLocationInfoByUserCode(String userCode)
			throws Exception {
		// TODO Auto-generated method stubQueryRule queryRule = QueryRule.getInstance();
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("userCode", userCode.trim());
		List<LocationInfo> list = this.find(queryRule);
		if(list !=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	public void saveLocationInfo(LocationInfo locationInfo) throws Exception {
		// TODO Auto-generated method stub
		this.save(locationInfo);
	}

	public void updateLocationInfo(LocationInfo locationInfo) throws Exception {
		// TODO Auto-generated method stub
		this.update(locationInfo);
	}

}
