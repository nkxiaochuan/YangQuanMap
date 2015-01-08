			package ins.platform.schema.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "UTILICENSE_PK", allocationSize = 1)
@Table(name = "UTILICENSE")
public class UtiLicense implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer version;
	private String productCode;
	private String productVersion;
	private String userName;
	private String serialNo;
	private Date validStartDate;
	private Date validEndDate;
	private String cdKey;
	private Date insertTimeForHis;
	private Date operateTimeForHis;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "PRODUCTCODE", nullable = false, length = 80)
	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name = "PRODUCTVERSION", nullable = false, length = 80)
	public String getProductVersion() {
		return this.productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	@Column(name = "USERNAME", nullable = false, length = 80)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "SERIALNO", nullable = false)
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VALIDSTARTDATE", nullable = false)
	public Date getValidStartDate() {
		return this.validStartDate;
	}

	public void setValidStartDate(Date validStartDate) {
		this.validStartDate = validStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VALIDENDDATE", nullable = false)
	public Date getValidEndDate() {
		return this.validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	@Column(name = "CDKEY", nullable = false)
	public String getCdKey() {
		return this.cdKey;
	}

	public void setCdKey(String cdKey) {
		this.cdKey = cdKey;
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
}