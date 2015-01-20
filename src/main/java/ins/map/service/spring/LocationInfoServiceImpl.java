package ins.map.service.spring;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.framework.utils.DataUtils;
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
	
	public Page findPrpLocationInfo(QueryRule queryRule, int pageNo, int pageSize) {
		logger.debug("findprplocationInfo");
		return super.find(queryRule, pageNo, pageSize);
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

	public void updateLocationInfo(LocationInfo info) {
		Assert.notNull(info, "LocationInfo must have value.");
		Assert.hasText(info.getId(),
				"LocationInfo.getId() must have value.");

		LocationInfo po = (LocationInfo) get(info.getId());
		DataUtils.copySimpleObjectToTargetFromSource(po, info, false);
	}

	public void delete(String id) {
		this.deleteByPK(id);
		
	}

	public List<LocationInfo> findLocationInfos(String roleCode,String comCode) {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		if(comCode !=null){
			queryRule.addEqual("prpAreaInfo.comCode", comCode.trim());
		}
		queryRule.addEqual("validStatus", "1");
		log.info("test");
		return this.find(queryRule);
	}
	
	public void save(LocationInfo info) {
		super.save(info);
		
	}

}
