package ins.platform.service.spring;

import java.util.List;

import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.platform.schema.model.PrpMenu;
import ins.platform.service.facade.MenuService;

public class PrpMenuServiceImpl extends GenericDaoHibernate<PrpMenu, String> implements
		MenuService {

	public void addMenu(PrpMenu menu) {
		this.save(menu);
	}

	public void deleteMenuByMenuCode(String menuCode) {
		this.deleteByPK(menuCode);
	}

	public void updateMenu(PrpMenu menu) {
		this.update(menu);
	}

	public List<PrpMenu> getMenuList(String menuString) {
		String menus = menuString.trim();
		String[] menuArray = menus.split(",");
		QueryRule queryRule = QueryRule.getInstance();
		queryRule.addSql(" 1=1");
		queryRule.addIn("menuCode", menuArray);
		return this.find(queryRule);
	}
}
