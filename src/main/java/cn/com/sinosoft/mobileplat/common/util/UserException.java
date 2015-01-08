/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ public class UserException extends Exception
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private String errorNo;
/*    */   private String errorLocation;
/*    */   private String errorMessage;
/*    */ 
/*    */   public String getErrorNo()
/*    */   {
/* 17 */     return this.errorNo;
/*    */   }
/*    */ 
/*    */   public void setErrorNo(String errorNo) {
/* 21 */     this.errorNo = errorNo;
/*    */   }
/*    */ 
/*    */   public String getErrorLocation() {
/* 25 */     return this.errorLocation;
/*    */   }
/*    */ 
/*    */   public void setErrorLocation(String errorLocation) {
/* 29 */     this.errorLocation = errorLocation;
/*    */   }
/*    */ 
/*    */   public String getErrorMessage() {
/* 33 */     return this.errorMessage;
/*    */   }
/*    */ 
/*    */   public void setErrorMessage(String errorMessage) {
/* 37 */     this.errorMessage = errorMessage;
/*    */   }
/*    */ 
/*    */   public static long getSerialVersionUID() {
/* 41 */     return 1L;
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.UserException
 * JD-Core Version:    0.6.0
 */