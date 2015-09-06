/*    */ package br.com.nautical.arquivo;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GeradorArquivo
/*    */ {
/* 17 */   final Logger logger = LoggerFactory.getLogger(GeradorArquivo.class);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void gerarArquivo(String script, String diretorio)
/*    */     throws IOException
/*    */   {
/* 27 */     this.logger.info("Gerando Arquivo...");
/*    */     
/* 29 */     File arquivo = new File(diretorio + "/update.sql");
/*    */     
/* 31 */     if (!arquivo.exists()) {
/* 32 */       arquivo.createNewFile();
/*    */     }
/*    */     
/* 35 */     FileWriter fr = new FileWriter(arquivo);
/*    */     
/* 37 */     BufferedWriter bw = new BufferedWriter(fr);
/*    */     
/* 39 */     if ((script != null) && (!script.equalsIgnoreCase(""))) {
/* 40 */       bw.write(script);
/* 41 */       bw.newLine();
/*    */     }
/*    */     
/*    */ 
/* 45 */     bw.close();
/* 46 */     fr.close();
/*    */     
/* 48 */     this.logger.info("pronto");
/*    */   }
/*    */ }


/* Location:              F:\Trabalho\apache-tomcat-6.0.39\webapps\Web.war!\WEB-INF\classes\br\com\nautical\arquivo\GeradorArquivo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */