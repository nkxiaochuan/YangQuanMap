/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import com.thoughtworks.xstream.converters.SingleValueConverter;
/*    */ 
/*    */ public class IntegerSingleValueConverter
/*    */   implements SingleValueConverter
/*    */ {
/*    */   public Object fromString(String arg0)
/*    */   {
/* 11 */     if ((arg0 == null) || ("".equals(arg0)))
/*    */     {
/* 13 */       return null;
/*    */     }
/*    */ 
/* 16 */     return new Integer(arg0);
/*    */   }
/*    */ 
/*    */   public String toString(Object arg0)
/*    */   {
/* 23 */     if (arg0 != null) {
/* 24 */       return arg0.toString();
/*    */     }
/* 26 */     return null;
/*    */   }
/*    */ 
/*    */   public boolean canConvert(Class arg0)
/*    */   {
/* 33 */     return arg0.equals(Integer.class);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.IntegerSingleValueConverter
 * JD-Core Version:    0.6.0
 */