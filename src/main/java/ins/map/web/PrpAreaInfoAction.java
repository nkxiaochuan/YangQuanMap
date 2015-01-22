package ins.map.web;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.map.schema.model.LocationInfo;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.LocationInfoService;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.common.web.SinoMapBaseAction;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.UserService;

import java.util.Date;
import java.util.List;

public class PrpAreaInfoAction extends SinoMapBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PrpAreaInfoService prpAreaInfoService;
	private UserService userService;
	private LocationInfoService locationInfoService;
	private PrpAreaInfo prpAreaInfo;
	private List<PrpAreaInfo> prpAreaInfoList;
	private int totalCount;
	private String comCode;
	public String prepareAdd() {
		
		return SUCCESS;
	}
	
	public String add() {
		
		try {
			prpAreaInfo.setInsertTimeForHis(new Date());
			prpAreaInfo.setOperateTimeForHis(new Date());
			prpAreaInfo.setValidStatus("1");
			this.prpAreaInfoService.save(this.prpAreaInfo);
			renderJSON(success(getText("action.addSuccess"),"areaManage","","closeCurrent",""));
		}catch(Exception e) {
			logger.equals(e);
			e.printStackTrace();
			renderJSON(feilure(getText("action.addFeilure")));
			
		}
		return null;
	}
	
	public String prepareUpdate() {
		this.prpAreaInfo = this.prpAreaInfoService.findAreaInfoByComCode(this.comCode);
		return SUCCESS;
	}
	
	public String update() {
		
		try {
			prpAreaInfo.setOperateTimeForHis(new Date());
			this.prpAreaInfoService.updateAreaInfo(this.prpAreaInfo);
			renderJSON(success(getText("action.editSuccess"),"areaManage","","closeCurrent",""));
		}catch(Exception e) {
			logger.equals(e);
			e.printStackTrace();
			renderJSON(feilure(getText("action.editFeilure")));
		}
		return null;
	}
	
	public String delete() {
		try {
			String comCode = getRequest().getParameter("comCode");
			List<PrpDuser> userList = this.userService.findUserListByComCode(comCode);
			if(userList.size() > 0) {//can't delete comcode if there exist user under this comcode
				renderJSON(feilure(getText("action.deleteFeilure.hasUser")));
				return null;
			}
			List<LocationInfo> locationList = this.locationInfoService.findLocationByComCode(comCode);
			if(locationList.size() > 0) {//can't delete comcode is there exist location under this comcode
				renderJSON(feilure(getText("action.deleteFeilure.hasLocation")));
				return null;
			}
			this.prpAreaInfoService.delete(comCode);
			renderJSON(success(getText("action.deleteSuccess"),"areaManage","","",""));
		}catch(Exception e) {
			logger.error(e);
			e.printStackTrace();
			renderJSON(feilure(getText("action.deleteFeilure")));
		}
		return null;
	}
	
	public String query() {
		QueryRule queryRule = QueryRule.getInstance();
		
		if (this.prpAreaInfo != null && (this.prpAreaInfo.getComCode() != null)
				&& (!("".equals(this.prpAreaInfo.getComCode())))) {
			queryRule.addEqual("comCode", this.prpAreaInfo.getComCode());
		}
		if (this.prpAreaInfo != null && (this.prpAreaInfo.getComName() != null)
				&& (!("".equals(this.prpAreaInfo.getComName())))) {
			queryRule.addLike("comName", this.prpAreaInfo.getComName());
		}
		queryRule.addNotEqual("comCode", "10000000");//10000000 is just a base comcode for superuser
		Page page = this.prpAreaInfoService.findPrpAreaInfo(queryRule, this.pageNo,
				this.pageSize);
		this.prpAreaInfoList = page.getResult();
		this.totalCount = (int) page.getTotalCount();
		return SUCCESS;
	}
	
	public String view() {
		this.prpAreaInfo = this.prpAreaInfoService.findAreaInfoByComCode(this.comCode);
		return SUCCESS;
	}
	
	

	public PrpAreaInfoService getPrpAreaInfoService() {
		return prpAreaInfoService;
	}

	public void setPrpAreaInfoService(PrpAreaInfoService prpAreaInfoService) {
		this.prpAreaInfoService = prpAreaInfoService;
	}

	public PrpAreaInfo getPrpAreaInfo() {
		return prpAreaInfo;
	}

	public void setPrpAreaInfo(PrpAreaInfo prpAreaInfo) {
		this.prpAreaInfo = prpAreaInfo;
	}

	public List<PrpAreaInfo> getPrpAreaInfoList() {
		return prpAreaInfoList;
	}

	public void setPrpAreaInfoList(List<PrpAreaInfo> prpAreaInfoList) {
		this.prpAreaInfoList = prpAreaInfoList;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public LocationInfoService getLocationInfoService() {
		return locationInfoService;
	}

	public void setLocationInfoService(LocationInfoService locationInfoService) {
		this.locationInfoService = locationInfoService;
	}
	
}
