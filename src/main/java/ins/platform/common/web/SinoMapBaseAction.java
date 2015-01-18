package ins.platform.common.web;

import ins.framework.web.Struts2Action;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class SinoMapBaseAction extends Struts2Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map cache = new HashMap();

	public SinoMapBaseAction() {
		this.pageSize = 15;
	}
	public Map getCache() {
		return cache;
	}

	public void setCache(Map cache) {
		this.cache = cache;
	}

	public String successClose(String successReason) {
		JSONObject jsonObject = new JSONObject();
        jsonObject.put("statusCode", "200");
        jsonObject.put("message", successReason);
        jsonObject.put("navTabId", "");
        jsonObject.put("rel", "");
        jsonObject.put("callbackType", "closeCurrent");
        jsonObject.put("forwardUrl", "");
        return jsonObject.toString();
	}
	
	public String feilure(String feilureReason) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("statusCode", "300");
        jsonObject.put("message", feilureReason);
        return jsonObject.toString();
	}
}
