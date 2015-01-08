package ins.platform.schema.vo;

import java.io.Serializable;

public class CodeCondition implements Serializable {
	private String codeType;
	private String typeParam;
	private String extraCond;
	private String language;
	private String userCode;
	private String query;
	private String riskCode;
	private String type;

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeParam() {
		return this.typeParam;
	}

	public void setTypeParam(String typeParam) {
		this.typeParam = typeParam;
	}

	public String getExtraCond() {
		return this.extraCond;
	}

	public void setExtraCond(String extraCond) {
		this.extraCond = extraCond;
	}
}