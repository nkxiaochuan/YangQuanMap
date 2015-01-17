package ins.platform.web;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.common.web.SinoMapBaseAction;
import ins.platform.schema.model.PrpDuser;
import ins.platform.schema.model.PrpRole;
import ins.platform.service.facade.PrpRoleService;
import ins.platform.service.facade.UserService;

import java.util.Date;
import java.util.List;

import org.springframework.security.core.token.Sha512DigestUtils;

import net.sf.json.JSONObject;

public class UserAction extends SinoMapBaseAction {
	private UserService userService;
	private PrpRoleService prpRoleService;
	private PrpAreaInfoService prpAreaInfoService;
	private PrpDuser prpDuser;
	private String userCode;
	private String newPassword;
	private String password;
	private List<PrpDuser> userList;
	private List<PrpRole> roleList;
	private List<PrpAreaInfo> areaInfoList;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public PrpAreaInfoService getPrpAreaInfoService() {
		return prpAreaInfoService;
	}

	public void setPrpAreaInfoService(PrpAreaInfoService prpAreaInfoService) {
		this.prpAreaInfoService = prpAreaInfoService;
	}

	public List<PrpAreaInfo> getAreaInfoList() {
		return areaInfoList;
	}

	public void setAreaInfoList(List<PrpAreaInfo> areaInfoList) {
		this.areaInfoList = areaInfoList;
	}

	public PrpRoleService getPrpRoleService() {
		return prpRoleService;
	}

	public void setPrpRoleService(PrpRoleService prpRoleService) {
		this.prpRoleService = prpRoleService;
	}

	public List<PrpRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<PrpRole> roleList) {
		this.roleList = roleList;
	}

	public List<PrpDuser> getUserList() {
		return userList;
	}

	public void setUserList(List<PrpDuser> userList) {
		this.userList = userList;
	}

	private int totalCount;
	
	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public UserService getUserService() {
		return this.userService;
	}

	public PrpDuser getPrpDuser() {
		return this.prpDuser;
	}

	public void setPrpDuser(PrpDuser prpDuser) {
		this.prpDuser = prpDuser;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String query() {
		QueryRule queryRule = QueryRule.getInstance();
		/*if ((this.prpDuser.getUserCode() != null)
				&& (!("".equals(this.prpDuser.getUserCode())))) {
			queryRule.addEqual("userCode", this.prpDuser.getUserCode());
		}
		if ((this.prpDuser.getUserName() != null)
				&& (!("".equals(this.prpDuser.getUserName())))) {
			queryRule.addLike("userName", this.prpDuser.getUserName());
		}*/

		Page page = this.userService.findUser(queryRule, this.pageNo,
				this.pageSize);

		this.userList = page.getResult();
		this.totalCount = (int) page.getTotalCount();
		return "success";
	}

	public String update() {
		this.userService.update(this.prpDuser);

		return "success";
	}

	public String prepareUpdate() {
		this.prpDuser = this.userService.getUser(this.userCode);

		return "success";
	}

	public String add() {
		try {
			prpDuser.setInsertTimeForHis(new Date());
			prpDuser.setOperateTimeForHis(new Date());
			this.userService.save(this.prpDuser);
			renderJSON(successClose("添加成功"));
			return null;
		}catch(Exception e) {
			logger.equals(e);
			e.printStackTrace();
			renderJSON(feilure("添加不成功！"));
			return null;
		}
	}

	public String prepareAdd() {
		roleList = (List<PrpRole>) getCache().get("roleList");
		if(roleList == null) {
			roleList = prpRoleService.findRoles();
			getCache().put("roleList", roleList);
		}
		areaInfoList = (List<PrpAreaInfo>) getCache().get("areaInfoList");
		if(areaInfoList == null) {
			areaInfoList = prpAreaInfoService.findAreaInfos();
			getCache().put("areaInfoList", areaInfoList);
		}
		return "success";
	}

	public String delete() {
		this.userService.delete(this.userCode);

		return "success";
	}

	public String prepareQuery() {
		return "success";
	}

	public String prepareChangePassword() {
		String userCode = (String) getSession().getAttribute("UserCode");

		this.prpDuser = this.userService.getUser(userCode);

		return "success";
	}

	public String changePassword() {
		try {
			PrpDuser user = (PrpDuser) userService.findUserByUserName(userCode);
			String pd = Sha512DigestUtils.shaHex(password);
			if(pd != null && pd.equals(user.getPassword())) {
				user.setPassword(newPassword);
				userService.update(user);
				renderJSON(successClose("修改成功!"));
			}else {
				renderJSON(feilure("用户名密码不匹配!"));
			}
		}catch(Exception e) {
			logger.equals(e);
			e.printStackTrace();
			renderJSON(feilure("修改失败!"));
		}
		return null;
	}

	public String view() {
		this.prpDuser = this.userService.getUser(this.userCode);

		return "success";
	}

	public String logout() {
		getSession().invalidate();
		return "success";
	}


	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}