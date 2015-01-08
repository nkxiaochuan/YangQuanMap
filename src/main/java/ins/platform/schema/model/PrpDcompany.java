package ins.platform.schema.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "PRPDCOMPANY")
public class PrpDcompany implements Serializable {
	private static final long serialVersionUID = 1L;
	private String comCode;
	private Integer version;
	private String comCName;
	private String comEName;
	private String addressCName;
	private String addressEName;
	private String postCode;
	private String phoneNumber;
	private String faxNumber;
	private String upperComCode;
	private String insurerName;
	private String comType;
	private String manager;
	private String accountant;
	private String remark;
	private String newComCode;
	private String validStatus;
	private String acntUnit;
	private String articleCode;
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private List<PrpDuser> prpDusers;

	public PrpDcompany() {
		this.prpDusers = new ArrayList(0);
	}

	@Id
	@Column(name = "COMCODE", unique = true, nullable = false, length = 8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "COMCNAME", nullable = false, length = 250)
	public String getComCName() {
		return this.comCName;
	}

	public void setComCName(String comCName) {
		this.comCName = comCName;
	}

	@Column(name = "COMENAME", length = 250)
	public String getComEName() {
		return this.comEName;
	}

	public void setComEName(String comEName) {
		this.comEName = comEName;
	}

	@Column(name = "ADDRESSCNAME", length = 250)
	public String getAddressCName() {
		return this.addressCName;
	}

	public void setAddressCName(String addressCName) {
		this.addressCName = addressCName;
	}

	@Column(name = "ADDRESSENAME", length = 250)
	public String getAddressEName() {
		return this.addressEName;
	}

	public void setAddressEName(String addressEName) {
		this.addressEName = addressEName;
	}

	@Column(name = "POSTCODE", length = 6)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "PHONENUMBER", length = 30)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "FAXNUMBER", length = 20)
	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	@Column(name = "UPPERCOMCODE", length = 8)
	public String getUpperComCode() {
		return this.upperComCode;
	}

	public void setUpperComCode(String upperComCode) {
		this.upperComCode = upperComCode;
	}

	@Column(name = "INSURERNAME", length = 250)
	public String getInsurerName() {
		return this.insurerName;
	}

	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}

	@Column(name = "COMTYPE", length = 1)
	public String getComType() {
		return this.comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	@Column(name = "MANAGER", length = 40)
	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Column(name = "ACCOUNTANT", length = 40)
	public String getAccountant() {
		return this.accountant;
	}

	public void setAccountant(String accountant) {
		this.accountant = accountant;
	}

	@Column(name = "REMARK", length = 40)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "NEWCOMCODE", nullable = false, length = 8)
	public String getNewComCode() {
		return this.newComCode;
	}

	public void setNewComCode(String newComCode) {
		this.newComCode = newComCode;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length = 1)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Column(name = "ACNTUNIT", length = 8)
	public String getAcntUnit() {
		return this.acntUnit;
	}

	public void setAcntUnit(String acntUnit) {
		this.acntUnit = acntUnit;
	}

	@Column(name = "ARTICLECODE", length = 30)
	public String getArticleCode() {
		return this.articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	@Column(name = "FLAG", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSERTTIMEFORHIS",  insertable = false, updatable = false)
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

	@OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "prpDcompany")
	public List<PrpDuser> getPrpDusers() {
		return this.prpDusers;
	}

	public void setPrpDusers(List<PrpDuser> prpDusers) {
		this.prpDusers = prpDusers;
	}
}