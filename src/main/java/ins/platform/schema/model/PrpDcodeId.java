package ins.platform.schema.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrpDcodeId implements Serializable {
	private static final long serialVersionUID = 1L;
	private String codeType;
	private String codeCode;

	@Column(name = "CODETYPE", nullable = false, length = 20)
	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	@Column(name = "CODECODE", nullable = false, length = 30)
	public String getCodeCode() {
		return this.codeCode;
	}

	public void setCodeCode(String codeCode) {
		this.codeCode = codeCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}

		if (!(other instanceof PrpDcodeId)) {
			return false;
		}
		PrpDcodeId castOther = (PrpDcodeId) other;
		return ((((getCodeType() == castOther.getCodeType()) || ((getCodeType() != null)
				&& (castOther.getCodeType() != null) && (getCodeType()
				.equals(castOther.getCodeType()))))) && (((getCodeCode() == castOther
				.getCodeCode()) || ((getCodeCode() != null)
				&& (castOther.getCodeCode() != null) && (getCodeCode()
				.equals(castOther.getCodeCode()))))));
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result
				+ ((getCodeType() == null) ? 0 : getCodeType().hashCode());
		result = 37 * result
				+ ((getCodeCode() == null) ? 0 : getCodeCode().hashCode());
		return result;
	}
}