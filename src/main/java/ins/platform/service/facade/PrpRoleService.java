package ins.platform.service.facade;

import ins.platform.schema.model.PrpRole;

import java.util.List;

public interface PrpRoleService {

	public abstract void addRole(PrpRole role);
	public abstract void deleteRoleByRoleCode(String RoleCode);
	public abstract void updateRole(PrpRole role);
	public abstract List<PrpRole> findRoles();
}
