package ins.map.service.spring;

import java.util.List;

import ins.framework.dao.GenericDaoHibernate;
import ins.map.schema.model.SimpConfig;
import ins.map.service.facade.SimpConfigService;

public class SimpConfigServiceImpl extends 
	GenericDaoHibernate<SimpConfig, String> implements SimpConfigService {

	public List<SimpConfig> findSimpConfigs() {
		// TODO Auto-generated method stub
		return this.getAll(SimpConfig.class);
	}

}
