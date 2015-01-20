package ins.domain.checkworkinfo.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.token.Sha512DigestUtils;

import ins.framework.web.Struts2Action;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.PrpRoleService;
import ins.platform.service.facade.UserService;
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
	
	private List<PrpAreaInfo> prpAreaInfos;



	public List<PrpAreaInfo> getPrpAreaInfos() {
		return prpAreaInfos;
	}



	public void setPrpAreaInfos(List<PrpAreaInfo> prpAreaInfos) {
		this.prpAreaInfos = prpAreaInfos;
	}



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
		String enpass = Sha512DigestUtils.shaHex(j_password);
		if (null != user&&enpass.equals(user.getPassword())) {
			if(!"1".equals(user.getValidStatus())) {//unvalid user
				getRequest().setAttribute("login", "0");
				getRequest().setAttribute("login_em", getText("action.valid.zero"));
				return "error";
			}
			getSession().setAttribute("userMsg", user);
			getSession().setAttribute("userCode", user.getUserCode());
			getRequest().setAttribute("login", "1");
			getRequest().setAttribute("roleCode", user.getRoleCode());
			
			
			prpAreaInfos = new ArrayList<PrpAreaInfo>();
			if(user.getRoleCode() !=null && "0".equals(user.getRoleCode().trim())){
				prpAreaInfos.add(user.getPrpAreaInfo());
			}else{
				prpAreaInfos = prpAreaInfoService.findAreaInfos();
			}
			return "login";
		}
		getRequest().setAttribute("login", "0");
		getRequest().setAttribute("login_em", getText("action.valid.wrong"));
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
