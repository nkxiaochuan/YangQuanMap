/*    */ package com;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class TestImage
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  6 */     int i = 1;
/*  7 */     int j = 2;
/*  8 */     new TestImage().ex(i, j);
/*  9 */     System.out.println(i);
/* 10 */     System.out.println(j);
/*    */   }
/*    */ 
/*    */   public void ex(int i, int j) {
/* 14 */     int k = i;
/* 15 */     i = j;
/* 16 */     j = k;
/* 17 */     System.out.println(i);
/* 18 */     System.out.println(j);
/* 19 */     System.out.println(k);
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     com.TestImage
 * JD-Core Version:    0.6.0
 */