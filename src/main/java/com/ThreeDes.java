/*    */ package com;
/*    */ 
/*    */ import com.sun.crypto.provider.SunJCE;
/*    */ import com.thoughtworks.xstream.core.util.Base64Encoder;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintStream;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.Security;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.NoSuchPaddingException;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.spec.SecretKeySpec;
/*    */ import sun.misc.BASE64Decoder;
/*    */ 
/*    */ public class ThreeDes
/*    */ {
/*    */   private static final String Algorithm = "DESede";
/*    */ 
/*    */   public static byte[] encryptMode(byte[] keybyte, byte[] src)
/*    */   {
/*    */     try
/*    */     {
/* 23 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*    */ 
/* 25 */       Cipher c1 = Cipher.getInstance("DESede");
/* 26 */       c1.init(1, deskey);
/* 27 */       return c1.doFinal(src);
/*    */     } catch (NoSuchAlgorithmException e1) {
/* 29 */       e1.printStackTrace();
/*    */     } catch (NoSuchPaddingException e2) {
/* 31 */       e2.printStackTrace();
/*    */     } catch (Exception e3) {
/* 33 */       e3.printStackTrace();
/*    */     }
/* 35 */     return null;
/*    */   }
/*    */ 
/*    */   public static byte[] decryptMode(byte[] keybyte, byte[] src)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*    */ 
/* 44 */       Cipher c1 = Cipher.getInstance("DESede");
/* 45 */       c1.init(2, deskey);
/* 46 */       return c1.doFinal(src);
/*    */     } catch (NoSuchAlgorithmException e1) {
/* 48 */       e1.printStackTrace();
/*    */     } catch (NoSuchPaddingException e2) {
/* 50 */       e2.printStackTrace();
/*    */     } catch (Exception e3) {
/* 52 */       e3.printStackTrace();
/*    */     }
/* 54 */     return null;
/*    */   }
/*    */ 
/*    */   public static String byte2hex(byte[] b)
/*    */   {
/* 59 */     String hs = "";
/* 60 */     String stmp = "";
/* 61 */     for (int n = 0; n < b.length; n++) {
/* 62 */       stmp = Integer.toHexString(b[n] & 0xFF);
/* 63 */       if (stmp.length() == 1) hs = hs + "0" + stmp; else
/* 64 */         hs = hs + stmp;
/* 65 */       if (n >= b.length - 1) continue; hs = hs + ":";
/*    */     }
/* 67 */     return hs.toUpperCase();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) throws IOException
/*    */   {
/* 72 */     Security.addProvider(new SunJCE());
/* 73 */     byte[] keyBytes = { 
/* 74 */       17, 34, 79, 88, 
/* 75 */       -120, 16, 64, 56, 
/* 76 */       40, 37, 121, 81, -53, 
/* 77 */       -35, 85, 102, 119, 41, 116, 
/* 78 */       -104, 48, 64, 54, -30 };
/* 79 */     String key = new Base64Encoder().encode(keyBytes);
/* 80 */     System.out.println(key);
/*    */ 
/* 82 */     String dekey = "ESJPWIgQQDgoJXlRy91VZncpdJgwQDbi";
/* 83 */     keyBytes = new BASE64Decoder().decodeBuffer(dekey);
/*    */ 
/* 85 */     String szSrc = "This is a 3DES test. 测试";
/* 86 */     System.out.println("加密前的字符串:" + szSrc);
/* 87 */     byte[] encoded = encryptMode(keyBytes, szSrc.getBytes());
/* 88 */     System.out.println("加密后的字符串:" + new String(encoded));
/* 89 */     byte[] srcBytes = decryptMode(keyBytes, encoded);
/* 90 */     System.out.println("解密后的字符串:" + new String(srcBytes));
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.ThreeDes
 * JD-Core Version:    0.6.0
 */