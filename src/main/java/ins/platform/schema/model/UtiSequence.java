package ins.platform.schema.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UTISEQUENCE")
public class UtiSequence implements Serializable {
	private static final long serialVersionUID = 1L;
	private String genName;
	private BigDecimal genValue;

	@Id
	@Column(name = "GENNAME", unique = true, nullable = false)
	public String getGenName() {
		return this.genName;
	}

	public void setGenName(String genName) {
		this.genName = genName;
	}

	@Column(name = "GENVALUE", nullable = false, precision = 20, scale = 0)
	public BigDecimal getGenValue() {
		return this.genValue;
	}

	public void setGenValue(BigDecimal genValue) {
		this.genValue = genValue;
	}
}