package ins.map.service.facade;

import ins.map.schema.model.LocationInfo;

import java.util.List;

public interface SinoMapService {

	public List<LocationInfo> findLocationInfos() throws Exception;
	
	public LocationInfo findLocationInfoByUserCode(String userCode) throws Exception;
	
	public void saveLocationInfo(LocationInfo locationInfo) throws Exception;
	
	public void updateLocationInfo(LocationInfo locationInfo) throws Exception;
}
