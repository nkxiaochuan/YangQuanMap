/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.ObjectOutputStream;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ 
/*     */ public class FileUtils
/*     */ {
/*  20 */   private static final File POOL_FILE = getUniqueFile(FileUtils.class, ".deletefiles");
/*     */   private static ArrayList deleteFilesPool;
/*     */ 
/*     */   static
/*     */   {
/*     */     try
/*     */     {
/*  25 */       initPool();
/*     */     } catch (Exception e) {
/*  27 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void initPool()
/*     */   {
/*  37 */     if ((POOL_FILE.exists()) && (POOL_FILE.canRead()))
/*     */       try {
/*  39 */         ObjectInputStream in = new ObjectInputStream(new FileInputStream(POOL_FILE));
/*  40 */         deleteFilesPool = (ArrayList)in.readObject();
/*  41 */         in.close();
/*     */       } catch (Exception e) {
/*  43 */         deleteFilesPool = new ArrayList();
/*     */       }
/*     */     else
/*  46 */       deleteFilesPool = new ArrayList();
/*     */   }
/*     */ 
/*     */   public static void copyFile(String fromFile, String toFile)
/*     */     throws IOException
/*     */   {
/*  71 */     FileInputStream in = new FileInputStream(fromFile);
/*  72 */     FileOutputStream out = new FileOutputStream(toFile);
/*  73 */     byte[] b = new byte[1024];
/*     */     int len;
/*  75 */     while ((len = in.read(b)) != -1)
/*     */     {
/*  76 */       out.write(b, 0, len);
/*     */     }
/*  78 */     out.close();
/*  79 */     in.close();
/*     */   }
/*     */ 
/*     */   public static String getShortFileName(String fileName)
/*     */   {
/*  94 */     String shortFileName = "";
/*  95 */     int pos = fileName.lastIndexOf('\\');
/*  96 */     if (pos == -1) {
/*  97 */       pos = fileName.lastIndexOf('/');
/*     */     }
/*  99 */     if (pos > -1)
/* 100 */       shortFileName = fileName.substring(pos + 1);
/*     */     else {
/* 102 */       shortFileName = fileName;
/*     */     }
/* 104 */     return shortFileName;
/*     */   }
/*     */ 
/*     */   public static String getShortFileNameWithoutExt(String fileName)
/*     */   {
/* 119 */     String shortFileName = getShortFileName(fileName);
/* 120 */     shortFileName = getFileNameWithoutExt(shortFileName);
/* 121 */     return shortFileName;
/*     */   }
/*     */ 
/*     */   public static String read(String fileName)
/*     */     throws Exception
/*     */   {
/* 131 */     String fileContent = "";
/* 132 */     fileContent = read(new FileInputStream(fileName));
/* 133 */     return fileContent;
/*     */   }
/*     */ 
/*     */   public static String read(File file)
/*     */     throws Exception
/*     */   {
/* 143 */     String fileContent = "";
/* 144 */     fileContent = read(new FileInputStream(file));
/* 145 */     return fileContent;
/*     */   }
/*     */ 
/*     */   public static String read(InputStream is)
/*     */     throws Exception
/*     */   {
/* 155 */     byte[] result = readBytes(is);
/* 156 */     return new String(result);
/*     */   }
/*     */ 
/*     */   public static byte[] readBytes(String fileName)
/*     */     throws Exception
/*     */   {
/* 166 */     return readBytes(new FileInputStream(fileName));
/*     */   }
/*     */ 
/*     */   public static byte[] readBytes(File file)
/*     */     throws Exception
/*     */   {
/* 176 */     return readBytes(new FileInputStream(file));
/*     */   }
/*     */ 
/*     */   public static byte[] readBytes(InputStream is)
/*     */     throws Exception
/*     */   {
/* 186 */     if ((is == null) || (is.available() < 1)) {
/* 187 */       return new byte[0];
/*     */     }
/* 189 */     byte[] buff = new byte[8192];
/* 190 */     byte[] result = new byte[is.available()];
/*     */ 
/* 192 */     BufferedInputStream in = new BufferedInputStream(is);
/* 193 */     int pos = 0;
/*     */     int nch;
/* 194 */     while ((nch = in.read(buff, 0, buff.length)) != -1)
/*     */     {
/* 195 */       System.arraycopy(buff, 0, result, pos, nch);
/* 196 */       pos += nch;
/*     */     }
/* 198 */     in.close();
/* 199 */     return result;
/*     */   }
/*     */ 
/*     */   public static void write(String content, File file)
/*     */     throws IOException
/*     */   {
/* 209 */     write(content.getBytes(), file);
/*     */   }
/*     */ 
/*     */   public static void write(String content, String file)
/*     */     throws IOException
/*     */   {
/* 219 */     write(content, new File(file));
/*     */   }
/*     */ 
/*     */   public static void write(byte[] bytes, String file)
/*     */     throws IOException
/*     */   {
/* 229 */     write(bytes, new File(file));
/*     */   }
/*     */ 
/*     */   public static void write(byte[] bytes, File file)
/*     */     throws IOException
/*     */   {
/* 239 */     FileOutputStream out = new FileOutputStream(file);
/* 240 */     out.write(bytes);
/* 241 */     out.flush();
/* 242 */     out.close();
/*     */   }
/*     */ 
/*     */   public static String getFileNameWithoutExt(String fileName)
/*     */   {
/* 251 */     String shortFileName = fileName;
/* 252 */     if (fileName.indexOf('.') > -1) {
/* 253 */       shortFileName = fileName.substring(0, fileName.lastIndexOf('.'));
/*     */     }
/* 255 */     return shortFileName;
/*     */   }
/*     */ 
/*     */   public static String getFileNameExt(String fileName)
/*     */   {
/* 264 */     String fileExt = "";
/* 265 */     if (fileName.indexOf('.') > -1) {
/* 266 */       fileExt = fileName.substring(fileName.lastIndexOf('.'));
/*     */     }
/* 268 */     return fileExt;
/*     */   }
/*     */ 
/*     */   public static synchronized File getUniqueFile(File repository, String fileName)
/*     */   {
/* 277 */     String shortFileName = getShortFileName(fileName);
/* 278 */     String tempFileName = getFileNameWithoutExt(shortFileName);
/* 279 */     File file = new File(repository, shortFileName);
/* 280 */     String fileExt = getFileNameExt(shortFileName);
/* 281 */     while (file.exists()) {
/* 282 */       StringBuffer str = new StringBuffer(128);
/* 283 */       str.append(tempFileName);
/* 284 */       str.append("-");
/* 285 */       str.append(Math.abs(new Random().nextInt()));
/* 286 */       str.append(fileExt);
/* 287 */       file = new File(repository, str.toString());
/*     */     }
/* 289 */     return file;
/*     */   }
/*     */ 
/*     */   public static void deleteFile(String fileName)
/*     */   {
/* 297 */     File file = new File(fileName);
/* 298 */     if (file.exists())
/* 299 */       deleteFile(file);
/*     */   }
/*     */ 
/*     */   public static void deleteFile(File file)
/*     */   {
/* 308 */     file.delete();
/* 309 */     if (file.exists()) {
/* 310 */       deleteFilesPool.add(file);
/*     */     }
/* 312 */     checkDeletePool();
/*     */   }
/*     */ 
/*     */   private static void checkDeletePool()
/*     */   {
/* 320 */     for (int i = deleteFilesPool.size() - 1; i >= 0; i--) {
/* 321 */       File file = (File)deleteFilesPool.get(i);
/* 322 */       file.delete();
/* 323 */       if (!file.exists())
/* 324 */         deleteFilesPool.remove(i);
/*     */     }
/*     */     try
/*     */     {
/* 328 */       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(POOL_FILE));
/* 329 */       out.writeObject(deleteFilesPool);
/* 330 */       out.close();
/*     */     } catch (Exception e) {
/* 332 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static File getUniqueFile(Class cl, String extension)
/*     */   {
/* 344 */     int key = 0;
/*     */ 
/* 346 */     StringBuffer buffer1 = new StringBuffer(128);
/* 347 */     buffer1.append(getClassNameWithoutPackage(cl));
/* 348 */     buffer1.append(".class");
/* 349 */     URL url = cl.getResource(buffer1.toString());
/* 350 */     if (url != null) {
/* 351 */       key = url.getPath().hashCode();
/*     */     }
/*     */ 
/* 357 */     StringBuffer buffer2 = new StringBuffer(128);
/* 358 */     buffer2.append(getClassNameWithoutPackage(cl));
/* 359 */     buffer2.append(key);
/* 360 */     buffer2.append(extension);
/* 361 */     File propFile = new File(System.getProperty("java.io.tmpdir"), buffer2.toString());
/* 362 */     return propFile;
/*     */   }
/*     */ 
/*     */   private static String getClassNameWithoutPackage(Class cl) {
/* 366 */     String className = cl.getName();
/* 367 */     int pos = className.lastIndexOf('.') + 1;
/* 368 */     if (pos == -1)
/*     */     {
/* 370 */       pos = 0;
/*     */     }
/* 372 */     String name = className.substring(pos);
/* 373 */     return name;
/*     */   }
/*     */ 
/*     */   public static boolean deleteFolder(File delFolder)
/*     */   {
/* 387 */     boolean hasDeleted = true;
/*     */ 
/* 389 */     File[] allFiles = delFolder.listFiles();
/*     */ 
/* 391 */     int i = 0; for (int n = allFiles.length; i < n; i++)
/*     */     {
/* 393 */       if (!hasDeleted) break;
/* 394 */       if (allFiles[i].isDirectory())
/*     */       {
/* 396 */         hasDeleted = deleteFolder(allFiles[i]); } else {
/* 397 */         if (!allFiles[i].isFile()) continue;
/*     */         try {
/* 399 */           if (allFiles[i].delete())
/*     */             continue;
/* 401 */           hasDeleted = false;
/*     */         }
/*     */         catch (Exception e)
/*     */         {
/* 405 */           hasDeleted = false;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 413 */     if (hasDeleted)
/*     */     {
/* 415 */       delFolder.delete();
/*     */     }
/* 417 */     return hasDeleted;
/*     */   }
/*     */ 
/*     */   public static String getRealPathName(Class cl)
/*     */   {
/* 428 */     URL url = cl.getResource(getClassNameWithoutPackage(cl) + ".class");
/* 429 */     if (url != null) {
/* 430 */       return url.getPath();
/*     */     }
/* 432 */     return null;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.FileUtils
 * JD-Core Version:    0.6.0
 */