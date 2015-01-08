/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import com.sinosoft.sysframework.common.datatype.DateTime;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class DateTimeUtils
/*    */ {
/* 20 */   private static Logger logger = Logger.getLogger(TrimUtils.class);
/*    */ 
/*    */   public static String formatDateAdd(int days)
/*    */   {
/* 30 */     Calendar calendar = Calendar.getInstance();
/* 31 */     calendar.add(5, days);
/* 32 */     int year = calendar.get(1);
/* 33 */     int month = calendar.get(2) + 1;
/* 34 */     int day = calendar.get(5);
/* 35 */     StringBuffer date = new StringBuffer();
/* 36 */     date = date.append(year).append("-").append(month).append("-").append(
/* 37 */       day);
/*    */ 
/* 39 */     return date.toString();
/*    */   }
/*    */ 
/*    */   public static String formatDateTimeAdd(int days)
/*    */   {
/* 50 */     Calendar calendar = Calendar.getInstance();
/* 51 */     if (days != 0) {
/* 52 */       calendar.add(5, -(days - 1));
/*    */     }
/* 54 */     int year = calendar.get(1);
/* 55 */     int month = calendar.get(2) + 1;
/* 56 */     int day = calendar.get(5);
/* 57 */     int hour = calendar.get(10);
/* 58 */     int minite = calendar.get(12);
/* 59 */     int second = calendar.get(13);
/*    */ 
/* 61 */     StringBuffer date = new StringBuffer();
/* 62 */     date = date.append(year).append("-").append(month).append("-").append(
/* 63 */       day).append(" ").append(hour).append(":").append(minite)
/* 64 */       .append(":").append(second);
/* 65 */     return date.toString();
/*    */   }
/*    */ 
/*    */   public static String formatDate(String date)
/*    */   {
/* 76 */     if (date == null) {
/* 77 */       return "";
/*    */     }
/* 79 */     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
/* 80 */     DateTime dDate = new DateTime(date);
/* 81 */     return format.format(dDate);
/*    */   }
/*    */ 
/*    */   public static String formatDateTime(Date date)
/*    */   {
/* 86 */     if (date == null) {
/* 87 */       return "";
/*    */     }
/* 89 */     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 90 */     return format.format(date);
/*    */   }
/*    */ 
/*    */   public static String formatDate(Date date)
/*    */   {
/* 95 */     if (date == null) {
/* 96 */       return "";
/*    */     }
/* 98 */     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
/* 99 */     return format.format(date);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.DateTimeUtils
 * JD-Core Version:    0.6.0
 */