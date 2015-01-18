package ins.platform.schema.model;

import ins.map.schema.model.PrpAreaInfo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRPDUSER")
public class PrpDuser implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userCode;
	private PrpAreaInfo prpAreaInfo;
	private String roleCode;
	private String userName;
	private String password;
	private String validStatus;
	private String info;
	private Date insertTimeForHis;
	private Date operateTimeForHis;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USERCODE", unique = true, nullable = false, length = 6)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	@ManyToOne(targetEntity=PrpAreaInfo.class)
	@JoinColumn(name="comCode")
	public PrpAreaInfo getPrpAreaInfo() {
		return this.prpAreaInfo;
	}

	public void setPrpAreaInfo(PrpAreaInfo prpAreaInfo) {
		this.prpAreaInfo = prpAreaInfo;
	}
	
	@Column(name="ROLECODE")
	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	@Column(name = "USERNAME", length = 30, nullable = false)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD", length = 128, nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length = 1)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Column(name = "INFO")
	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
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