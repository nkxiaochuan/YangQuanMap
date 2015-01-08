package ins.domain.upload.server;

import ins.framework.common.ServiceFactory;

public class ServerMain implements Runnable {
   
	public void run(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TCPServer server=(TCPServer)ServiceFactory.getService("server");
		    try {
				server.start();
			} catch (Exception e) {
				System.err.println("Æô¶¯·þÎñÊ§°Ü£¡");
				e.printStackTrace();
			}
	}

}
