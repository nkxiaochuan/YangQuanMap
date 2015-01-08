package com;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;





public class TestIos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  ServerSocket ss = null;

		  PrintWriter pw = null;

		  BufferedReader br = null;

		  InputStream is;
		  InputStream in = null;
			OutputStream out = null;

			DataOutputStream dout;
			DataInputStream din;

		      try {

		          ss = new ServerSocket(9528);

		          while(true){

		              System.out.println("我在9528端口监听");

		              Socket s = ss.accept();
		              
		              in = s.getInputStream();
		  			din = new DataInputStream(in);
		  			out = s.getOutputStream();
		  			dout = new DataOutputStream(out);

		              br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		              System.out.println("----------------------" + din.readUTF());

		              String str = br.readLine();

		              System.out.println("str="+str);

		              is = s.getInputStream();

		              ByteArrayOutputStream baos = new ByteArrayOutputStream();

		              int len;

		              byte[] b = new byte[1024];

		              while((len = is.read(b))!=-1){

		                  System.out.println("len = "+len);

		                  baos.write(b, 0, len);

		              }

		              byte[] data = baos.toByteArray();

		              pw = new PrintWriter(s.getOutputStream(),true);

		              pw.println("我是服务器，我收到了你发来的消息");

		              System.out.println("客户端发来的消息："+new String(data));

		              System.err.println("--------------------------------------------------------------------------------------------------");

		          }

		           

		      } catch (IOException e) {

		          // TODO Auto-generated catch block

		          e.printStackTrace();

		      }

		  }

}
