package cn.com.sinosoft.mobileplat.common.util;

import ins.framework.dao.GenericDaoHibernate;

public class SaveEntity implements Runnable {

	@SuppressWarnings("unchecked")
	private GenericDaoHibernate genericDaoHibernate;
	
	private Object object;
	
	@SuppressWarnings("unchecked")
	public SaveEntity(GenericDaoHibernate genericDaoHibernate,Object obj){
		this.genericDaoHibernate=genericDaoHibernate;
		this.object=obj;
	}
	
	public void run() {
		 this.genericDaoHibernate.save(object);
		 this.genericDaoHibernate.flush();
		 this.genericDaoHibernate.clear();
	}

}
