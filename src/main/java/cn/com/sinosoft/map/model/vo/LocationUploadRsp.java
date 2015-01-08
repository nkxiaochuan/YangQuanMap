package cn.com.sinosoft.map.model.vo;

public class LocationUploadRsp {

	private HeadMsg headMsg;
	private String eachTime;
	public String getEachTime() {
		return eachTime;
	}
	public void setEachTime(String eachTime) {
		this.eachTime = eachTime;
	}
	public void setHeadMsg(HeadMsg headMsg) {
		this.headMsg = headMsg;
	}
	public HeadMsg getHeadMsg() {
		return headMsg;
	}
}
