/*    */ package br.com.nautical.servlet.validacao;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class Validacao
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public void doGet(HttpServletRequest request, HttpServletResponse response)
/*    */     throws IOException, ServletException
/*    */   {
/* 17 */     response.sendRedirect("/Web/Gerador.do");
/*    */   }
/*    */   
/*    */   public void doPost(HttpServletRequest request, HttpServletResponse response) {}
/*    */ }


/* Location:              F:\Trabalho\apache-tomcat-6.0.39\webapps\Web.war!\WEB-INF\classes\br\com\nautical\servlet\validacao\Validacao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */