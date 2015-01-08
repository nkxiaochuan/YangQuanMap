/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import com.sun.crypto.provider.SunJCE;
/*     */ import java.io.PrintStream;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.Security;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.NoSuchPaddingException;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ import sun.misc.BASE64Decoder;
/*     */ import sun.misc.BASE64Encoder;
/*     */ 
/*     */ public class ThreeDes
/*     */ {
/*     */   private static final String Algorithm = "DESede";
/*     */   private static final String enkey24 = "MDEyMzQ1Njc4OTAxMjM0NTY3";
/*     */   private static final String dekey24 = "TURFeU16UTFOamM0T1RBeE1q";
/*  20 */   public static final String enKey_Base64 = new BASE64Encoder().encode("MDEyMzQ1Njc4OTAxMjM0NTY3".getBytes());
/*     */ 
/*  22 */   public static final String deKey_Base64 = new BASE64Encoder().encode("TURFeU16UTFOamM0T1RBeE1q".getBytes());
/*     */ 
/*     */   public static byte[] encryptMode(byte[] keybyte, byte[] src)
/*     */   {
/*     */     try
/*     */     {
/*  30 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/*  32 */       Cipher c1 = Cipher.getInstance("DESede");
/*  33 */       c1.init(1, deskey);
/*  34 */       return c1.doFinal(src);
/*     */     } catch (NoSuchAlgorithmException e1) {
/*  36 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/*  38 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/*  40 */       e3.printStackTrace();
/*     */     }
/*  42 */     return null;
/*     */   }
/*     */ 
/*     */   public static byte[] decryptMode(byte[] keybyte, byte[] src)
/*     */   {
/*     */     try
/*     */     {
/*  49 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/*  51 */       Cipher c1 = Cipher.getInstance("DESede");
/*  52 */       c1.init(2, deskey);
/*  53 */       return c1.doFinal(src);
/*     */     } catch (NoSuchAlgorithmException e1) {
/*  55 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/*  57 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/*  59 */       e3.printStackTrace();
/*     */     }
/*  61 */     return null;
/*     */   }
/*     */ 
/*     */   public static byte[] encryptMode(String enKey_Base64, byte[] src)
/*     */   {
/*     */     try
/*     */     {
/*  74 */       byte[] keybyte = new byte[24];
/*  75 */       keybyte = new BASE64Decoder().decodeBuffer(enKey_Base64);
/*     */ 
/*  77 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/*  79 */       Cipher c1 = Cipher.getInstance("DESede");
/*  80 */       c1.init(1, deskey);
/*  81 */       return c1.doFinal(src);
/*     */     } catch (NoSuchAlgorithmException e1) {
/*  83 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/*  85 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/*  87 */       e3.printStackTrace();
/*     */     }
/*  89 */     return null;
/*     */   }
/*     */ 
/*     */   public static byte[] decryptMode(String deKey_Base64, byte[] src)
/*     */   {
/*     */     try
/*     */     {
/* 102 */       byte[] keybyte = new byte[24];
/* 103 */       keybyte = new BASE64Decoder().decodeBuffer(deKey_Base64);
/*     */ 
/* 105 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/* 107 */       Cipher c1 = Cipher.getInstance("DESede");
/* 108 */       c1.init(2, deskey);
/* 109 */       return c1.doFinal(src);
/*     */     } catch (NoSuchAlgorithmException e1) {
/* 111 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/* 113 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/* 115 */       e3.printStackTrace();
/*     */     }
/* 117 */     return null;
/*     */   }
/*     */ 
/*     */   public static String encryptMode(String enKey_Base64, String enSrc)
/*     */   {
/*     */     try
/*     */     {
/* 130 */       byte[] src = enSrc.getBytes();
/* 131 */       byte[] keybyte = new byte[24];
/* 132 */       keybyte = new BASE64Decoder().decodeBuffer(enKey_Base64);
/*     */ 
/* 134 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/* 136 */       Cipher c1 = Cipher.getInstance("DESede");
/* 137 */       c1.init(1, deskey);
/* 138 */       return new BASE64Encoder().encode(c1.doFinal(src));
/*     */     } catch (NoSuchAlgorithmException e1) {
/* 140 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/* 142 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/* 144 */       e3.printStackTrace();
/*     */     }
/* 146 */     return null;
/*     */   }
/*     */ 
/*     */   public static byte[] decryptMode(String deKey_Base64, String deSrc)
/*     */   {
/*     */     try
/*     */     {
/* 159 */       byte[] keybyte = new byte[24];
/* 160 */       byte[] src = new BASE64Decoder().decodeBuffer(deSrc);
/* 161 */       keybyte = new BASE64Decoder().decodeBuffer(deKey_Base64);
/*     */ 
/* 163 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/* 165 */       Cipher c1 = Cipher.getInstance("DESede");
/* 166 */       c1.init(2, deskey);
/* 167 */       return c1.doFinal(src);
/*     */     } catch (NoSuchAlgorithmException e1) {
/* 169 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/* 171 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/* 173 */       e3.printStackTrace();
/*     */     }
/* 175 */     return null;
/*     */   }
/*     */ 
/*     */   public static String encryptMode(String str)
/*     */     throws Exception
/*     */   {
/* 185 */     byte[] src = str.getBytes();
/*     */ 
/* 188 */     String key_Base64 = "TURFeU16UTFOamM0T1RBeE1qTTBOVFkz";
/* 189 */     byte[] keybyte = new byte[24];
/* 190 */     keybyte = new BASE64Decoder().decodeBuffer(key_Base64);
/*     */     try
/*     */     {
/* 193 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/* 195 */       Cipher c1 = Cipher.getInstance("DESede");
/* 196 */       c1.init(1, deskey);
/* 197 */       return new BASE64Encoder().encode(c1.doFinal(src));
/*     */     } catch (NoSuchAlgorithmException e1) {
/* 199 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/* 201 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/* 203 */       e3.printStackTrace();
/*     */     }
/* 205 */     return null;
/*     */   }
/*     */ 
/*     */   public static byte[] decryptMode(String encodedBase64)
/*     */     throws Exception
/*     */   {
/* 215 */     byte[] encoded = new BASE64Decoder().decodeBuffer(encodedBase64);
/*     */ 
/* 218 */     String key_Base64 = "TURFeU16UTFOamM0T1RBeE1qTTBOVFkz";
/* 219 */     byte[] keybyte = new byte[24];
/* 220 */     keybyte = new BASE64Decoder().decodeBuffer(key_Base64);
/*     */     try
/*     */     {
/* 223 */       SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
/*     */ 
/* 225 */       Cipher c1 = Cipher.getInstance("DESede");
/* 226 */       c1.init(2, deskey);
/* 227 */       return c1.doFinal(encoded);
/*     */     } catch (NoSuchAlgorithmException e1) {
/* 229 */       e1.printStackTrace();
/*     */     } catch (NoSuchPaddingException e2) {
/* 231 */       e2.printStackTrace();
/*     */     } catch (Exception e3) {
/* 233 */       e3.printStackTrace();
/*     */     }
/* 235 */     return null;
/*     */   }
/*     */ 
/*     */   public static String byte2hex(byte[] b)
/*     */   {
/* 240 */     String hs = "";
/* 241 */     String stmp = "";
/* 242 */     for (int n = 0; n < b.length; n++) {
/* 243 */       stmp = Integer.toHexString(b[n] & 0xFF);
/* 244 */       if (stmp.length() == 1) hs = hs + "0" + stmp; else
/* 245 */         hs = hs + stmp;
/* 246 */       if (n >= b.length - 1) continue; hs = hs + ":";
/*     */     }
/* 248 */     return hs.toUpperCase();
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) throws Exception
/*     */   {
/* 253 */     Security.addProvider(new SunJCE());
/* 254 */     byte[] keyBytes = { 
/* 255 */       17, 34, 79, 88, 
/* 256 */       -120, 16, 64, 56, 
/* 257 */       40, 37, 121, 81, -53, 
/* 258 */       -35, 85, 102, 119, 41, 116, 
/* 259 */       -104, 48, 64, 54, -30 };
/* 260 */     String key = new BASE64Encoder().encode(keyBytes);
/*     */ 
/* 263 */     String dekey = "TURFeU16UTFOamM0T1RBeE1qTTBOVFkz";
/* 264 */     keyBytes = new BASE64Decoder().decodeBuffer(dekey);
/*     */ 
/* 266 */     String enkey24 = "MDEyMzQ1Njc4OTAxMjM0NTY3";
/*     */ 
/* 268 */     String dekey24 = "TURFeU16UTFOamM0T1RBeE1q";
/*     */ 
/* 270 */     String enKey_Base64 = new BASE64Encoder().encode(enkey24.getBytes());
/*     */ 
/* 272 */     String deKey_Base64 = new BASE64Encoder().encode(dekey24.getBytes());
/*     */ 
/* 295 */     String enBase64 = "4FyK9aUB9Vc=";
/*     */ 
/* 297 */     System.out.println("½âÃÜºóµÄ×Ö·û´®:" + new String(decryptMode(deKey_Base64, enBase64)));
/*     */ 
/* 299 */     String enSrcStr = "ºÚ a87544";
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.ThreeDes
 * JD-Core Version:    0.6.0
 */