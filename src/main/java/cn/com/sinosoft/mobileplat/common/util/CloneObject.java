/*    */ package cn.com.sinosoft.mobileplat.common.util;
/*    */ 
/*    */ import ins.framework.utils.DataUtils;
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.ObjectInputStream;
/*    */ import java.io.ObjectOutputStream;
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.apache.commons.beanutils.BeanUtils;
/*    */ 
/*    */ public class CloneObject
/*    */ {
/*    */   public static Object cloneObject(Object obj)
/*    */     throws Exception
/*    */   {
/* 21 */     ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
/* 22 */     ObjectOutputStream out = new ObjectOutputStream(byteOut);
/* 23 */     out.writeObject(obj);
/* 24 */     ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
/* 25 */     ObjectInputStream in = new ObjectInputStream(byteIn);
/* 26 */     return in.readObject();
/*    */   }
/*    */ 
/*    */   public static ArrayList cloneList(Class<? extends Object> c, List list)
/*    */   {
/* 33 */     ArrayList cloneList = new ArrayList();
/* 34 */     for (Iterator localIterator = list.iterator(); localIterator.hasNext(); ) { Object obj = localIterator.next();
/* 35 */       Object o = null;
/*    */       try {
/* 37 */         o = c.newInstance();
/*    */       } catch (InstantiationException e) {
/* 39 */         e.printStackTrace();
/*    */       } catch (IllegalAccessException e) {
/* 41 */         e.printStackTrace();
/*    */       }
/* 43 */       DataUtils.copySimpleObjectToTargetFromSource(o, obj);
/* 44 */       cloneList.add(o);
/*    */     }
/* 46 */     return cloneList;
/*    */   }
/*    */ 
/*    */   public static ArrayList cloneList(List list)
/*    */   {
/* 55 */     ArrayList cloneList = new ArrayList();
/* 56 */     for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
/*    */       try {
/* 58 */         cloneList.add(BeanUtils.cloneBean(iterator.next()));
/*    */       } catch (IllegalAccessException e) {
/* 60 */         e.printStackTrace();
/*    */       } catch (InstantiationException e) {
/* 62 */         e.printStackTrace();
/*    */       } catch (InvocationTargetException e) {
/* 64 */         e.printStackTrace();
/*    */       } catch (NoSuchMethodException e) {
/* 66 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 69 */     return cloneList;
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.CloneObject
 * JD-Core Version:    0.6.0
 */