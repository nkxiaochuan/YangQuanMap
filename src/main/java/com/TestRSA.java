/*    */ package com;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class TestRSA
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/*  7 */     RSAHelper helper = new RSAHelper();
/*  8 */     Map keyMap = RSAHelper.initKey();
/*  9 */     byte[] data = new String("你好").getBytes();
/* 10 */     String publicKey = "";
/* 11 */     String privateKey = "";
/*    */ 
/* 21 */     publicKey = RSAHelper.getPublicKey(keyMap);
/* 22 */     privateKey = RSAHelper.getPrivateKey(keyMap);
/*    */ 
/* 39 */     byte[] enData = RSAHelper.encryptByPublicKey(data, publicKey);
/* 40 */     byte[] deData = RSAHelper.decryptByPrivateKey(enData, privateKey);
/*    */ 
/* 42 */     System.out.print("公钥：" + publicKey);
/* 43 */     System.out.print("私钥：" + privateKey);
/* 44 */     System.out.println("-----------------");
/* 45 */     System.out.print("加密后数据：" + new String(enData, "utf8"));
/* 46 */     System.out.print("解密后数据：" + new String(deData, "GBK"));
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.TestRSA
 * JD-Core Version:    0.6.0
 */