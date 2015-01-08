package ins.map.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import cn.com.sinosoft.map.model.pojo.LocationInfoVo;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.web.Struts2Action;
import ins.map.schema.model.LocationInfo;
import ins.map.service.facade.SinoMapService;

public class SinoMapAction extends Struts2Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocationInfo locationInfo;
	private SinoMapService sinoMapService;
	public String getXYdata(){
		List<LocationInfo> locationInfos = new ArrayList(0);
		List<LocationInfoVo> locationInfoVos = new ArrayList(0);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			locationInfos = sinoMapService.findLocationInfos();
			Calendar c = Calendar.getInstance();
			for(LocationInfo l : locationInfos){
				LocationInfoVo vo = new LocationInfoVo();
				vo.setLngX(l.getLngX());
				vo.setLatY(l.getLatY());
				vo.setUserName(l.getUserName());
				vo.setPhoneNumber(l.getPhoneNumber());
				vo.setUpdateTimehis(df.format(l.getUpdateTimehis()));
				if((c.getTime().getTime() - l.getUpdateTimehis().getTime())/(1000*60) > 30){
					vo.setIsValid("0");
				}else{
					vo.setIsValid(l.getIsValid());
				}
				locationInfoVos.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeJSONData(locationInfoVos, "lngX","latY","userName","phoneNumber","updateTimehis","isValid");
		return null;
	}

	//初始化地图页面
	public String prepareMap(){
		System.out.println("test");
		getRequest().setAttribute("webTime", "10000");
		return SUCCESS;
	}
	public void setLocationInfo(LocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public LocationInfo getLocationInfo() {
		return locationInfo;
	}

	public void setSinoMapService(SinoMapService sinoMapService) {
		this.sinoMapService = sinoMapService;
	}

	public SinoMapService getSinoMapService() {
		return sinoMapService;
	}

}
