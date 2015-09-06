/*    */ package br.com.nautical.conexao;
/*    */ 
/*    */ import com.mysql.jdbc.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.SQLException;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Conexao
/*    */ {
/* 13 */   final Logger logger = LoggerFactory.getLogger(Conexao.class);
/*    */   
/* 15 */   private String drive = "com.mysql.jdbc.Driver";
/* 16 */   private String URL = "";
/* 17 */   private String USER = "";
/* 18 */   private String SENHA = "";
/*    */   
/*    */ 
/*    */ 
/*    */   private Connection conn;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Conexao(String url, String usuario, String senha) {
			this.URL = url;
			this.USER = usuario;
			this.SENHA = senha;
	
/*    */     try
/*    */     {
/* 31 */       this.logger.info("Abrindo conexao...");
/*    */       
/* 33 */       Class.forName(this.drive);
/* 34 */       this.conn = ((Connection)DriverManager.getConnection(this.URL, this.USER, this.SENHA));
/*    */       
/* 36 */       this.logger.info("pronto");
/*    */     }
/*    */     catch (Exception e) {
/* 39 */       this.logger.error(e.getMessage());
/* 40 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public Connection getConn()
/*    */   {
/* 46 */     return this.conn;
/*    */   }
/*    */   
/*    */   public void fecharConexao() {
/*    */     try {
/* 51 */       this.conn.close();
/*    */     } catch (SQLException e) {
/* 53 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\Trabalho\apache-tomcat-6.0.39\webapps\Web.war!\WEB-INF\classes\br\com\nautical\conexao\Conexao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */