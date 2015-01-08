package ins.platform.service.facade;

import ins.framework.common.Page;
import ins.platform.schema.vo.Code;
import java.util.List;
import java.util.Map;

public abstract interface CodeService {
	public static final String USERCODE = "UserCode";
	public static final String COMCODE = "ComCode";
	public static final String VALIDFLAG_Y = "1";
	public static final String VALIDFLAG_N = "0";

	public abstract String translateCode(String paramString1,
			String paramString2, String paramString3, String paramString4);

	public abstract Map<String, String> listCodes(String paramString1,
			String paramString2, String paramString3);

	public abstract Map<String, String> listCodes(String paramString1,
			String paramString2, String paramString3, String paramString4);

	public abstract List<Code> listCodeList(String paramString1,
			String paramString2, String paramString3);

	public abstract List<Code> listOrderCodeList(String paramString1,
			String paramString2, String paramString3, String paramString4);

	public abstract Page listCodeSelect(String paramString1,
			String paramString2, String paramString3, String paramString4,
			int paramInt1, int paramInt2, String paramString5,
			String paramString6, String paramString7);

	public abstract List listNodes(String paramString1, String paramString2);
}