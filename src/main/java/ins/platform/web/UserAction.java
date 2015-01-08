package ins.platform.web;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.web.Struts2Action;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.UserService;

import java.util.List;

public class UserAction extends Struts2Action {
	private UserService userService;
	private PrpDuser prpDuser;
	private String userCode;
	private String newPassword;
	private List<PrpDuser> userList;

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
		if ((this.prpDuser.getUserCode() != null)
				&& (!("".equals(this.prpDuser.getUserCode())))) {
			queryRule.addEqual("userCode", this.prpDuser.getUserCode());
		}
		if ((this.prpDuser.getUserName() != null)
				&& (!("".equals(this.prpDuser.getUserName())))) {
			queryRule.addLike("userName", this.prpDuser.getUserName());
		}
		if ((this.prpDuser.getPrpDcompany().getComCode() != null)
				&& (!("".equals(this.prpDuser.getPrpDcompany().getComCode())))) {
			queryRule.addLike("prpDcompany.comCode", this.prpDuser
					.getPrpDcompany().getComCode());
		}

		if ((this.prpDuser.getNewUserCode() != null)
				&& (!("".equals(this.prpDuser.getNewUserCode())))) {
			queryRule.addEqual("newUserCode", this.prpDuser.getNewUserCode());
		}

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
		this.userService.save(this.prpDuser);

		return "success";
	}

	public String prepareAdd() {
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
		this.userService.changePassword(this.prpDuser.getUserCode(),
				this.prpDuser.getPassword(), this.newPassword);

		return "success";
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