package com;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class TestRepairFactorySync {
	
	public static void main(String args[]){
		try
		{
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/RepairFactorySyncServlet");
//		  String inxml = "<RepairFactorySyncReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-03-30 12:13:00</flowinTime></ReqHeadVo><userCode>0000107</userCode><inputDate>2010-01-01  12:13:00</inputDate></RepairFactorySyncReq>";
		  URL urlCach = new URL("http://localhost:9999/mobileplat/DefLossSubmitServlet");
		  String inxml = "<DefLossSubmitReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>20120611 12:34:56</flowinTime></ReqHeadVo><optionType>null</optionType><DefLossInfoVo><taskId>4640179697</taskId><state>0</state><registNo>605012012120000000010</registNo><licenseNo>13562148966</licenseNo><lossItemType>050</lossItemType><frameNo>YUSl54234</frameNo><licenseType>01</licenseType><cetainLossType>1</cetainLossType><defSite>鍖椾含甯傛捣娣?鍖哄疂绂忓妗ュ崡</defSite><lossPart>101000000000</lossPart><dutyType>1</dutyType><SUMCOMFEE>2000</SUMCOMFEE><SUMREPAIRFEE>900</SUMREPAIRFEE><SUMMATERIALFEE>1500</SUMMATERIALFEE><SUMMANAGEFEE>1400</SUMMANAGEFEE><MANAGEFEERATE>85</MANAGEFEERATE><SUMREMNANT>800</SUMREMNANT><SUMRESCUEFEE>1100</SUMRESCUEFEE><SUMLOSSFEE>3000</SUMLOSSFEE><DEFLOSSREMARK>sb</DEFLOSSREMARK><handlerCode>0000107</handlerCode><handlerName>erhuo</handlerName><defLossDate>2012-06-12 13:53:24</defLossDate></DefLossInfoVo><ComponentDetailInfoVoList><ComponentDetailInfoVo><comPcode>999999</comPcode><comPname>dasb</comPname><lossPrice>631</lossPrice><lossCount>5</lossCount><sumPric>500</sumPric><remnant>500</remnant></ComponentDetailInfoVo></ComponentDetailInfoVoList><RepairVoList><RepairVo><comPcode>999999</comPcode><comPname>dasba</comPname><repairTypeCode>11122</repairTypeCode><repairTypeName>sb</repairTypeName><sumRepairFee>2354</sumRepairFee><unitManHourPrice>2354</unitManHourPrice><manHour>2.5</manHour></RepairVo></RepairVoList><MaterialVoList><MaterialVo><materialName>涓綉</materialName><unitPrice>200</unitPrice><count>1</count><sumMaterialFee>500</sumMaterialFee></MaterialVo></MaterialVoList><FactoryVo><factoryCode>1</factoryCode><factoryName>null</factoryName><address>鍖椾含甯傛湞闃冲尯鍔叉澗126鍙?</address></FactoryVo></DefLossSubmitReq>";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/DefLossConsultServlet");
//		  String inxml ="<DefLossConsultReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-06-11 12:34:56</flowinTime></ReqHeadVo><taskId>857586</taskId><IsAccess>1</IsAccess></DefLossConsultReq>";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/DefLossConfirmServlet");
//		  String inxml ="";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/TaskDetailQueryServlet");
//		  String inxml ="<TaskDetailQueryReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-06-11 12:34:56</flowinTime></ReqHeadVo><taskId>4640179536</taskId><taskType>4</taskType></TaskDetailQueryReq>";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/TaskListInfoQueryServlet");
//		  String inxml ="<TaskListInfoQueryReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-06-11 12:34:56</flowinTime></ReqHeadVo><taskType>0</taskType><pageSize>20</pageSize><pageNum>1</pageNum></TaskListInfoQueryReq>";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/AddCheckInfoServlet");
//		  String inxml ="<AddCheckInfoReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-06-11 12:34:56</flowinTime></ReqHeadVo><CheckInfoVo><taskId>4640179433</taskId><registNo></registNo><checkSite>sdfsaf</checkSite><checkConText>adssafdsaf</checkConText><checkUserCode>asdfasdfsadf</checkUserCode><checkInDate>2012-06-11 12:34:56</checkInDate><checkStartDate>2012-06-11 12:34:56</checkStartDate><checkEndDate>2012-06-11 12:34:56</checkEndDate><inputDate>2012-06-11 12:34:56</inputDate></CheckInfoVo><CarInfoVoList><CarInfoVo><serialNo>1</serialNo><lossItemType>050</lossItemType><licenseNo>京JH9722</licenseNo><dutyType>1</dutyType><isLoss>1</isLoss></CarInfoVo></CarInfoVoList><FileInfoVoList><FileInfoVo><serialNo>1</serialNo><fileType>1</fileType><fileRemark>asdfsadsaf</fileRemark><fileName>adsfasfdsaf</fileName><fileSize>100</fileSize><fileAddress>asdsadfdsaf</fileAddress><fileDate>2012-06-11 12:34:56</fileDate><fileData>asdfadsfdsafawreqr213213</fileData></FileInfoVo></FileInfoVoList></AddCheckInfoReq>";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/LoginServlet");
//		  String inxml ="<LoginReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-06-11 12:34:56</flowinTime></ReqHeadVo><password>0000</password></LoginReq>";
//		  URL urlCach = new URL("http://localhost:9999/mobileplat/AddDocServlet");
//		  String inxml ="<AddDocReq><ReqHeadVo><tokenId>786d9d0b-1ec1-46af-b310-bf33a26dfea8</tokenId><userCode>0000107</userCode><flowinTime>2012-06-11 12:34:56</flowinTime></ReqHeadVo><registNo>605012012120000000022</registNo><FileInfoVoList><FileInfoVo><serialNo>1</serialNo><fileType>5001</fileType><fileRemark>主车车损</fileRemark><fileName>主车车损.jpg</fileName><fileSize>1024</fileSize><fileAddress>主车车损地址</fileAddress><fileDate>2012-3-3 13:12:12</fileDate><fileData>joiuoiuojo0980980ipajpjjpiujpoijojo</fileData><addfileType>1</addfileType><carId>4640157791</carId></FileInfoVo></FileInfoVoList></AddDocReq>";

		  
		  HttpURLConnection urlconCach = (HttpURLConnection)urlCach.openConnection();
		  urlconCach.setDoOutput(true);
		  urlconCach.setRequestMethod("POST");
		  urlconCach.setUseCaches(false);
		  urlconCach.setDefaultUseCaches(false);
		  OutputStreamWriter CachWriter = new OutputStreamWriter(urlconCach.getOutputStream(), "GB2312");
		  
		  CachWriter.write(inxml);

		  CachWriter.flush();
		  CachWriter.close();
		  
		  List ioList = new ArrayList();

		  ioList = IOUtils.readLines(urlconCach.getInputStream());
		  StringBuilder sb = new StringBuilder(1024);

		  for (int j = 0; j < ioList.size(); j++) {
		    sb.append(ioList.get(j));
		  }
		  System.out.println("---------------" + sb.toString());
		   urlconCach.getResponseMessage();

		   urlconCach.disconnect();
		} catch (MalformedURLException e) {
		   e.printStackTrace();
		} catch (IOException e) {
		   e.printStackTrace();
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
}
