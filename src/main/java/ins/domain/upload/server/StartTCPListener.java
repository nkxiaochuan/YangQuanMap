package ins.domain.upload.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class StartTCPListener implements ServletContextListener{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		 
		new Thread(new ServerMain()).start();
		
	}

 

 

}
