package ins.domain.checkworkinfo.web;


import ins.framework.web.Struts2Action;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.PrpRoleService;
import ins.platform.service.facade.UserService;
import ins.framework.common.EncryptUtils;
/**
 * ???
 * @author
 *
 */
public class LoginAction extends Struts2Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private PrpRoleService prpRoleService;
	private PrpAreaInfoService prpAreaInfoService;
	public PrpAreaInfoService getPrpAreaInfoService() {
		return prpAreaInfoService;
	}



	public void setPrpAreaInfoService(PrpAreaInfoService prpAreaInfoService) {
		this.prpAreaInfoService = prpAreaInfoService;
	}



	public PrpRoleService getPrpRoleService() {
		return prpRoleService;
	}



	public void setPrpRoleService(PrpRoleService prpRoleService) {
		this.prpRoleService = prpRoleService;
	}

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
			getSession().setAttribute("userMsg", user);
			getSession().setAttribute("userCode", user.getUserCode());
			getRequest().setAttribute("login", "1");
			getRequest().setAttribute("roleCode", user.getRoleCode());
			
			if(user.getRoleCode() !=null && "0".equals(user.getRoleCode().trim())){
			}
			getRequest().setAttribute("comCode", "111");
			getRequest().setAttribute("comName", "阳泉测试区域菜单");
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
