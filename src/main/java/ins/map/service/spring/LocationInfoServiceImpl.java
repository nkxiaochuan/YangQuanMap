package ins.map.service.spring;

import java.util.List;

import org.apache.log4j.Logger;

import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.map.schema.model.LocationInfo;
import ins.map.service.facade.LocationInfoService;

public class LocationInfoServiceImpl extends
		GenericDaoHibernate<LocationInfo, String> implements
		LocationInfoService {

	private static Logger log = Logger
			.getLogger("LocationInfoServiceImpl.class");

	public void addLocationInfo(LocationInfo info) {
		super.save(info);
	}

	public void deleteLocationInfoById(String id) {
		super.deleteByPK(id);
	}

	public List<LocationInfo> findLocationByComCode(String comCode) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("comCode", comCode.trim());
		List<LocationInfo> list = this.find(queryRule);
		return list;
	}

	public LocationInfo findLocationById(String id) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("id", id);
		List<LocationInfo> list = this.find(queryRule);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public boolean updateLocationInfoById(LocationInfo info) {
		try {
			this.update(info);
			return true;
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
		return false;
	}

	public void deleteLocationInfo(LocationInfo info) {
		this.delete(info);
		
	}

	public List<LocationInfo> findLocationInfos() {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		log.info("test");
		return this.find(queryRule);
	}

}
