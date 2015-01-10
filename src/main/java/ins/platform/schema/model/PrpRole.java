package ins.platform.schema.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRPROLE")
public class PrpRole implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleCode;
	private String menuCodeArray;
	private String info;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private String validStatus;
	@Id
	@Column(name = "ROLECODE", unique = true, nullable = false, length = 8)
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	@Column(name = "MENUCODEARRAY")
	public String getMenuCodeArray() {
		return menuCodeArray;
	}
	public void setMenuCodeArray(String menuCodeArray) {
		this.menuCodeArray = menuCodeArray;
	}
	@Column(name="INFO")
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "INSERTTIMEFORHIS",insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "OPERATETIMEFORHIS",insertable = false, updatable = false)
	public Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	@Column(name="VALIDSTATUS")
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
}
