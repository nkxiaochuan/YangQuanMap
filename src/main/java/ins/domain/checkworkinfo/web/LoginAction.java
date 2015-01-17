package ins.domain.checkworkinfo.web;

import org.springframework.security.core.token.Sha512DigestUtils;

import ins.framework.common.EncryptUtils;
import ins.platform.common.web.SinoMapBaseAction;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.PrpMenuService;
import ins.platform.service.facade.PrpRoleService;
import ins.platform.service.facade.UserService;
/**
 * ???
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
	public PrpRoleService getPrpRoleService() {
		return prpRoleService;
	}


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
	public void setPrpRoleService(PrpRoleService prpRoleService) {
		this.prpRoleService = prpRoleService;
	}



	public PrpMenuService getPrpMenuService() {
		return prpMenuService;
	}



	public void setPrpMenuService(PrpMenuService prpMenuService) {
		this.prpMenuService = prpMenuService;
	}



	public UserService getUserService() {
		return userService;
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	private String j_username;
	private String j_password;
	private String newPassword;
	 
	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
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



	public String login(){
//		CacheService cache = CacheManager.getInstance("config");
		PrpDuser user = userService.findUserByUserName(j_username);
		String enpass = EncryptUtils.md5(j_password);
		if (null != user&&enpass.equals(user.getPassword())) {
			getSession().setAttribute("userMsg", user);
			getSession().setAttribute("userCode", user.getUserCode());
			getRequest().setAttribute("login", "1");
			getRequest().setAttribute("roleType", "1");
			getRequest().setAttribute("areaID", "111");
			getRequest().setAttribute("areaName", "阳泉测试区域菜单");
			//初始化菜单  gebin
//			PrpRole prpRole = prpRoleService.findRlolesByRoleCode(user.getRoleCode());
//			List<PrpMenu> allMenus = menuService.getMenuList(prpRole.getMenuCodeArray());
//			for(PrpMenu menu:allMenus){
//				
//			}
			//初始化菜单  end
			return "login";
		}
		getRequest().setAttribute("login", "0");
		getRequest().setAttribute("login_em", "用户或密码输入错误！");
		return "error";
	}
	
	public String logout() {    
		getRequest().setAttribute("login", "1");
		getSession().removeAttribute("userCode");
        getSession().removeAttribute("userMsg");  
        return SUCCESS;  
    }
	
	public String prepareChangePassword(){
		
		return SUCCESS; 
	}

}
