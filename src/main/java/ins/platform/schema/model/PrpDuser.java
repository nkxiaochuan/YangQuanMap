package ins.platform.schema.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "PRPDUSER")
public class PrpDuser implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userCode;
	private Integer version;
	private PrpDcompany prpDcompany;
	private String userName;
	private String password;
	private Date passwdSetDate;
	private Date passwdExpireDate;
	private String newUserCode;
	private String validStatus;
	private String articleCode;
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;

	@Id
	@Column(name = "USERCODE", unique = true, nullable = false, length = 10)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ComCode", nullable = false)
	public PrpDcompany getPrpDcompany() {
		return this.prpDcompany;
	}

	public void setPrpDcompany(PrpDcompany prpDcompany) {
		this.prpDcompany = prpDcompany;
	}

	@Column(name = "USERNAME", length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD", length = 128)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PASSWDSETDATE")
	public Date getPasswdSetDate() {
		return this.passwdSetDate;
	}

	public void setPasswdSetDate(Date passwdSetDate) {
		this.passwdSetDate = passwdSetDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PASSWDEXPIREDATE")
	public Date getPasswdExpireDate() {
		return this.passwdExpireDate;
	}

	public void setPasswdExpireDate(Date passwdExpireDate) {
		this.passwdExpireDate = passwdExpireDate;
	}

	@Column(name = "NEWUSERCODE", nullable = false, length = 10)
	public String getNewUserCode() {
		return this.newUserCode;
	}

	public void setNewUserCode(String newUserCode) {
		this.newUserCode = newUserCode;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length = 1)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Column(name = "ARTICLECODE", length = 8)
	public String getArticleCode() {
		return this.articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	@Column(name = "FLAG", length = 2)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSERTTIMEFORHIS",insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OPERATETIMEFORHIS", insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
}