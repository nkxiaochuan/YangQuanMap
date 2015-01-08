/*     */ package com;
/*     */ 
/*     */ import java.security.Key;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.Signature;
/*     */ import java.security.interfaces.RSAPrivateKey;
/*     */ import java.security.interfaces.RSAPublicKey;
/*     */ import java.security.spec.PKCS8EncodedKeySpec;
/*     */ import java.security.spec.X509EncodedKeySpec;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.crypto.Cipher;
/*     */ import sun.misc.BASE64Decoder;
/*     */ import sun.misc.BASE64Encoder;
/*     */ 
/*     */ public class RSAHelper
/*     */ {
/*     */   public static final String KEY_ALGORITHM = "RSA";
/*     */   public static final String SIGNATURE_ALGORITHM = "MD5withRSA";
/*     */   private static final String PUBLIC_KEY = "RSAPublicKey";
/*     */   private static final String PRIVATE_KEY = "RSAPrivateKey";
/*     */ 
/*     */   public static String sign(byte[] data, String privateKey)
/*     */     throws Exception
/*     */   {
/*  42 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(privateKey);
/*     */ 
/*  45 */     PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
/*     */ 
/*  48 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*     */ 
/*  51 */     PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
/*     */ 
/*  54 */     Signature signature = Signature.getInstance("MD5withRSA");
/*  55 */     signature.initSign(priKey);
/*  56 */     signature.update(data);
/*     */ 
/*  58 */     return signature.toString();
/*     */   }
/*     */ 
/*     */   public static boolean verify(byte[] data, String publicKey, String sign)
/*     */     throws Exception
/*     */   {
/*  79 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(publicKey);
/*     */ 
/*  82 */     X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
/*     */ 
/*  85 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*     */ 
/*  88 */     PublicKey pubKey = keyFactory.generatePublic(keySpec);
/*     */ 
/*  90 */     Signature signature = Signature.getInstance("MD5withRSA");
/*  91 */     signature.initVerify(pubKey);
/*  92 */     signature.update(data);
/*     */ 
/*  95 */     return signature.verify(sign.getBytes());
/*     */   }
/*     */ 
/*     */   public static byte[] decryptByPrivateKey(byte[] data, String key)
/*     */     throws Exception
/*     */   {
/* 110 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(key);
/*     */ 
/* 113 */     PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
/* 114 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/* 115 */     Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
/*     */ 
/* 118 */     Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
/* 119 */     cipher.init(2, privateKey);
/*     */ 
/* 121 */     return cipher.doFinal(data);
/*     */   }
/*     */ 
/*     */   public static byte[] decryptByPublicKey(byte[] data, String key)
/*     */     throws Exception
/*     */   {
/* 136 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(key);
/*     */ 
/* 139 */     X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
/* 140 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/* 141 */     Key publicKey = keyFactory.generatePublic(x509KeySpec);
/*     */ 
/* 144 */     Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
/* 145 */     cipher.init(2, publicKey);
/*     */ 
/* 147 */     return cipher.doFinal(data);
/*     */   }
/*     */ 
/*     */   public static byte[] encryptByPublicKey(byte[] data, String key)
/*     */     throws Exception
/*     */   {
/* 162 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(key);
/*     */ 
/* 165 */     X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
/* 166 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/* 167 */     Key publicKey = keyFactory.generatePublic(x509KeySpec);
/*     */ 
/* 170 */     Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
/* 171 */     cipher.init(1, publicKey);
/*     */ 
/* 173 */     return cipher.doFinal(data);
/*     */   }
/*     */ 
/*     */   public static byte[] encryptByPrivateKey(byte[] data, String key)
/*     */     throws Exception
/*     */   {
/* 188 */     byte[] keyBytes = new BASE64Decoder().decodeBuffer(key);
/*     */ 
/* 191 */     PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
/* 192 */     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/* 193 */     Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
/*     */ 
/* 196 */     Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
/* 197 */     cipher.init(1, privateKey);
/*     */ 
/* 199 */     return cipher.doFinal(data);
/*     */   }
/*     */ 
/*     */   public static String getPrivateKey(Map<String, Object> keyMap)
/*     */     throws Exception
/*     */   {
/* 211 */     Key key = (Key)keyMap.get("RSAPrivateKey");
/*     */ 
/* 213 */     return new BASE64Encoder().encodeBuffer(key.getEncoded());
/*     */   }
/*     */ 
/*     */   public static String getPublicKey(Map<String, Object> keyMap)
/*     */     throws Exception
/*     */   {
/* 225 */     Key key = (Key)keyMap.get("RSAPublicKey");
/*     */ 
/* 227 */     return new BASE64Encoder().encodeBuffer(key.getEncoded());
/*     */   }
/*     */ 
/*     */   public static Map<String, Object> initKey()
/*     */     throws Exception
/*     */   {
/* 237 */     KeyPairGenerator keyPairGen = 
/* 238 */       KeyPairGenerator.getInstance("RSA");
/* 239 */     keyPairGen.initialize(512);
/*     */ 
/* 241 */     KeyPair keyPair = keyPairGen.generateKeyPair();
/*     */ 
/* 244 */     RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
/*     */ 
/* 247 */     RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
/*     */ 
/* 249 */     Map keyMap = new HashMap(2);
/*     */ 
/* 251 */     keyMap.put("RSAPublicKey", publicKey);
/* 252 */     keyMap.put("RSAPrivateKey", privateKey);
/* 253 */     return keyMap;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.RSAHelper
 * JD-Core Version:    0.6.0
 */