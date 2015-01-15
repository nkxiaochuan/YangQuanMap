package ins.platform.service.spring;

import ins.framework.common.QueryRule;
import ins.framework.dao.GenericDaoHibernate;
import ins.platform.schema.model.PrpMenu;
import ins.platform.service.facade.PrpMenuService;

import java.util.List;

public class PrpMenuServiceImpl extends GenericDaoHibernate<PrpMenu, String> implements
		PrpMenuService {

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
		//queryRule.addSql(" 1=1");
	//	queryRule.addSql(" menucode in (" +menuString+")");
	//	queryRule.addIn("menuCode", menuArray);
		String sql = "select * from prpmenu where menucode in (" +menuString+" )";
		List<PrpMenu> menuList = this.findBySql(sql, null);
		return menuList;
	}
}
