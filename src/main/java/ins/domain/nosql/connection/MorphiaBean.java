package ins.domain.nosql.connection;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class MorphiaBean extends Morphia {
    private Mongo mongo;
    private String dbName;
    private String user;
    private String password;
    private String mapPackage;
    private Datastore ds;
    public Datastore getDatastore(){
    	if(null==ds){
	        if(this.mongo==null||this.dbName==null){
	            return null;
	        }
	        char[] pwd = password.toCharArray();
	        ds = createDatastore(mongo, dbName , user , pwd);
    	}
    	return ds;
    }
    
    public void mapPackage(){
        super.mapPackage(mapPackage,true);
    }
    public Mongo getMongo() {
        return mongo;
    }
    public void setMongo(Mongo mongo) {
        this.mongo = mongo;
    }
    public String getDbName() {
        return dbName;
    }
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

	public String getMapPackage() {
		return mapPackage;
	}

	public void setMapPackage(String mapPackage) {
		this.mapPackage = mapPackage;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
