package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import cn.com.sinosoft.intf.common.BIMPRequestUtil;

public class TestJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BIMPRequestUtil request = new BIMPRequestUtil();
		String str = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:/123.txt"));
			String r;
			int i=0;
			try {
				r = br.readLine();
				while(r!=null){
					str+=r;
					r=br.readLine();
					System.out.println(i++);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(str + "======" + (float)str.getBytes().length/1024);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String res = request.send(str);
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
