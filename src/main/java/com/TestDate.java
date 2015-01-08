/*    */ package com;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class TestDate
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 10 */     Calendar calendar = Calendar.getInstance();
/* 11 */     Date date = new Date();
/* 12 */     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd-hh-MM-ss");
/* 13 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 14 */     String strDate = sdf.format(date);
/* 15 */     System.out.println(strDate);
/*    */ 
/* 17 */     int year = calendar.get(1);
/* 18 */     int month = calendar.get(2) + 1;
/* 19 */     int day = calendar.get(5);
/* 20 */     int hour = calendar.get(11);
/* 21 */     System.out.println(year + "-" + month + "-" + day + "-" + hour);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.TestDate
 * JD-Core Version:    0.6.0
 */