/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import com.thoughtworks.xstream.converters.SingleValueConverter;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class DateSingleValueConverter
/*    */   implements SingleValueConverter
/*    */ {
/* 12 */   private SimpleDateFormat dsf0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*    */ 
/* 14 */   private SimpleDateFormat dsf2 = new SimpleDateFormat("yyyy-MM-dd");
/*    */ 
/*    */   public Object fromString(String arg0)
/*    */   {
/* 18 */     if ((arg0 == null) || ("".equals(arg0)))
/* 19 */       return null;
/*    */     try
/*    */     {
/*    */       Date d;
/* 24 */       if (arg0.length() <= 10)
/* 25 */         d = this.dsf2.parse(arg0);
/*    */       else {
/* 27 */         d = this.dsf0.parse(arg0);
/*    */       }
/* 29 */       return d; } catch (ParseException e) {
/*    */     }
/* 31 */     throw new RuntimeException();
/*    */   }
/*    */ 
/*    */   public String toString(Object arg0)
/*    */   {
/* 37 */     if (arg0 != null) {
/* 38 */       SimpleDateFormat dsf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 39 */       return dsf.format((Date)arg0);
/*    */     }
/* 41 */     return null;
/*    */   }
/*    */ 
/*    */   public boolean canConvert(Class arg0)
/*    */   {
/* 48 */     return arg0.equals(Date.class);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.DateSingleValueConverter
 * JD-Core Version:    0.6.0
 */