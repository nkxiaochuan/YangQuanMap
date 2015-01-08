package cn.com.sinosoft.mobileplat.common.util;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PubTools {
	private static CacheService propertiesCacheService = CacheManager.getInstance("properties");
	public String getConfigPath() {
		String configPath = null;
		if ((configPath == null) || (configPath.trim().length() == 0)) {
			String classPath = getClass().getResource("").getPath();
			configPath = classPath.substring(0, classPath
					.lastIndexOf("classes"));
		}

		configPath = configPath + "/classes/config/";
		return configPath;
	}

	public Properties getProperties(String propertiesName) {
		if(PubTools.propertiesCacheService.getCache(propertiesName) != null && PubTools.propertiesCacheService.getCache(propertiesName) instanceof Properties){
			return (Properties)PubTools.propertiesCacheService.getCache(propertiesName);
		}else{
			Properties properties = new Properties();
			try {
				if ((propertiesName.equals("")) || (propertiesName == null)) {
					throw new Exception("配置文件名称为空");
				}
				File file = new File(getConfigPath() + propertiesName);
				FileInputStream fileInputStream = new FileInputStream(file);
				InputStream inputStream = fileInputStream;
				properties.load(inputStream);
				inputStream.close();
				fileInputStream.close();
				PubTools.propertiesCacheService.putCache(propertiesName, properties);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return properties;
		}
	}
}
