package ins.domain.checkworkinfo.web;

import ins.framework.web.Struts2Action;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.UserService;
import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.EncryptUtils;
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
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	private String j_username;
	private String j_password;
	 
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



	public String login(){
//		CacheService cache = CacheManager.getInstance("config");
		PrpDuser user = userService.findUserByUserName(j_username);
		String enpass = EncryptUtils.md5(j_password);
		if (null != user&&enpass.equals(user.getPassword())) {
			getSession().setAttribute("user", user);
			getRequest().setAttribute("login", "1");
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

}
