package ins.platform.service.spring;

import java.util.List;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.platform.schema.model.PrpRole;
import ins.platform.service.facade.PrpRoleService;

public class PrpRoleServiceImpl extends GenericDaoHibernate<PrpRole, String> implements
		PrpRoleService {

	private static CacheService cacheManager = CacheManager.getInstance("prpRole");
	
	public void addRole(PrpRole role) {
		this.save(role);

	}

	public void deleteRoleByRoleCode(String	roleCode) {
		this.deleteByPK(roleCode);

	}

	public void updateRole(PrpRole role) {
		this.update(role);

	}

	public List<PrpRole> findRoles() {//will never more than 2rows, cache it.
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		List<PrpRole> roleList = (List<PrpRole>) cacheManager.getCache("findRoles");
		if(roleList == null) {
			roleList = this.find(queryRule);
			cacheManager.putCache("findRoles", roleList);
		}
		return roleList;
	}

	public PrpRole findRlolesByRoleCode(String roleCode) {
		// TODO Auto-generated method stub
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addEqual("roleCode", roleCode);
		return (PrpRole) this.find(queryRule);
	}

	public PrpRole getRoleByRoleCode(String roleCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
