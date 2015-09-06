/*    */ package br.com.nautical.servlet.struts;
/*    */ 
/*    */ import br.com.nautical.arquivo.GeradorArquivo;
/*    */ import br.com.nautical.dao.ConexaoDAO;
/*    */ import br.com.nautical.entidade.Update;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ import org.apache.struts.actions.DispatchAction;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Acao
/*    */   extends DispatchAction
/*    */ {
/* 22 */   final Logger logger = LoggerFactory.getLogger(Acao.class);
/*    */   
/*    */   public ActionForward prepTela(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 27 */     FormBean bean = (FormBean)form;
/*    */     
/* 29 */     return mapping.findForward("chamador");
/*    */   }
/*    */   
/*    */   public ActionForward buscar(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 35 */     FormBean bean = (FormBean)form;
/*    */     
/* 37 */     StringBuffer script = new StringBuffer();
/* 38 */     double versao = 0.0D;
/*    */     
/* 40 */     if ((bean.getVersao() != null) && 
/* 41 */       (!bean.getVersao().equalsIgnoreCase("")))
/*    */     {
/* 43 */       versao = Double.parseDouble(bean.getVersao());
/*    */       
/* 45 */       ConexaoDAO conexaoDAO = new ConexaoDAO(bean.getUrl(), bean.getUsuario(), bean.getSenha());
/*    */       
/* 47 */       List<Update> listaUpdates = conexaoDAO.listaUpdates();
/*    */       
/* 49 */       for (Update aux : listaUpdates)
/*    */       {
/* 51 */         if ((aux.getVersao_bd() != null) && 
/* 52 */           (!aux.getVersao_bd().equalsIgnoreCase("")))
/*    */         {
/* 54 */           double versaoAux = Double.parseDouble(aux.getVersao_bd());
/*    */           
/* 56 */           if (versaoAux > versao) {
/* 57 */             script.append("\n" + aux.getScript_bd());
/*    */           }
/*    */         }
/*    */       }
/*    */       
/* 62 */       bean.setUpdates(listaUpdates);
/*    */     }
/*    */     
/*    */ 
/* 66 */     bean.setScript(script.toString());
/*    */     
/* 68 */     return mapping.findForward("chamador");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public ActionForward gerarArquivo(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 83 */     FormBean bean = (FormBean)form;
/*    */     
/* 85 */     GeradorArquivo gerar = new GeradorArquivo();
/*    */     
/* 87 */     gerar.gerarArquivo(bean.getScript(), bean.getDiretorio());
/*    */     
/* 89 */     return mapping.findForward("chamador");
/*    */   }
/*    */ }


/* Location:              F:\Trabalho\apache-tomcat-6.0.39\webapps\Web.war!\WEB-INF\classes\br\com\nautical\servlet\struts\Acao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */