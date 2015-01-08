package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.axis.client.ServiceFactory;
import org.apache.commons.codec.binary.Base64;

public class TestGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "{&quot;policyNo&quot;:&quot;305072011110000009169&quot;,&quot;registNo&quot;:null,&quot;insuredName&quot;:&quot;李新美&quot;,&quot;licenseNo&quot;:&quot;京J00031&quot;,&quot;insuredTel&quot;:null,&quot;insuredCom&quot;:&quot;北京分公司营业一部市场团队&quot;,&quot;startDate&quot;:&quot;2011-06-28&quot;,&quot;endDate&quot;:&quot;2012-06-27&quot;,&quot;policyType&quot;:&quot;交强险&quot;,&quot;customerTypeName&quot;:&quot;普通客户&quot;,&quot;vipFlagName&quot;:&quot;&quot;,&quot;damageCount&quot;:0,&quot;itemInfo&quot;:[{&quot;kindCode&quot;:&quot;0507&quot;,&quot;kindName&quot;:&quot;机动车交通事故责任强制险&quot;,&quot;amount&quot;:122000,&quot;premium&quot;:878.46,&quot;exceptFlag&quot;:null}],&quot;endorseInfo&quot;:null,&quot;engageInfo&quot;:[{&quot;clausecode&quot;:&quot;T0111&quot;,&quot;clauses&quot;:&quot;尊敬的客户：投保次日起，您可以通过我司网站http：//cha.bocins.com、客服专线40069 95566或营业网点柜台查询保单及理赔等信息。若对查询结果有异议，可在我司网站上留言或拨打我司24小时客户专线40069 95566进一步核实。\n&quot;},{&quot;clausecode&quot;:&quot;T0100&quot;,&quot;clauses&quot;:&quot;您的车辆属尾号限行范围，进行限行交强险保费减免，减免保费 71.54 元，计算方法 减免保费=(636.89/365*41) ，减免后保费为 标准保费金额-减免保费金额=减免后金额\n&quot;}]}";
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(df.format(new Date()));
//		System.out.println(System.currentTimeMillis());
//		System.out.println(Runtime.getRuntime().availableProcessors()*50*1024);
//		FileInputStream in;
//		try {
//			in = new FileInputStream(new File("E:\\20121218134513.jpg"));
//			byte[] ib7;
//			try {
//				ib7 = new byte[in.available()];
//				in.read(ib7);
//				byte[] bb7 = Base64.encodeBase64(ib7);
//				String fileData = new String(bb7);
//				System.out.println(fileData);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	       BufferedInputStream bis=new BufferedInputStream(in,1024*1024);
//			System.out.println(new File("E:\\20121218134513.jpg"));

		String  a = ",a,b,c,d,";
		System.out.println(a.indexOf(",c"));
	}

}
