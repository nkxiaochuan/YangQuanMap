/*    */package com;

/*    */
/*    */import java.io.IOException;
/*    */
import java.io.OutputStreamWriter;
/*    */
import java.io.PrintStream;
/*    */
import java.net.HttpURLConnection;
/*    */
import java.net.MalformedURLException;
/*    */
import java.net.URL;
/*    */
import java.util.ArrayList;
/*    */
import java.util.List;
import org.apache.commons.io.IOUtils;

/*    */
/*    */public class Test
/*    */{
	/*    */public void test()
	/*    */{
		/*    */try
		/*    */{
			/* 34 */URL urlCach = new URL(
					"http://localhost:7001/mobileplat/AddCheckInfoServlet");
			/* 35 */HttpURLConnection urlconCach = (HttpURLConnection) urlCach
					.openConnection();
			/* 36 */urlconCach.setDoOutput(true);
			/* 37 */urlconCach.setRequestMethod("POST");
			/* 38 */urlconCach.setUseCaches(false);
			/* 39 */urlconCach.setDefaultUseCaches(false);
			/* 40 */OutputStreamWriter CachWriter = new OutputStreamWriter(
					urlconCach.getOutputStream(), "GBK");
			/*    */

			 
			String inxml1 = "<AddCheckInfoReq><ReqHeadVo><tokenId>123458</tokenId>" +
			"<userCode>0000107</userCode>"+
			"<flowinTime>2012-06-11 12:34:56</flowinTime>"+
			"</ReqHeadVo><optionType>2</optionType>"+
			"<CheckInfoVo><taskId>4640220422</taskId>"+
			"<registNo>605012012120000000275</registNo>"+
			"<checkSite>ss</checkSite>"+
			"<checkConText>几</checkConText>"+
			"<checkUserCode>0000107</checkUserCode>"+
			"<checkInDate>2012-10-10 15:21:59</checkInDate>"+
			"<checkStartDate>2012-10-10 15:21:59</checkStartDate>"+
			"<checkEndDate>2012-10-10 15:21:59</checkEndDate>"+
			"<inputDate>2012-10-10 15:21:59</inputDate>"+
			"<caseType>1</caseType>"+
			"</CheckInfovo><CarInfoVoList><CarInfoVo><serialNo>1</serialNo>"+
			"<lossItemType>050</lossItemType>"+
			"<licenseNo>津MJ0566</licenseNo>"+
		    "<dutyType>1</dutyType>"+
			"<isLoss>1</isLoss>"+
			"</CarInfoVo></CarInfoVoList></AddCheckInfoReq>";
			CachWriter.write(inxml1);
			/*    */
			/* 45 */CachWriter.flush();
			/* 46 */CachWriter.close();
			/*    */
			/* 48 */List ioList = new ArrayList();
			/*    */
			/* 50 */ioList = IOUtils.readLines(urlconCach.getInputStream());
			/* 51 */StringBuilder sb = new StringBuilder(1024);
			/*    */
			/* 53 */for (int j = 0; j < ioList.size(); j++) {
				/* 54 */sb.append(ioList.get(j));
				/*    */}
			/* 56 */System.out.println("---------" + sb.toString());
			/* 57 */urlconCach.getResponseMessage();
			/*    */
			/* 59 */urlconCach.disconnect();
			/*    */} catch (MalformedURLException e) {
			/* 61 */e.printStackTrace();
			/*    */} catch (IOException e) {
			/* 63 */e.printStackTrace();
			/*    */} catch (Exception e) {
			/* 65 */e.printStackTrace();
			/*    */}
		/*    */}

	/*    */
	/*    */public static void main(String[] args)
	/*    */{
		/*    */try
		/*    */{
			/* 76 */// URL urlCach = new
					// URL("http://localhost:7001/mobileplat/ActionRecordServlet");
			URL urlCach = new URL(
					"http://localhost:7001/mobileplat/AddCheckInfoServlet");
			/* 77 */HttpURLConnection urlconCach = (HttpURLConnection) urlCach
					.openConnection();
			/* 78 */urlconCach.setDoOutput(true);
			/* 79 */urlconCach.setRequestMethod("POST");
			/* 80 */urlconCach.setUseCaches(false);
			/* 81 */urlconCach.setDefaultUseCaches(false);
			/* 82 */OutputStreamWriter CachWriter = new OutputStreamWriter(
					urlconCach.getOutputStream(), "GBK");
			/*    */
			/* 85 */
			/* 42 */

			String inxml1 = "<AddCheckInfoReq><ReqHeadVo><tokenId>123458</tokenId>" +
			"<userCode>0000107</userCode>"+
			"<flowinTime>2012-06-11 12:34:56</flowinTime>"+
			"</ReqHeadVo><optionType>2</optionType>"+
			"<CheckInfoVo><taskId>4640220422</taskId>"+
			"<registNo>605012012120000000275</registNo>"+
			"<checkSite>ss</checkSite>"+
			"<checkConText>几</checkConText>"+
			"<checkUserCode>0000107</checkUserCode>"+
			"<checkInDate>2012-10-10 15:21:59</checkInDate>"+
			"<checkStartDate>2012-10-10 15:21:59</checkStartDate>"+
			"<checkEndDate>2012-10-10 15:21:59</checkEndDate>"+
			"<inputDate>2012-10-10 15:21:59</inputDate>"+
			"<caseType>1</caseType>"+
			"</CheckInfovo><CarInfoVoList><CarInfoVo><serialNo>1</serialNo>"+
			"<lossItemType>050</lossItemType>"+
			"<licenseNo>津MJ0566</licenseNo>"+
		    "<dutyType>1</dutyType>"+
			"<isLoss>1</isLoss>"+
			"</CarInfoVo></CarInfoVoList></AddCheckInfoReq>";

			StringBuffer stringBuilder = new StringBuffer();
			stringBuilder.append("<LoginReq>");
			stringBuilder.append("<ReqHeadVo>");
			stringBuilder
					.append("<tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId>");
			stringBuilder.append("<userCode>00000107</userCode>");
			stringBuilder
					.append("<flowinTime>2012/03/30 12:13:00</flowinTime>");
			stringBuilder.append("</ReqHeadVo>");
			stringBuilder.append("<password>1</password>");
			stringBuilder.append("</LoginReq>");

			/* 86 */CachWriter.write(inxml1);
			/*    */
			/* 88 */CachWriter.flush();
			/* 89 */CachWriter.close();
			/*    */
			/* 91 */List ioList = new ArrayList();
			/*    */
			/* 93 */ioList = IOUtils.readLines(urlconCach.getInputStream());
			/* 94 */StringBuilder sb = new StringBuilder(1024);
			/*    */
			/* 96 */for (int j = 0; j < ioList.size(); j++) {
				/* 97 */sb.append(ioList.get(j));
				/*    */}
			/* 99 */System.out.println("---------------" + sb.toString());
			/* 100 */urlconCach.getResponseMessage();
			/*    */
			/* 102 */urlconCach.disconnect();
			/*    */} catch (MalformedURLException e) {
			/* 104 */e.printStackTrace();
			/*    */} catch (IOException e) {
			/* 106 */e.printStackTrace();
			/*    */} catch (Exception e) {
			/* 108 */e.printStackTrace();
			/*    */}
		/*    */}

	/**
	 * 对版本校验及升级进行功能性测试； 包括： 
	 * 1.客户端需要升级，预期返回相应报文： 
	 * 		a.请求唯一标识；
	 * 		b.返回类型：0；
	 * 		c.是否更新：1；
	 * 		d.升级路径："lajflkajdla/jldjfsl/djldj.test" 
	 * 		e.版本信息："1.2.0"
	 * 
	 * 
	 * 2.客户端不需要升级； 
	 * 		a.请求唯一标识；
	 * 		b.返回类型：0； 
	 * 		c.是否更新：0；
	 * 
	 * 
	 * 3.系统异常： 
	 * 		a.请求唯一标识； 
	 * 		b.返回类型：-1；
	 * 		c.错误描述："系统异常"; 
	 * 		d.是否更新:2;
	 * 		e.版本信息:"1.2.3"；
	 */

	public void testCheckVersion() {
		String inBaseXMLHead  = "<VersionInfoReq>"
				+ "<ReqHeadVo>"
				+ "<tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId>"
				+ "<userCode>0000107</userCode>"
				+ "<flowinTime>2012/09/17 15:04:00</flowinTime>"
				+ "</ReqHeadVo>" ;
				
		
		StringBuffer sucBuffer = new StringBuffer();
		//添加报文头信息
		sucBuffer.append(inBaseXMLHead);
		
		
		/**
		 * 1.客户端需要升级
		 */
		//设备类型
		sucBuffer.append("<equipmentType>");
		sucBuffer.append("2");
		sucBuffer.append("</equipmentType>");
		
		//应用类型
		sucBuffer.append("<applicationType>");
		sucBuffer.append("2");
		sucBuffer.append("</applicationType>");
		//应用版本号
		sucBuffer.append("<applicationVersionNo>");
		sucBuffer.append("123");
		sucBuffer.append("</applicationVersionNo>");
		
		
		//报文格式
		sucBuffer.append("<messageType>");
		sucBuffer.append("xml");
		sucBuffer.append("</messageType>");
		
		
		sucBuffer.append("</VersionInfoReq>");
		try {
			// 设定访问网址
			URL urlCach = new URL(
					"http://localhost:7001/mobileplat/CheckVersionServlet");
			HttpURLConnection urlconCach;
			try {
				// 连接状态为打开
				urlconCach = (HttpURLConnection) urlCach.openConnection();
				// 设置输出流为真，默认为false输入流；
				urlconCach.setDoOutput(true);
				// 请求方法：post;
				urlconCach.setRequestMethod("POST");
				// 不使用缓存；
				urlconCach.setUseCaches(false);
				// 默认不使用缓存；
				urlconCach.setDefaultUseCaches(false);
				// 以GBK编码方式获取输出流；
				OutputStreamWriter cacheWriter = new OutputStreamWriter(
						urlconCach.getOutputStream(), "GBK");
				
				//写入缓存
				cacheWriter.write(sucBuffer.toString());
				
				cacheWriter.flush();
				cacheWriter.close();
				
				List ioList = new ArrayList();
				//读出返回结果
				ioList = IOUtils.readLines(urlconCach.getInputStream());
				
				
				StringBuffer sucResult = new StringBuffer(1024);
				
				if(null != ioList && ioList.size()>0){
					for(int i=0;i<ioList.size();i++){
						sucResult.append(ioList.get(i));
					}
				}
				
				
				System.out.println("需要升级："+sucResult.toString());
				System.out.println(urlconCach.getResponseMessage());
				
				urlconCach.disconnect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*    */
}

/*
 * Location:
 * C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name: com.Test JD-Core Version: 0.6.0
 */