package ins.map.schema.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SIMPCONFIG")
public class SimpConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String configCode;
	private String configValue;
	private String configDesc;
	
	@Id
	@Column(name="configCode")
	public String getConfigCode() {
		return configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	@Column(name="configValue")
	public String getConfigValue() {
		return configValue;
	}
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	@Column(name="configDesc")
	public String getConfigDesc() {
		return configDesc;
	}
	public void setConfigDesc(String configDesc) {
		this.configDesc = configDesc;
	}
}
