package ins.domain.nosql.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.code.morphia.Datastore;

public class MorphiaInject {
	//通过spring注入morphia
	private static ApplicationContext context =new ClassPathXmlApplicationContext("/spring/dataAccessContext-morphia.xml");
	private static MorphiaBean mor = (MorphiaBean)context.getBean("morphia");
	
	public static Datastore getMorphiaDataStore(){
		mor.mapPackage();
		Datastore ds = mor.getDatastore();
		
		return ds;
	}
}
