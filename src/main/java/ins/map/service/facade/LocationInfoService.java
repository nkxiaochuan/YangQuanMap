package ins.map.service.facade;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.map.schema.model.LocationInfo;

import java.util.List;

public interface LocationInfoService {

	public abstract LocationInfo findLocationById(String id) ;
	public abstract List<LocationInfo> findLocationByComCode(String comCode);
	public void updateLocationInfo(LocationInfo info);
	public abstract void deleteLocationInfoById(String id);
	public Page findPrpLocationInfo(QueryRule queryRule, int pageNo, int pageSize);
	public abstract void delete(String id);
	public void save(LocationInfo info);
	public abstract List<LocationInfo> findLocationInfos(String string,
			String string2);
}
