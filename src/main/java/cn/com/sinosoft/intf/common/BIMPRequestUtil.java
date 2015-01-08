package cn.com.sinosoft.intf.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;



public class BIMPRequestUtil {

	private static final Logger logger = Logger.getLogger(BIMPRequestUtil.class);
	
	public String send(String json) throws Exception {
		String urlTemp = "";	
		double start = System.currentTimeMillis();

		String msgXML = "";
		HttpURLConnection httpConnection;
//	    IPServiceConfig  ipServiceConfig  = DictAPIService.getServiceInfoByCode("scms");
//	    urlTemp = ipServiceConfig.getProteclType()+"://"+ipServiceConfig.getServerIP()+":"+ipServiceConfig.getServerPort()+"/"+ipServiceConfig.getServerAppName().trim()+"/"+ipServiceConfig.getMethods();
		urlTemp = "http://22.8.142.17:8108/mobileService-lioneye/ifc";
	    try {
			httpConnection = (HttpURLConnection) new URL(urlTemp)
					.openConnection();

			httpConnection.setRequestMethod("POST");
//			httpConnection.setRequestProperty("content-type",
//					"text/xml,charset=GBK");
			httpConnection.setDoOutput(true);
			httpConnection.setDoInput(true);
			httpConnection.setAllowUserInteraction(true);
			httpConnection.setConnectTimeout(50 * 1000);
			httpConnection.setReadTimeout(300 * 1000);
			httpConnection.connect();

			// 2、发送数据
			OutputStream outputStream = httpConnection.getOutputStream();
			long time = System.currentTimeMillis();
			outputStream.write(json.getBytes());

			outputStream.flush();
			outputStream.close();
			// 3、返回数据
			long time2 = System.currentTimeMillis();
			InputStreamReader inputStreamReader = new InputStreamReader(
					httpConnection.getInputStream(), "GBK");

			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);
			String inputLine = "";
			StringBuffer inputLines = new StringBuffer();
			inputLine = bufferedReader.readLine();
			while (inputLine != null) {
				inputLines.append(inputLine);
				inputLine = bufferedReader.readLine();
			}
			inputStreamReader.close();
			bufferedReader.close();

			// 4、关闭连接
			httpConnection.disconnect();
			msgXML = inputLines.toString();

		} catch (MalformedURLException e) {
			logger.error("错误信息:" + e.toString());
			throw new Exception("错误信息:" + e.toString());
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("错误信息:" + e.toString());
			throw new Exception("错误信息:" + e.toString());
		} catch (Exception e){
			e.printStackTrace();
			throw new Exception("错误信息:" + e.toString());
		}
		System.out.println("lizhen=(与精友交互时间)="
				+ (System.currentTimeMillis() - start));
		return msgXML;
	}
}
