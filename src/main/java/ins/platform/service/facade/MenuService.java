package ins.platform.service.facade;

import ins.platform.schema.model.PrpMenu;

public interface MenuService {

	public abstract void addMenu(PrpMenu menu);
	public abstract void updateMenu(PrpMenu menu);
	public abstract void deleteMenuByMenuCode(String menuCode);
}
