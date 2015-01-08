package cn.com.sinosoft.map.model.vo;

import java.util.Date;

public class LocationUploadReq {

	private String lngX;
	private String latY;
	private String userCode;
	private String userName;
	private String phoneNumber;
	private String flag;//0:开始定位；1：循环定位；2：停止定位
	private String flowinTime;
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
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlowinTime(String flowinTime) {
		this.flowinTime = flowinTime;
	}
	public String getFlowinTime() {
		return flowinTime;
	}
}
