package cn.com.sinosoft.map.model.pojo;

import java.util.Date;

public class LocationInfoVo {

	private String id;
	private String lngX;
	private String latY;
	private String userCode;
	private String userName;
	private String phoneNumber;
	private String insertTimeHis;
	private String updateTimehis;
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
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
