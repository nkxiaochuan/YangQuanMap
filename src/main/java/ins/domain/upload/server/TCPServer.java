package ins.domain.upload.server;


import ins.domain.schema.model.FileInfoMsg;
import ins.domain.upload.server.serverImpl.TCPHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.log4j.Logger;

/**
 * TODO Put here a description of what this class does.
 *
 * Created 2012-10-17.
 */
public class TCPServer {
	    //日志记录
		private Logger logger=Logger.getLogger(TCPServer.class);
	    //线程池
		private ExecutorService executorService;
		//监听端口
		private int port;
		//退出
		private boolean quit=false;
		//服务器
		private ServerSocket server;
		//验证信息
		public static Map<String,FileInfoMsg> datas =new HashMap<String,FileInfoMsg>();
	 
		/**
		 * TODO Put here a description of what this constructor does.
		 *
		 * @param port
		 */
		public TCPServer(int port){
			//设定端口号
			this.port=port;
			//创建线程池，池中具有（cup个数*50）条线程
			this.executorService=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()*50);
		}
		/**
		 * 退出
		 */
		@SuppressWarnings("deprecation")
		public void quit(){
			this.quit=true;
			try{
				this.server.close();
			}catch(IOException e){
				this.logger.info("当前时间为 :"+new Date().toLocaleString()+",关闭服务器发生异常");
				e.printStackTrace();
			}
		}
		
		/** 
		  * 启动服务 
		  * @throws Exception 
		  */  
		 public void start() throws Exception {  
		     //实现端口监听  
		     this.server = new ServerSocket(this.port); 
		     this.logger.info("服务启动：端口号为="+this.server.getLocalPort());
		     while(!this.quit){  
		          try{  
		               Socket socket = this.server.accept();  
		               //为支持多用户并发访问，采用线程池管理每一个用户的连接请求  
		               this.executorService.execute(new TCPHandler(socket));  
		             }   
		             catch (Exception e)   
		             {  
		                 e.printStackTrace();  
		             }  
		        }  
		 }  

}
