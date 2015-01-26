package ins.map.web;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.map.schema.model.LocationInfo;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.LocationInfoService;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.common.web.SinoMapBaseAction;
import ins.platform.schema.model.PrpDuser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrpLocationInfoAction extends SinoMapBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocationInfoService locationInfoService;
	private PrpAreaInfoService prpAreaInfoService;
	private LocationInfo locationInfo;
	private List<LocationInfo> locationInfoList;
	private List<PrpAreaInfo> areaInfoList;
	private int totalCount;
	private String id;
	private String comCode;
	
	public String prepareAdd() {
		autoPackList();
		return SUCCESS;
	}
	
	public String add() {
		
		try {
			locationInfo.setInsertTimeForHis(new Date());
			locationInfo.setOperateTimeForHis(new Date());
			//loationInfo.setValidStatus("1");
			if(locationInfo.getPrpAreaInfo() == null || locationInfo.getPrpAreaInfo().getComCode() == null
					|| "".equals(locationInfo.getPrpAreaInfo().getComCode())) {
				renderJSON(feilure(getText("action.addFeilure.emptyArea")));
				return null;
			}
			this.locationInfoService.save(this.locationInfo);
			renderJSON(success(getText("action.addSuccess"),"locationManage","","closeCurrent",""));
		}catch(Exception e) {
			logger.equals(e);
			e.printStackTrace();
			renderJSON(feilure(getText("action.addFeilure")));
			
		}
		return null;
	}
	
	public String prepareUpdate() {
		this.locationInfo = this.locationInfoService.findLocationById(this.id);
		autoPackList();
		return SUCCESS;
	}
	
	public String update() {
		
		try {
			locationInfo.setOperateTimeForHis(new Date());
			this.locationInfoService.save(this.locationInfo);
			renderJSON(success(getText("action.editSuccess"),"locationManage","","closeCurrent",""));
		}catch(Exception e) {
			logger.equals(e);
			e.printStackTrace();
			renderJSON(feilure(getText("action.editFeilure")));
		}
		return null;
	}
	private void autoPackList() {
		PrpDuser user = (PrpDuser) getSession().getAttribute("userMsg");
		if(user != null && !"100000".equals(user.getUserCode())) {//super user
			areaInfoList = new ArrayList<PrpAreaInfo>();
			PrpAreaInfo areaInfo = new PrpAreaInfo();
			areaInfo.setComName(user.getPrpAreaInfo().getComName());
			areaInfo.setComCode(user.getPrpAreaInfo().getComCode());
			areaInfoList.add(areaInfo);
		}else {
			areaInfoList = prpAreaInfoService.findAreaInfos();
		}
	}
	public String delete() {
		try {
			String strId = getRequest().getParameter("id");
			this.locationInfoService.delete(strId);
			renderJSON(success(getText("action.deleteSuccess"),"locationManage","","",""));
		}catch(Exception e) {
			logger.error(e);
			e.printStackTrace();
			renderJSON(feilure(getText("action.deleteFeilure")));
		}
		return null;
	}
	
	public String query() {
		QueryRule queryRule = QueryRule.getInstance();
		if(this.locationInfo != null) {
			if (this.locationInfo.getId() != null
					&& !("".equals(this.locationInfo.getId()))) {
				queryRule.addEqual("id", this.locationInfo.getId());
			}
			if (this.locationInfo.getName() != null
					&& !("".equals(this.locationInfo.getName()))) {
				queryRule.addLike("name", this.locationInfo.getName());
			}
			if (this.locationInfo.getCategory() != null
					&& !("".equals(this.locationInfo.getCategory()))) {
				queryRule.addLike("category", this.locationInfo.getCategory());
			}
		}
		Page page = this.locationInfoService.findPrpLocationInfo(queryRule, this.pageNo,
				this.pageSize);
		this.locationInfoList = page.getResult();
		this.totalCount = (int) page.getTotalCount();
		return SUCCESS;
	}
	
	public String view() {
		this.locationInfo = this.locationInfoService.findLocationById(this.id);
		return SUCCESS;
	}

	public LocationInfoService getLocationInfoService() {
		return locationInfoService;
	}

	public void setLocationInfoService(LocationInfoService locationInfoService) {
		this.locationInfoService = locationInfoService;
	}

	public LocationInfo getLocationInfo() {
		return locationInfo;
	}

	public void setLocationInfo(LocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public List<LocationInfo> getLocationInfoList() {
		return locationInfoList;
	}

	public void setLocationInfoList(List<LocationInfo> locationInfoList) {
		this.locationInfoList = locationInfoList;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public List<PrpAreaInfo> getAreaInfoList() {
		return areaInfoList;
	}

	public void setAreaInfoList(List<PrpAreaInfo> areaInfoList) {
		this.areaInfoList = areaInfoList;
	}

	public PrpAreaInfoService getPrpAreaInfoService() {
		return prpAreaInfoService;
	}

	public void setPrpAreaInfoService(PrpAreaInfoService prpAreaInfoService) {
		this.prpAreaInfoService = prpAreaInfoService;
	}

}
