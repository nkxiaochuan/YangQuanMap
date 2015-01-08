/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import java.util.List;
import java.util.Properties;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.ServiceFactory;
import ins.map.schema.model.SimpConfig;
import ins.map.service.facade.SimpConfigService;

/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
import org.apache.log4j.Logger;
/*    */ 
/*    */ public class InitServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/* 35 */   private Logger logger = Logger.getLogger(InitServlet.class);
/*    */   private static CacheService cacheManager = CacheManager.getInstance("config");

/*    */   public void init() throws ServletException {
///* 38 */    this.logger.debug("start...");
///* 39 */    ServiceFactory.initServiceFactory(getServletContext());
//			System.out.println("–¥»Îª∫¥Êstart...");
//			SimpConfigService simpConfigService = (SimpConfigService) ServiceFactory.getService("simpConfigService");
//			List<SimpConfig> configList = simpConfigService.findSimpConfigs();
//			for(SimpConfig s : configList){
//				cacheManager.putCache(s.getConfigCode(), s.getConfigValue());
//			}
//			System.out.println("–¥»Îª∫¥Êend...");
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.InitServlet
 * JD-Core Version:    0.6.0
 */