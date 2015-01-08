/*     */ package com;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.security.Key;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.interfaces.RSAPrivateKey;
/*     */ import java.security.interfaces.RSAPublicKey;
/*     */ import java.security.spec.PKCS8EncodedKeySpec;
/*     */ import java.security.spec.X509EncodedKeySpec;
/*     */ import javax.crypto.Cipher;
/*     */ import sun.misc.BASE64Decoder;
/*     */ import sun.misc.BASE64Encoder;
/*     */ 
/*     */ public class RSA
/*     */ {
/*     */   public static PublicKey getPublicKey(String key)
/*     */     throws Exception
/*     */   {
/*  29 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(key);
/*     */ 
/*  31 */     X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
/*  32 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*  33 */     PublicKey publicKey = keyFactory.generatePublic(keySpec);
/*  34 */     return publicKey;
/*     */   }
/*     */ 
/*     */   public static PrivateKey getPrivateKey(String key)
/*     */     throws Exception
/*     */   {
/*  43 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(key);
/*     */ 
/*  45 */     PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
/*  46 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*  47 */     PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
/*  48 */     return privateKey;
/*     */   }
/*     */ 
/*     */   public static String getKeyString(Key key)
/*     */     throws Exception
/*     */   {
/*  56 */     byte[] keyBytes = key.getEncoded();
/*  57 */     String s = new BASE64Encoder().encode(keyBytes);
/*  58 */     return s;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */     throws Exception
/*     */   {
/*  64 */     KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
/*     */ 
/*  66 */     keyPairGen.initialize(1024);
/*     */ 
/*  68 */     KeyPair keyPair = keyPairGen.generateKeyPair();
/*     */ 
/*  71 */     PublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
/*     */ 
/*  74 */     PrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
/*     */ 
/*  76 */     String publicKeyString = getKeyString(publicKey);
/*  77 */     System.out.println("public:\n" + publicKeyString);
/*     */ 
/*  79 */     String privateKeyString = getKeyString(privateKey);
/*  80 */     System.out.println("private:\n" + privateKeyString);
/*     */ 
/*  83 */     Cipher cipher = Cipher.getInstance("RSA");
/*     */ 
/*  86 */     byte[] plainText = "我们都很好！邮件：@sina.com".getBytes();
/*     */ 
/*  89 */     cipher.init(1, publicKey);
/*  90 */     byte[] enBytes = cipher.doFinal(plainText);
/*     */ 
/*  93 */     publicKey = getPublicKey(publicKeyString);
/*  94 */     privateKey = getPrivateKey(privateKeyString);
/*     */ 
/*  97 */     cipher.init(2, privateKey);
/*  98 */     byte[] deBytes = cipher.doFinal(enBytes);
/*     */ 
/* 100 */     publicKeyString = getKeyString(publicKey);
/* 101 */     System.out.println("public:\n" + publicKeyString);
/*     */ 
/* 103 */     privateKeyString = getKeyString(privateKey);
/* 104 */     System.out.println("private:\n" + privateKeyString);
/*     */ 
/* 106 */     String s = new String(deBytes);
/* 107 */     System.out.println(s);
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.RSA
 * JD-Core Version:    0.6.0
 */