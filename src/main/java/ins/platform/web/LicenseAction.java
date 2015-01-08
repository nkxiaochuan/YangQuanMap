package ins.platform.web;

import ins.framework.web.Struts2Action;
import ins.platform.schema.model.UtiLicense;
import ins.platform.service.facade.LicenseService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class LicenseAction extends Struts2Action {
	private LicenseService licenseService;
	private UtiLicense utiLicense;
	private String serialNo;
	private String startTime;
	private String endTime;

	public void setLicenseService(LicenseService licenseService) {
		this.licenseService = licenseService;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public UtiLicense getUtiLicense() {
		return this.utiLicense;
	}

	public void setUtiLicense(UtiLicense utiLicense) {
		this.utiLicense = utiLicense;
	}

	public String query() {
		this.utiLicense = this.licenseService.findValidLicense();

		if (this.utiLicense != null) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			this.startTime = df.format(this.utiLicense.getValidStartDate());
			this.endTime = df.format(this.utiLicense.getValidEndDate());
		}
//		this.serialNo = EnvUtils.generateSerialNo();
		this.serialNo = "111";
		return "success";
	}

	public String checkAndSave() {
		this.utiLicense.setProductCode("codecheck");
		this.utiLicense.setProductVersion("1.0");
//		this.utiLicense.setSerialNo(EnvUtils.generateSerialNo());
		this.utiLicense.setSerialNo("111");

		this.licenseService.saveLicense(this.utiLicense);
		return "success";
	}
}