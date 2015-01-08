package ins.platform.schema.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPDCODE_PK", allocationSize = 1)
@Table(name = "PRPDCODE")
public class PrpDcode implements Serializable {
	private static final long serialVersionUID = 1L;
	private PrpDcodeId id;
	private Integer version;
	private String codeCName;
	private String codeEName;
	private String newCodeCode;
	private String validStatus;
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;

	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@AttributeOverrides( {
			@javax.persistence.AttributeOverride(name = "CODETYPE", column = @Column(name = "CODETYPE", nullable = false, length = 20)),
			@javax.persistence.AttributeOverride(name = "CODECODE", column = @Column(name = "CODECODE", nullable = false, length = 30)) })
	public PrpDcodeId getId() {
		return this.id;
	}

	public void setId(PrpDcodeId id) {
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

	@Column(name = "CODECNAME", length = 250)
	public String getCodeCName() {
		return this.codeCName;
	}

	public void setCodeCName(String codeCName) {
		this.codeCName = codeCName;
	}

	@Column(name = "CODEENAME", length = 250)
	public String getCodeEName() {
		return this.codeEName;
	}

	public void setCodeEName(String codeEName) {
		this.codeEName = codeEName;
	}

	@Column(name = "NEWCODECODE", nullable = false, length = 15)
	public String getNewCodeCode() {
		return this.newCodeCode;
	}

	public void setNewCodeCode(String newCodeCode) {
		this.newCodeCode = newCodeCode;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length = 1)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Column(name = "FLAG", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSERTTIMEFORHIS", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OPERATETIMEFORHIS",  insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
}