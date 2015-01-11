package ins.map.schema.model;

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
@Table(name = "LOCATIONINFO")
public class LocationInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String lngX;
	private String latY;
	private PrpAreaInfo prpAreaInfo;
	private String name;
	private String category;
	private String information;
	private String extension;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private String validStatus;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(name="LNGX", nullable = false)
	public String getLngX() {
		return lngX;
	}
	public void setLngX(String lngX) {
		this.lngX = lngX;
	}
	@Column(name="LATY", nullable = false)
	public String getLatY() {
		return latY;
	}
	public void setLatY(String latY) {
		this.latY = latY;
	}
	@ManyToOne(targetEntity=PrpAreaInfo.class)
	@JoinColumn(name="comCode")
	public PrpAreaInfo getPrpAreaInfo() {
		return prpAreaInfo;
	}
	public void setPrpAreaInfo(PrpAreaInfo prpAreaInfo) {
		this.prpAreaInfo = prpAreaInfo;
	}
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="CATEGORY")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Column(name="INFORMATION")
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Column(name="EXTENSION")
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
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
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	@Column(name="VALIDSTATUS")
	public String getValidStatus() {
		return validStatus;
	}
	
}
