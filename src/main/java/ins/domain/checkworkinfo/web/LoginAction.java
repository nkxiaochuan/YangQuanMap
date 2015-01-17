package ins.domain.checkworkinfo.web;

import ins.framework.common.EncryptUtils;
import ins.platform.common.web.SinoMapBaseAction;
import ins.platform.schema.model.PrpDuser;
import ins.platform.schema.model.PrpMenu;
import ins.platform.service.facade.PrpMenuService;
import ins.platform.service.facade.PrpRoleService;
import ins.platform.service.facade.UserService;

import java.util.List;

import org.springframework.security.core.token.Sha512DigestUtils;
/**
 * 登录
 * @author
 *
 */
public class LoginAction extends SinoMapBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private PrpMenuService prpMenuService;
	private PrpRoleService prpRoleService;
	private List<PrpMenu> menuList;
	
	private String j_username;
	private String j_password;
	private String newPassword;



/*	public String login(){
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
	}*/

	public String logout() {    
        getSession().removeAttribute("user"); 
        System.out.println("logout");
        return SUCCESS;  
    }
	
	public String changePassword() {
		PrpDuser user = userService.findUserByUserName(j_username);
		String enpass = Sha512DigestUtils.shaHex(j_password);
		try {
			if (null != user&&enpass.equals(user.getPassword())) {
				user.setPassword(newPassword);
				userService.update(user);			
		        renderJSON(successClose("操作成功"));
			}else {
				renderJSON(feilure("用户名密码不匹配！"));
			}
		}catch(Exception e) {
			logger.error(e);
			e.printStackTrace();
			renderJSON(feilure("操作失败"));
		}
		return null;
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
	public String login(){
//		CacheService cache = CacheManager.getInstance("config");
		PrpDuser user = userService.findUserByUserName(j_username);
		String enpass = EncryptUtils.md5(j_password);
		if (null != user&&enpass.equals(user.getPassword())) {
			getSession().setAttribute("userMsg", user);
			getSession().setAttribute("userCode", user.getUserCode());
			getRequest().setAttribute("login", "1");
			return "login";
		}
		getRequest().setAttribute("login", "0");
		getRequest().setAttribute("login_em", "用户名密码不匹配！");
		return "error";
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
