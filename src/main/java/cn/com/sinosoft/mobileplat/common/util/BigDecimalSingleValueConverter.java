/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import com.thoughtworks.xstream.converters.SingleValueConverter;
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ public class BigDecimalSingleValueConverter
/*    */   implements SingleValueConverter
/*    */ {
/*    */   public Object fromString(String arg0)
/*    */   {
/* 14 */     if ((arg0 == null) || ("".equals(arg0))) {
/* 15 */       return null;
/*    */     }
/* 17 */     return new BigDecimal(arg0);
/*    */   }
/*    */ 
/*    */   public String toString(Object arg0)
/*    */   {
/* 23 */     if (arg0 != null)
/*    */     {
/* 25 */       return arg0.toString();
/*    */     }
/* 27 */     return null;
/*    */   }
/*    */ 
/*    */   public boolean canConvert(Class arg0)
/*    */   {
/* 34 */     return arg0.equals(BigDecimal.class);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.BigDecimalSingleValueConverter
 * JD-Core Version:    0.6.0
 */