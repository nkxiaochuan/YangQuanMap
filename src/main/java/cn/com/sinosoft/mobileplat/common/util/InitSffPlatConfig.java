/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import com.sinosoft.sysframework.common.util.PlatformUtils;
/*     */ import com.sinosoft.utility.SysConst;
/*     */ import java.net.URL;
/*     */ import javax.servlet.ServletContext;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.SingleThreadModel;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ 
/*     */ public class InitSffPlatConfig extends HttpServlet
/*     */   implements SingleThreadModel
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  34 */   private static boolean isInited = false;
/*     */ 
/*     */   public void init()
/*     */     throws ServletException
/*     */   {
/*  41 */     if (isInited)
/*  42 */       return;
/*     */     try
/*     */     {
/*  45 */       String configPath = getServletContext().getRealPath("/");
/*  46 */       if ((configPath == null) || (configPath.trim().length() == 0)) {
/*  47 */         String actionPathName = getRealPathName(SysConst.class);
/*  48 */         configPath = actionPathName.substring(0, actionPathName.lastIndexOf("/WEB-INF"));
/*     */       }
/*  50 */       if (!configPath.endsWith(PlatformUtils.FILE_SEPARATOR))
/*     */       {
/*  52 */         configPath = configPath + PlatformUtils.FILE_SEPARATOR;
/*     */       }
/*  54 */       String configPath_back = configPath;
/*     */ 
/*  56 */       StringBuffer buffer1 = new StringBuffer(256);
/*  57 */       buffer1.append(configPath);
/*  58 */       buffer1.append("WEB-INF");
/*  59 */       buffer1.append(PlatformUtils.FILE_SEPARATOR);
/*  60 */       buffer1.append("config");
/*  61 */       buffer1.append(PlatformUtils.FILE_SEPARATOR);
/*  62 */       String buffBak = buffer1.toString();
/*     */ 
/*  64 */       buffer1.delete(0, buffer1.length());
/*  65 */       buffer1.append(buffBak);
/*  66 */       buffer1.append("SffPlatConfig.xml");
/*  67 */       SffPlatConfig.init(buffer1.toString(), true);
/*     */ 
/*  76 */       isInited = true;
/*     */     } catch (Exception ex) {
/*  78 */       ex.printStackTrace();
/*  79 */       throw new ServletException(ex);
/*     */     }
/*     */   }
/*     */ 
/*     */   private static String getRealPathName(Class cl)
/*     */   {
/*  85 */     URL url = cl.getResource(getClassNameWithoutPackage(cl) + ".class");
/*  86 */     if (url != null)
/*     */     {
/*  88 */       return url.getPath();
/*     */     }
/*     */ 
/*  92 */     return null;
/*     */   }
/*     */ 
/*     */   private static String getClassNameWithoutPackage(Class cl)
/*     */   {
/*  97 */     String className = cl.getName();
/*  98 */     int pos = className.lastIndexOf('.') + 1;
/*  99 */     if (pos == -1)
/*     */     {
/* 101 */       pos = 0;
/*     */     }
/* 103 */     String name = className.substring(pos);
/* 104 */     return name;
/*     */   }
/*     */ 
/*     */   public void destroy()
/*     */   {
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.InitSffPlatConfig
 * JD-Core Version:    0.6.0
 */