package ins.domain.checkworkinfo.web;

import ins.framework.common.EncryptUtils;
import ins.framework.web.Struts2Action;
import ins.platform.schema.model.PrpDuser;
import ins.platform.schema.model.PrpMenu;
import ins.platform.schema.model.PrpRole;
import ins.platform.service.facade.PrpMenuService;
import ins.platform.service.facade.PrpRoleService;
import ins.platform.service.facade.UserService;

import java.util.List;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.security.core.token.Sha512DigestUtils;
/**
 * 登录
 * @author
 *
 */
public class LoginAction extends Struts2Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger("LoginAction.class");
	private UserService userService;
	private PrpMenuService prpMenuService;
	private PrpRoleService prpRoleService;
	private List<PrpMenu> menuList;
	
	private String j_username;
	private String j_password;
	private String newPassword;



	public String login(){
		PrpDuser user = userService.findUserByUserName(j_username);
		String enpass = Sha512DigestUtils.shaHex(j_password);
		if (null != user&&enpass.equals(user.getPassword())) {
			getSession().setAttribute("user", user);
			getRequest().setAttribute("login", "1");
			PrpRole role = prpRoleService.getRoleByRoleCode(user.getRoleCode());
			menuList = prpMenuService.getMenuList(role.getMenuCodeArray());
			return "login";
		}
		getRequest().setAttribute("login", "0");
		getRequest().setAttribute("login_em", "用户名密码不匹配！");
		return "error";
	}

	public String logout() {    
        getSession().removeAttribute("user");  
        return SUCCESS;  
    }
	
	public String changePassword() {
		PrpDuser user = userService.findUserByUserName(j_username);
		String enpass = Sha512DigestUtils.shaHex(j_password);
		try {
			if (null != user&&enpass.equals(user.getPassword())) {
				user.setPassword(newPassword);
				userService.update(user);			
		        renderJSON(changePasswordSuccess());
			}else {
				renderJSON(changePasswordFeilure("用户名密码不匹配！"));
			}
		}catch(Exception e) {
			log.error(e);
			e.printStackTrace();
			renderJSON(changePasswordFeilure("操作失败"));
		}
		return null;
	}
	private String changePasswordSuccess() {
		JSONObject jsonObject = new JSONObject();
        jsonObject.put("statusCode", "200");
        jsonObject.put("message", "操作成功");
        jsonObject.put("navTabId", "");
        jsonObject.put("rel", "");
        jsonObject.put("callbackType", "closeCurrent");
        jsonObject.put("forwardUrl", "");
        return jsonObject.toString();
	}
	
	private String changePasswordFeilure(String feilureReason) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("statusCode", "300");
        jsonObject.put("message", feilureReason);
        return jsonObject.toString();
	}
	
	public List<PrpMenu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<PrpMenu> menuList) {
		this.menuList = menuList;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}	 
	public String getJ_username() {
		return j_username;
	}

	public void setJ_username(String jUsername) {
		j_username = jUsername;
	}
	public String getJ_password() {
		return j_password;
	}

	public void setJ_password(String jPassword) {
		j_password = jPassword;
	}
	public PrpMenuService getPrpMenuService() {
		return prpMenuService;
	}

	public void setPrpMenuService(PrpMenuService prpMenuService) {
		this.prpMenuService = prpMenuService;
	}

	public PrpRoleService getPrpRoleService() {
		return prpRoleService;
	}

	public void setPrpRoleService(PrpRoleService prpRoleService) {
		this.prpRoleService = prpRoleService;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
