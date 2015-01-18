package cn.com.sinosoft.map.model.pojo;

import java.util.Date;

public class LocationInfoVo {

	private String id;
	private String lngX;
	private String latY;
	private String name;
	private String category;
	private String information;
	private String insertTimeHis;
	private String updateTimehis;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLngX() {
		return lngX;
	}
	public void setLngX(String lngX) {
		this.lngX = lngX;
	}
	public String getLatY() {
		return latY;
	}
	public void setLatY(String latY) {
		this.latY = latY;
	}
	public String getInsertTimeHis() {
		return insertTimeHis;
	}
	public void setInsertTimeHis(String insertTimeHis) {
		this.insertTimeHis = insertTimeHis;
	}
	public String getUpdateTimehis() {
		return updateTimehis;
	}
	public void setUpdateTimehis(String updateTimehis) {
		this.updateTimehis = updateTimehis;
	}
	public String getIsValid() {
		return isValid;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	private String isValid;
}
