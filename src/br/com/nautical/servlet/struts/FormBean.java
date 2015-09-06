/*    */ package br.com.nautical.servlet.struts;
/*    */ 
/*    */ import br.com.nautical.entidade.Update;
/*    */ import java.util.List;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FormBean
/*    */   extends ActionForm
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private String versao;
/*    */   private String script;
		   private String usuario;
		   private String senha;
		   private String url;
		   private String diretorio;
/*    */   private List<Update> updates;
/*    */   
/*    */   public String getVersao()
/*    */   {
/* 19 */     return this.versao;
/*    */   }
/*    */   
/* 22 */   public void setVersao(String versao) { this.versao = versao; }
/*    */   
/*    */   public String getScript() {
/* 25 */     return this.script;
/*    */   }
/*    */   
/* 28 */   public void setScript(String script) { this.script = script; }
/*    */   
/*    */   public List<Update> getUpdates() {
/* 31 */     return this.updates;
/*    */   }
/*    */   
/* 34 */   public void setUpdates(List<Update> updates) { this.updates = updates; }
/*    */
/**
 * @return the usuario
 */
public String getUsuario() {
	return usuario;
}
/**
 * @return the senha
 */
public String getSenha() {
	return senha;
}
/**
 * @return the url
 */
public String getUrl() {
	return url;
}
/**
 * @param usuario the usuario to set
 */
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
/**
 * @param senha the senha to set
 */
public void setSenha(String senha) {
	this.senha = senha;
}
/**
 * @param url the url to set
 */
public void setUrl(String url) {
	this.url = url;
}
/**
 * @return the diretorio
 */
public String getDiretorio() {
	return diretorio;
}
/**
 * @param diretorio the diretorio to set
 */
public void setDiretorio(String diretorio) {
	this.diretorio = diretorio;
} }


/* Location:              F:\Trabalho\apache-tomcat-6.0.39\webapps\Web.war!\WEB-INF\classes\br\com\nautical\servlet\struts\FormBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */