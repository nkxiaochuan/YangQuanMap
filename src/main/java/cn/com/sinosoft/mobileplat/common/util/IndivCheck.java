/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class IndivCheck
/*    */ {
/*  6 */   Logger logger = Logger.getLogger(IndivCheck.class);
/*    */ 
/*    */   public boolean isGDIndiv(String sellerNo)
/*    */   {
/* 16 */     if ("".equals(sellerNo)) {
/* 17 */       return false;
/*    */     }
/*    */ 
/* 21 */     String GDIndivSwitch = "";
/*    */     try {
/* 23 */       GDIndivSwitch = SffPlatConfig.getProperty("Area44000000", "Pub", "Indiv", "IndivSwitch");
/*    */ 
/* 25 */       if ("1".equals(GDIndivSwitch))
/*    */       {
/* 27 */         if ((sellerNo != null) && (!"".equals(sellerNo.trim())))
/* 28 */           return true;
/*    */       }
/*    */     }
/*    */     catch (Exception e) {
/* 32 */       this.logger.error("获取广东个性配置异常！");
/* 33 */       e.printStackTrace();
/*    */     }
/*    */ 
/* 36 */     return false;
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.IndivCheck
 * JD-Core Version:    0.6.0
 */