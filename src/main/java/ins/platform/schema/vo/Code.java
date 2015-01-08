package ins.platform.schema.vo;

import java.io.Serializable;

public class Code implements Serializable {
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;

	public Code() {
	}

	public Code(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}