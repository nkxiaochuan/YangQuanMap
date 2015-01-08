/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import ins.framework.exception.BusinessException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.beanutils.BeanUtils;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class TrimUtils extends BeanUtils
/*     */ {
/*  24 */   private static Logger logger = Logger.getLogger(TrimUtils.class);
/*     */ 
/*  31 */   private static Map<Class, String> supportTypeMap = new HashMap();
/*     */ 
/*  33 */   static { supportTypeMap.put(String.class, "");
/*     */   }
/*     */ 
/*     */   public static void trimObject(Object trimObj)
/*     */     throws Exception
/*     */   {
/*  46 */     if (trimObj == null) {
/*  47 */       return;
/*     */     }
/*  49 */     List targetMethodList = getSetter(trimObj.getClass());
/*  50 */     List sourceMethodList = getGetter(trimObj.getClass());
/*  51 */     Map map = new HashMap();
/*  52 */     for (Iterator iter = sourceMethodList.iterator(); iter.hasNext(); ) {
/*  53 */       Method method = (Method)iter.next();
/*  54 */       map.put(method.getName(), method);
/*     */     }
/*  56 */     for (Iterator iter = targetMethodList.iterator(); iter.hasNext(); ) {
/*  57 */       Method method = (Method)iter.next();
/*  58 */       String fieldName = method.getName().substring(3);
/*     */       try {
/*  60 */         Method sourceMethod = (Method)map.get("get" + fieldName);
/*  61 */         if (sourceMethod == null) {
/*     */           continue;
/*     */         }
/*  64 */         if (!supportTypeMap.containsKey(sourceMethod.getReturnType()))
/*     */         {
/*     */           continue;
/*     */         }
/*  68 */         String value = (String)sourceMethod.invoke(trimObj, 
/*  69 */           new Object[0]);
/*  70 */         if (value != null) {
/*  71 */           value = value.trim();
/*  72 */           method.invoke(trimObj, new Object[] { value });
/*     */         }
/*     */       } catch (Exception e) {
/*  75 */         logger.error("Error closing:" + e.toString());
/*  76 */         throw new BusinessException("Trim Error", "Trim Error");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static List<Method> getGetter(Class cl)
/*     */   {
/*  89 */     List list = new ArrayList();
/*  90 */     Method[] methods = cl.getDeclaredMethods();
/*  91 */     for (int i = 0; i < methods.length; i++) {
/*  92 */       Method method = methods[i];
/*  93 */       String methodName = method.getName();
/*  94 */       if (!methodName.startsWith("get")) {
/*     */         continue;
/*     */       }
/*  97 */       list.add(method);
/*     */     }
/*     */     while (true) {
/* 100 */       cl = cl.getSuperclass();
/* 101 */       if (cl == Object.class) {
/*     */         break;
/*     */       }
/* 104 */       list.addAll(getGetter(cl));
/*     */     }
/* 106 */     return list;
/*     */   }
/*     */ 
/*     */   public static List<Method> getSetter(Class cl)
/*     */   {
/* 117 */     List list = new ArrayList();
/* 118 */     Method[] methods = cl.getDeclaredMethods();
/* 119 */     for (int i = 0; i < methods.length; i++) {
/* 120 */       Method method = methods[i];
/* 121 */       String methodName = method.getName();
/* 122 */       if (!methodName.startsWith("set")) {
/*     */         continue;
/*     */       }
/* 125 */       list.add(method);
/*     */     }
/*     */     while (true) {
/* 128 */       cl = cl.getSuperclass();
/* 129 */       if (cl == Object.class) {
/*     */         break;
/*     */       }
/* 132 */       list.addAll(getSetter(cl));
/*     */     }
/* 134 */     return list;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.TrimUtils
 * JD-Core Version:    0.6.0
 */