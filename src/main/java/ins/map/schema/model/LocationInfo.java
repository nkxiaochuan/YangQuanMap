package ins.map.schema.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LOCATIONINFO")
public class LocationInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String lngX;
	private String latY;
	private String userCode;
	private String userName;
	private String phoneNumber;
	private Date insertTimeHis;
	private Date updateTimehis;
	private String isValid;
	
	@Id
	@Column(name = "ID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(name="LNGX")
	public String getLngX() {
		return lngX;
	}
	public void setLngX(String lngX) {
		this.lngX = lngX;
	}
	@Column(name="LATY")
	public String getLatY() {
		return latY;
	}
	public void setLatY(String latY) {
		this.latY = latY;
	}
	@Column(name="USERCODE")
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	@Column(name="USERNAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="PHONENUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INSERTTIMEHIS")
	public Date getInsertTimeHis() {
		return insertTimeHis;
	}
	public void setInsertTimeHis(Date insertTimeHis) {
		this.insertTimeHis = insertTimeHis;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATETIMEHIS")
	public Date getUpdateTimehis() {
		return updateTimehis;
	}
	public void setUpdateTimehis(Date updateTimehis) {
		this.updateTimehis = updateTimehis;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	@Column(name="ISVALID")
	public String getIsValid() {
		return isValid;
	}
	
}
