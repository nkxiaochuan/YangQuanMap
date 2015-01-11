package ins.map.service.facade;

import ins.map.schema.model.LocationInfo;

import java.util.List;

public interface LocationInfoService {

	public List<LocationInfo> findLocationInfos();
	public abstract LocationInfo findLocationById(String id) ;
	public abstract List<LocationInfo> findLocationByComCode(String comCode);
	
	public abstract void addLocationInfo(LocationInfo info) ;
	
	public abstract boolean updateLocationInfoById(LocationInfo info);
	public abstract void deleteLocationInfoById(String id);
	
	public abstract void deleteLocationInfo(LocationInfo info);
}
