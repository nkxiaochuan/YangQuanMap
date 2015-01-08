/*    */ package com;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.PrintStream;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class TestFile
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/*  9 */     System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
/*    */ 
/* 11 */     System.out.println(TestFile.class.getClassLoader().getResource(""));
/*    */ 
/* 13 */     System.out.println(ClassLoader.getSystemResource(""));
/*    */ 
/* 15 */     System.out.println(TestFile.class.getResource(""));
/*    */ 
/* 17 */     String path = TestFile.class.getResource("/").getPath();
/* 18 */     System.out.println("------£º" + path.substring(0, path.lastIndexOf("/")));
/*    */ 
/* 20 */     System.out.println(new File("/").getAbsolutePath());
/*    */ 
/* 22 */     System.out.println(System.getProperty("user.dir"));
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.TestFile
 * JD-Core Version:    0.6.0
 */