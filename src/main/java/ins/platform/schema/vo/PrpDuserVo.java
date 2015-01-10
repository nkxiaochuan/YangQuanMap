package ins.platform.schema.vo;

import java.io.Serializable;
import java.util.Date;

public class PrpDuserVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userCode;
	private Integer version;
	private String comCode;
	private String userName;
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getPasswdSetDate() {
		return passwdSetDate;
	}
	public void setPasswdSetDate(Date passwdSetDate) {
		this.passwdSetDate = passwdSetDate;
	}
	public Date getPasswdExpireDate() {
		return passwdExpireDate;
	}
	public void setPasswdExpireDate(Date passwdExpireDate) {
		this.passwdExpireDate = passwdExpireDate;
	}
	public String getNewUserCode() {
		return newUserCode;
	}
	public void setNewUserCode(String newUserCode) {
		this.newUserCode = newUserCode;
	}
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	public Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	private String password;
	private Date passwdSetDate;
	private Date passwdExpireDate;
	private String newUserCode;
	private String validStatus;
	private String articleCode;
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
}
