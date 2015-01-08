/*    */ package cn.com.sinosoft.mobileplat.common.web;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class TestMobilePlatServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   public void destroy()
/*    */   {
/* 29 */     super.destroy();
/*    */   }
/*    */ 
/*    */   public void doGet(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 46 */     doPost(request, response);
/*    */   }
/*    */ 
/*    */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 61 */     request.setCharacterEncoding("GBK");
/* 62 */     String xmlString = request.getParameter("xml");
/* 63 */     String requestType = request.getParameter("requestType");
/* 64 */     request.setAttribute("xmlString", xmlString);
/* 65 */     if (requestType.equals("0"))
/* 66 */       request.getRequestDispatcher("/LoginServlet").forward(request, response);
/* 67 */     else if (requestType.equals("1"))
/* 68 */       request.getRequestDispatcher("/SettingLossInfoQueryServlet").forward(request, response);
/* 69 */     else if (requestType.equals("2"))
/* 70 */       request.getRequestDispatcher("/SettingLossOpinionServlet").forward(request, response);
/* 71 */     else if (requestType.equals("3"))
/* 72 */       request.getRequestDispatcher("/SettingLostPassServlet").forward(request, response);
/* 73 */     else if (requestType.equals("4"))
/* 74 */       request.getRequestDispatcher("/SurveyInfoUploadServlet").forward(request, response);
/* 75 */     else if (requestType.equals("5"))
/* 76 */       request.getRequestDispatcher("/SurveyTaskInfoQueryServlet").forward(request, response);
/* 77 */     else if (requestType.equals("6"))
/* 78 */       request.getRequestDispatcher("/TaskListQueryServlet").forward(request, response);
/* 79 */     else if (requestType.equals("7"))
/* 80 */       request.getRequestDispatcher("/ImageUploadServlet").forward(request, response);
/* 81 */     else if (requestType.equals("8"))
/* 82 */       request.getRequestDispatcher("/ImageStatusQueryServlet").forward(request, response);
/*    */   }
/*    */ 
/*    */   public void init()
/*    */     throws ServletException
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.web.TestMobilePlatServlet
 * JD-Core Version:    0.6.0
 */