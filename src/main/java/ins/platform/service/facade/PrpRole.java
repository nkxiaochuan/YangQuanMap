package ins.platform.service.facade;

public interface PrpRole {

	public abstract void addRole(PrpRole role);
	public abstract void deleteRoleByRoleCode(String RoleCode);
	public abstract void updateRoleByRoleCode(String RoleCode);
}
