/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import com.thoughtworks.xstream.converters.SingleValueConverter;
/*    */ 
/*    */ public class StringSingleValueConverter
/*    */   implements SingleValueConverter
/*    */ {
/*    */   public Object fromString(String arg0)
/*    */   {
/*  9 */     if ((arg0 == null) || ("".equals(arg0)))
/*    */     {
/* 11 */       return null;
/*    */     }
/*    */ 
/* 15 */     return arg0;
/*    */   }
/*    */ 
/*    */   public String toString(Object arg0)
/*    */   {
/* 22 */     if (arg0 != null) {
/* 23 */       return arg0.toString();
/*    */     }
/* 25 */     return null;
/*    */   }
/*    */ 
/*    */   public boolean canConvert(Class arg0)
/*    */   {
/* 32 */     return arg0.equals(String.class);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.StringSingleValueConverter
 * JD-Core Version:    0.6.0
 */