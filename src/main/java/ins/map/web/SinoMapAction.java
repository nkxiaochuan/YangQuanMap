package ins.map.web;

import ins.framework.web.Struts2Action;
import ins.map.schema.model.LocationInfo;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.LocationInfoService;
import ins.map.service.facade.SinoMapService;
import ins.platform.schema.model.PrpDuser;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import cn.com.sinosoft.map.model.pojo.LocationInfoVo;

public class SinoMapAction extends Struts2Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger("SinoMapAction.class");
	private LocationInfo locationInfo;
	private List<LocationInfo> locationInfoList;
	private SinoMapService sinoMapService;
	private LocationInfoService locationInfoService;
	private String comCode;
	
	
	
	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getXYdata(){
		List<LocationInfo> locationInfos = new ArrayList(0);
		List<LocationInfoVo> locationInfoVos = new ArrayList(0);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			PrpDuser user = (PrpDuser) getSession().getAttribute("userMsg");
			if(user !=null){
				locationInfos = locationInfoService.findLocationInfos(user.getRoleCode(),(String) getRequest().getParameter("comCode"));
			}
			Calendar c = Calendar.getInstance();
			for(LocationInfo l : locationInfos){
				LocationInfoVo vo = new LocationInfoVo();
				vo.setLngX(l.getLngX());
				vo.setLatY(l.getLatY());
				vo.setName(l.getName());
				vo.setCategory(l.getCategory());
				vo.setInformation(l.getInformation());
				locationInfoVos.add(vo);
			}
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
		System.out.println(">>>>query locationInfo");
		writeJSONData(locationInfoVos, "lngX","latY","name","category","information");
		return null;
	}

	//
	public String prepareMap(){
//		PrpDuser user = (PrpDuser) getSession().getAttribute("userMsg");
		getRequest().setAttribute("comCode", comCode);
		System.out.println(">>>>init  map >>>>" + comCode);
		return SUCCESS;
	}
	
	public String prepareAddLocationInfo(){
		return SUCCESS;
	}
	
	public String getLocationInfos() {
		//the manager query locationInfos
		locationInfoList = locationInfoService.findLocationInfos("1","");
		return SUCCESS;
	}
	
	/*public static void main(String args) {
		SinoMapAction action = new SinoMapAction();
		LocationInfo info = new LocationInfo();
		info.setCategory("1");
		info.setInformation("???e?????????????????????????????????????????????????????????");
		info.setInsertTimeForHis(new Date());
		info.setLatY("1232.232");
		info.setLngX("12343");
		info.setName("aaaa");
		info.setOperateTimeForHis(new Date());
		PrpAreaInfo areaInfo = new PrpAreaInfo();
		areaInfo.setComCode("admin");
		info.setPrpAreaInfo(areaInfo);
		action.setLocationInfo(info);
		action.addLocationInfo();
	}*/
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

	public LocationInfoService getLocationInfoService() {
		return locationInfoService;
	}

	public void setLocationInfoService(LocationInfoService locationInfoService) {
		this.locationInfoService = locationInfoService;
	}
	public List<LocationInfo> getLocationInfoList() {
		return locationInfoList;
	}

	public void setLocationInfoList(List<LocationInfo> locationInfoList) {
		this.locationInfoList = locationInfoList;
	}
}
