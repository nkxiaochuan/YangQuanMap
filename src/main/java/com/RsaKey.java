/*    */ package com;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.math.BigInteger;
/*    */ import java.security.KeyFactory;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.PublicKey;
/*    */ import java.security.spec.RSAPrivateKeySpec;
/*    */ import java.security.spec.RSAPublicKeySpec;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public class RsaKey
/*    */ {
/*    */   public PublicKey getPublicKey(String modulus, String publicExponent)
/*    */     throws Exception
/*    */   {
/* 29 */     BigInteger m = new BigInteger(modulus, 16);
/*    */ 
/* 31 */     BigInteger e = new BigInteger(publicExponent);
/*    */ 
/* 33 */     RSAPublicKeySpec keySpec = new RSAPublicKeySpec(m, e);
/*    */ 
/* 35 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*    */ 
/* 37 */     PublicKey publicKey = keyFactory.generatePublic(keySpec);
/*    */ 
/* 39 */     return publicKey;
/*    */   }
/*    */ 
/*    */   public PrivateKey getPrivateKey(String modulus, String privateExponent)
/*    */     throws Exception
/*    */   {
/* 47 */     BigInteger m = new BigInteger(modulus, 16);
/*    */ 
/* 49 */     BigInteger e = new BigInteger(privateExponent, 16);
/*    */ 
/* 51 */     RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(m, e);
/*    */ 
/* 53 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*    */ 
/* 55 */     PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
/*    */ 
/* 57 */     return privateKey;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 66 */     String modulus = "00DD3E340EAC5FD69A05D908B37EB31ADBFA9D97B698FCCE8353EE527CF0AA58D59A894B19CD83C4D746001DD8A9EEA396F751E43A588A6F2DFE771E4B6943B0F91137ED4678B02CC1C22CD766B9233278F5DD12BAC0F531977BF935D8A637190847123A88BB2B5BD38A7F18944D80F60495BACDCE706603B974818113091335ED";
/*    */ 
/* 69 */     String publicExponent = "10001";
/*    */ 
/* 72 */     String privateExponet = "379A858CD687B3B0BC1D82D151DB83B99BAFF5CC3F80F20A1193090A3B96248372B664B8946D349082184F67FFB56949ECD8990A8CEC25EB22541FBA0637AC07450CE230373489A4C0BDF0EBFA9A92A4B53A2B364B79D9223230B13C7A7A520F07AB4164A8E47AC2A590ADE455EDF89A32859798038AED3BB7FDF59B69F7C5E1";
/*    */ 
/* 77 */     RsaKey key = new RsaKey();
/*    */ 
/* 79 */     PublicKey publicKey = key.getPublicKey(modulus, publicExponent);
/*    */ 
/* 81 */     PrivateKey privateKey = key.getPrivateKey(modulus, privateExponet);
/*    */ 
/* 86 */     Cipher cipher = Cipher.getInstance("RSA");
/*    */ 
/* 89 */     byte[] plainText = "我们都很好！邮件：@sina.com".getBytes();
/*    */ 
/* 92 */     cipher.init(1, publicKey);
/*    */ 
/* 94 */     byte[] enBytes = cipher.doFinal(plainText);
/*    */ 
/* 96 */     cipher.init(2, privateKey);
/* 97 */     byte[] deBytes = cipher.doFinal(enBytes);
/* 98 */     String s = new String(deBytes);
/* 99 */     System.out.println(s);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.RsaKey
 * JD-Core Version:    0.6.0
 */