package ins.platform.service.facade;

import ins.platform.schema.model.PrpMenu;

import java.util.List;

public interface PrpMenuService {
	public abstract List<PrpMenu> getMenuList(String menuString);
	public abstract void addMenu(PrpMenu menu);
	public abstract void updateMenu(PrpMenu menu);
	public abstract void deleteMenuByMenuCode(String menuCode);
}
