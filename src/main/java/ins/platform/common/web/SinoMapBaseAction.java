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
	/**
	 * 
	 * @param message
	 * @param navTabId
	 * @param rel
	 * @param callbackType
	 * @param forwarUrl
	 * @return
	 */
	public String success(String message, String navTabId, String rel, String callbackType, String forwarUrl) {
		JSONObject jsonObject = new JSONObject();
        jsonObject.put("statusCode", "200");
        jsonObject.put("message", message);
        jsonObject.put("navTabId", navTabId);
        jsonObject.put("rel", rel);
        jsonObject.put("callbackType", callbackType);
        jsonObject.put("forwardUrl", forwarUrl);
        return jsonObject.toString();
	}
	
	public String success(String successReason,String navTabId) {
		JSONObject jsonObject = new JSONObject();
        jsonObject.put("statusCode", "200");
        jsonObject.put("message", successReason);
        jsonObject.put("navTabId", navTabId);
        jsonObject.put("rel", "");
        jsonObject.put("callbackType", "");
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
