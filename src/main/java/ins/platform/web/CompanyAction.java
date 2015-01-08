package ins.platform.web;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.framework.web.Struts2Action;
import ins.platform.schema.model.PrpDcompany;
import ins.platform.service.facade.CompanyService;

public class CompanyAction extends Struts2Action {
	private CompanyService companyService;
	private PrpDcompany prpDcompany;
	private String opreateType;
	private String comCode;

	public CompanyService getCompanyService() {
		return this.companyService;
	}

	public PrpDcompany getPrpDcompany() {
		return this.prpDcompany;
	}

	public void setPrpDcompany(PrpDcompany prpDcompany) {
		this.prpDcompany = prpDcompany;
	}

	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	public String getOpreateType() {
		return this.opreateType;
	}

	public void setOpreateType(String opreateType) {
		this.opreateType = opreateType;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String prepareQuery() {
		this.logger.debug("机构菜单跳转");
		return "success";
	}

	public String query() {
		this.logger.debug("查询满足条件的 机构信息");
		if (this.pageNo == 0) {
			this.pageNo = 1;
		}
		if (this.pageSize == 0) {
			this.pageSize = 20;
		}
		QueryRule queryRule = QueryRule.getInstance();
		if ((this.prpDcompany.getComCode() != null)
				&& (!("".equals(this.prpDcompany.getComCode())))) {
			queryRule.addEqual("comCode", this.prpDcompany.getComCode());
		}
		if ((this.prpDcompany.getComCName() != null)
				&& (!("".equals(this.prpDcompany.getComCName())))) {
			queryRule.addLike("comCName", this.prpDcompany.getComCName());
		}
		if ((this.prpDcompany.getComEName() != null)
				&& (!("".equals(this.prpDcompany.getComEName())))) {
			queryRule.addLike("comEName", this.prpDcompany.getComEName());
		}
		if ((this.prpDcompany.getAddressCName() != null)
				&& (!("".equals(this.prpDcompany.getAddressCName())))) {
			queryRule.addLike("addressCName", this.prpDcompany
					.getAddressCName());
		}
		if ((this.prpDcompany.getPhoneNumber() != null)
				&& (!("".equals(this.prpDcompany.getPhoneNumber())))) {
			queryRule
					.addEqual("phoneNumber", this.prpDcompany.getPhoneNumber());
		}
		if ((this.prpDcompany.getUpperComCode() != null)
				&& (!("".equals(this.prpDcompany.getUpperComCode())))) {
			queryRule.addEqual("upperComCode", this.prpDcompany
					.getUpperComCode());
		}
		try {
			Page page = this.companyService.findCompany(queryRule, this.pageNo,
					this.pageSize);
			writeJSONData(page, new String[] { "comCode", "comCName",
					"comEName", "addressCName", "phoneNumber", "upperComCode" });
		} catch (Exception e) {
			writeJSONMsg(e.getMessage());
		}
		return "none";
	}

	public String prepareAdd() {
		this.logger.debug("准备增加机构工信息");
		this.opreateType = "add";

		return "success";
	}

	public String add() {
		this.logger.debug("增加" + this.prpDcompany.getComCode() + "机构信息");
		System.out.println("增加" + this.prpDcompany.getComCode() + "机构信息");
		this.companyService.save(this.prpDcompany);
		return "success";
	}

	public String delete() {
		this.logger.debug("删除" + this.comCode + "机构信息");
		this.companyService.delete(this.comCode);
		return "none";
	}

	public String view() {
		this.logger.debug("查看机构信息");
		this.opreateType = "view";
		this.prpDcompany = this.companyService.getCompany(this.comCode);
		return "success";
	}

	public String update() {
		this.logger.debug("更新" + this.prpDcompany.getComCode() + "机构信息");
		this.companyService.update(this.prpDcompany);
		return "success";
	}

	public String prepareUpdate() {
		this.logger.debug("准备更新" + this.comCode + "机构信息");
		this.opreateType = "edit";
		this.prpDcompany = this.companyService.getCompany(this.comCode);
		return "success";
	}
}