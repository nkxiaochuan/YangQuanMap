/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.TreeMap;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ public class SffPlatConfig
/*     */ {
/*  33 */   private static final Logger logger = Logger.getLogger(SffPlatConfig.class);
/*     */ 
/*  35 */   private static TreeMap treeMap = new TreeMap();
/*  36 */   private static boolean isInited = false;
/*  37 */   private static final File CONFIG_FILE = FileUtils.getUniqueFile(SffPlatConfig.class, ".config");
/*     */ 
/*     */   public static boolean isInited()
/*     */   {
/*  44 */     return isInited;
/*     */   }
/*     */ 
/*     */   public static synchronized void init(String sysConstFile, boolean forceInit)
/*     */     throws Exception
/*     */   {
/*  55 */     String areaname = "";
/*     */ 
/*  57 */     TreeMap areatreemap = new TreeMap();
/*     */ 
/*  59 */     String modulename = "";
/*     */ 
/*  61 */     TreeMap moduletreemap = new TreeMap();
/*     */ 
/*  63 */     String comCodename = "";
/*     */ 
/*  65 */     TreeMap comCodetreemap = new TreeMap();
/*     */ 
/*  67 */     String constName = "";
/*     */ 
/*  69 */     String constValue = "";
/*     */ 
/*  71 */     if ((!forceInit) && (isInited)) {
/*  72 */       return;
/*     */     }
/*     */ 
/*  75 */     treeMap.clear();
/*     */ 
/*  78 */     FileUtils.write(sysConstFile, CONFIG_FILE);
/*     */ 
/*  81 */     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
/*  82 */     DocumentBuilder builder = factory.newDocumentBuilder();
/*     */ 
/*  85 */     Document document = builder.parse(new File(sysConstFile));
/*     */ 
/*  88 */     NodeList sysConstList = document.getElementsByTagName("SffPlatConfig");
/*     */ 
/*  91 */     NodeList areaList = sysConstList.item(0).getChildNodes();
/*  92 */     int i = 0; for (int n = areaList.getLength(); i < n; i++) {
/*  93 */       areatreemap = new TreeMap();
/*  94 */       if (areaList.item(i).getNodeType() != 1)
/*     */       {
/*     */         continue;
/*     */       }
/*  98 */       areaname = areaList.item(i).getNodeName().trim();
/*     */ 
/* 100 */       if (!areaList.item(i).hasChildNodes())
/*     */       {
/*     */         continue;
/*     */       }
/* 104 */       NodeList comCodeList = areaList.item(i).getChildNodes();
/* 105 */       for (int j = 0; j < comCodeList.getLength(); j++) {
/* 106 */         comCodetreemap = new TreeMap();
/* 107 */         if (comCodeList.item(j).getNodeType() != 1)
/*     */         {
/*     */           continue;
/*     */         }
/* 111 */         comCodename = comCodeList.item(j).getNodeName().trim();
/*     */ 
/* 113 */         if (!comCodeList.item(j).hasChildNodes())
/*     */         {
/*     */           continue;
/*     */         }
/* 117 */         NodeList moduleList = comCodeList.item(j).getChildNodes();
/* 118 */         int k = 0; for (int m = moduleList.getLength(); k < m; k++) {
/* 119 */           moduletreemap = new TreeMap();
/* 120 */           if (moduleList.item(k).getNodeType() != 1)
/*     */           {
/*     */             continue;
/*     */           }
/* 124 */           modulename = moduleList.item(k).getNodeName().trim();
/*     */ 
/* 126 */           if (!moduleList.item(k).hasChildNodes())
/*     */           {
/*     */             continue;
/*     */           }
/* 130 */           NodeList constList = moduleList.item(k).getChildNodes();
/* 131 */           int l = 0; for (int s = constList.getLength(); l < s; l++) {
/* 132 */             if (constList.item(l).getNodeType() != 1)
/*     */             {
/*     */               continue;
/*     */             }
/*     */ 
/* 137 */             constName = constList.item(l).getNodeName().trim();
/*     */ 
/* 139 */             if (!constList.item(l).hasChildNodes())
/*     */             {
/* 141 */               constValue = "";
/*     */             }
/*     */             else
/*     */             {
/* 145 */               constValue = constList.item(l).getFirstChild().getNodeValue();
/*     */             }
/* 147 */             moduletreemap.put(constName, constValue);
/*     */           }
/* 149 */           comCodetreemap.put(modulename, moduletreemap);
/*     */         }
/* 151 */         areatreemap.put(comCodename, comCodetreemap);
/*     */       }
/* 153 */       treeMap.put(areaname, areatreemap);
/*     */     }
/* 155 */     isInited = true;
/*     */   }
/*     */ 
/*     */   public static String getProperty(String key1, String key2, String key3, String key4)
/*     */     throws Exception
/*     */   {
/* 165 */     String value = null;
/* 166 */     if (!isInited) {
/* 167 */       reInit();
/*     */     }
/*     */ 
/* 170 */     if ((((key1 != null) && (key1.trim().length() != 0) ? 0 : 1) & ((key2 != null) && (key2.trim().length() != 0) ? 0 : 1) & (
/* 170 */       (key3 != null) && (key3.trim().length() != 0) ? 0 : 1) & ((key4 != null) && (key4.trim().length() != 0) ? 0 : 1)) != 0) {
/* 171 */       return null;
/*     */     }
/*     */     try
/*     */     {
/* 175 */       TreeMap areatreemap = (TreeMap)treeMap.get(key1);
/* 176 */       TreeMap moduletreemap = (TreeMap)areatreemap.get(key2);
/* 177 */       TreeMap comCodetreemap = (TreeMap)moduletreemap.get(key3);
/* 178 */       value = (String)comCodetreemap.get(key4);
/*     */     } catch (Exception ex) {
/* 180 */       StringBuffer buffer = new StringBuffer(128);
/* 181 */       buffer.append(key1);
/* 182 */       buffer.append("|");
/* 183 */       buffer.append(key2);
/* 184 */       buffer.append("|");
/* 185 */       buffer.append(key3);
/* 186 */       buffer.append("|");
/* 187 */       buffer.append(key4);
/* 188 */       logger.error("SffPlatConfig.getProperty：ERROR [" + buffer.toString() + "]");
/* 189 */       throw ex;
/*     */     }
/* 191 */     return value;
/*     */   }
/*     */ 
/*     */   private static void reInit()
/*     */   {
/*     */     try
/*     */     {
/* 230 */       if (!isInited) {
/* 231 */         if (logger.isInfoEnabled()) {
/* 232 */           logger.info("reInit() - 重新读取SffPlatConfig.xml");
/*     */         }
/*     */ 
/* 235 */         if (!CONFIG_FILE.exists()) {
/*     */           try {
/* 237 */             CONFIG_FILE.createNewFile();
/*     */           }
/*     */           catch (IOException e) {
/* 240 */             e.printStackTrace();
/*     */           }
/*     */         }
/* 243 */         if (CONFIG_FILE.exists()) {
/* 244 */           String fileName = FileUtils.read(CONFIG_FILE);
/* 245 */           if (new File(fileName).exists())
/* 246 */             init(fileName, true);
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 251 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.SffPlatConfig
 * JD-Core Version:    0.6.0
 */