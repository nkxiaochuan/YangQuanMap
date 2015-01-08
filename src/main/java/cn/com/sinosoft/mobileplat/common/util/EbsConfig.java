/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.net.URL;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.Properties;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ 
/*     */ public class EbsConfig extends HttpServlet
/*     */ {
/*     */   public String getConfigPath()
/*     */   {
/*  16 */     String configPath = null;
/*  17 */     if ((configPath == null) || (configPath.trim().length() == 0)) {
/*  18 */       String classPath = getClass().getResource("").getPath();
/*  19 */       configPath = classPath.substring(0, classPath.lastIndexOf("classes"));
/*     */     }
/*     */ 
/*  22 */     configPath = configPath + "config/";
/*  23 */     return configPath;
/*     */   }
/*     */ 
/*     */   public String getCertificatePath()
/*     */   {
/*  28 */     String certificatePath = null;
/*  29 */     if ((certificatePath == null) || (certificatePath.trim().length() == 0)) {
/*  30 */       String classPath = getClass().getResource("").getPath();
/*  31 */       certificatePath = classPath.substring(0, classPath.lastIndexOf("classes"));
/*     */     }
/*  33 */     certificatePath = certificatePath + "certificate/";
/*  34 */     return certificatePath;
/*     */   }
/*     */ 
/*     */   public String getRootPath() {
/*  38 */     String configPath = null;
/*  39 */     if ((configPath == null) || (configPath.trim().length() == 0)) {
/*  40 */       String classPath = getClass().getResource("").getPath();
/*  41 */       configPath = classPath.substring(0, classPath.lastIndexOf("classes"));
/*     */     }
/*     */ 
/*  44 */     configPath = configPath + "config/";
/*  45 */     return configPath;
/*     */   }
/*     */ 
/*     */   public Properties getProperties(String propertiesName) {
/*  49 */     Properties properties = new Properties();
/*     */     try {
/*  51 */       if ((propertiesName.equals("")) || (propertiesName == null)) {
/*  52 */         throw new Exception("配置文件名称为空");
/*     */       }
/*  54 */       File file = new File(getConfigPath() + propertiesName);
/*  55 */       FileInputStream fileInputStream = new FileInputStream(file);
/*  56 */       InputStream inputStream = fileInputStream;
/*  57 */       properties.load(inputStream);
/*  58 */       inputStream.close();
/*  59 */       fileInputStream.close();
/*     */     } catch (Exception e) {
/*  61 */       e.printStackTrace();
/*     */     }
/*     */ 
/*  64 */     return properties;
/*     */   }
/*     */ 
/*     */   public void updateProperties(String propertiesName, String key, String value, String comment) {
/*  68 */     Properties properties = getProperties(propertiesName);
/*     */     try {
/*     */       try {
/*  71 */         properties.setProperty(key, value);
/*     */       } catch (Exception e) {
/*  73 */         throw new Exception("没有该节点", e);
/*     */       }
/*  75 */       if ((propertiesName.equals("")) && (propertiesName == null)) {
/*  76 */         throw new Exception("配置文件名称为空");
/*     */       }
/*  78 */       File file = new File(getConfigPath() + propertiesName);
/*  79 */       FileOutputStream fileOutputStream = new FileOutputStream(file);
/*  80 */       OutputStream outputStream = fileOutputStream;
/*  81 */       properties.store(outputStream, new String(comment.getBytes("utf-8"), "iso8859-1"));
/*  82 */       outputStream.flush();
/*  83 */       outputStream.close();
/*  84 */       fileOutputStream.close();
/*     */     } catch (Exception e) {
/*  86 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) {
/*  91 */     EbsConfig ebsConfig = new EbsConfig();
/*     */ 
/*  93 */     ebsConfig.getDate();
/*     */   }
/*     */ 
/*     */   public void getDate() {
/*  97 */     GregorianCalendar calendar = new GregorianCalendar();
/*  98 */     calendar.set(2008, 2, 1);
/*  99 */     calendar.add(5, -2);
/* 100 */     System.out.println(calendar.getTime().toString());
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.EbsConfig
 * JD-Core Version:    0.6.0
 */