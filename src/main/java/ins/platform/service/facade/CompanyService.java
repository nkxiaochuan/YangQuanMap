package ins.platform.service.facade;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.platform.schema.model.PrpDcompany;

public abstract interface CompanyService {
	public abstract PrpDcompany getCompany(String paramString);

	public abstract boolean isUpperComCode(String paramString1,
			String paramString2);

	public abstract String findComCNameByComCode(String paramString);

	public abstract Page findCompany(QueryRule paramQueryRule, int paramInt1,
			int paramInt2);

	public abstract void update(PrpDcompany paramPrpDcompany);

	public abstract void save(PrpDcompany paramPrpDcompany);

	public abstract void delete(String paramString);

	public abstract void initCompanyTree();

	public abstract PrpDcompany getPrpDcompanyByComCode(String paramString);
}