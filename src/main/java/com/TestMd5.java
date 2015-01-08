/*    */ package com;
/*    */ 
/*    */ import java.security.MessageDigest;
/*    */ 
/*    */ public class TestMd5
/*    */ {
/*    */   public static final String MD5(String s)
/*    */   {
/* 14 */     char[] hexDigits = { 
/* 15 */       '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 
/* 16 */       'E', 'F' };
/*    */     try {
/* 18 */       byte[] strTemp = s.getBytes();
/* 19 */       MessageDigest mdTemp = MessageDigest.getInstance("MD5");
/* 20 */       mdTemp.update(strTemp);
/* 21 */       byte[] md = mdTemp.digest();
/* 22 */       int j = md.length;
/* 23 */       char[] str = new char[j * 2];
/* 24 */       int k = 0;
/* 25 */       for (int i = 0; i < j; i++) {
/* 26 */         byte byte0 = md[i];
/* 27 */         str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
/* 28 */         str[(k++)] = hexDigits[(byte0 & 0xF)];
/*    */       }
/* 30 */       return new String(str); } catch (Exception e) {
/*    */     }
/* 32 */     return null;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.TestMd5
 * JD-Core Version:    0.6.0
 */