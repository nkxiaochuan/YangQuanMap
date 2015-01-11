package ins.platform.service.spring;

import java.util.List;

import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.platform.schema.model.PrpRole;
import ins.platform.service.facade.PrpRoleService;

public class PrpRoleServiceImpl extends GenericDaoHibernate<PrpRole, String> implements
		PrpRoleService {

	public void addRole(PrpRole role) {
		this.save(role);

	}

	public void deleteRoleByRoleCode(String	roleCode) {
		this.deleteByPK(roleCode);

	}

	public void updateRole(PrpRole role) {
		this.update(role);

	}

	public List<PrpRole> findRoles() {
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		return this.find(queryRule);
	}

}
