<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<script language="JavaScript" src="jsp/0001/scripts.js"></script>
		
		<title>Gerador de Scripts</title>
	</head>
	<body>
		<html:form action="/Gerador.do" method="POST">
			
			<table width="500"  border="0" cellspacing="4" cellpadding="0">
				<tr>
					<td>URL:</td>
			    	<td><html:text property="url" styleId="url" size="12" maxlength="15"/>(Exemplo: 'jdbc:mysql://caminhoDaBase/Base')</td>
				</tr>
				<tr>
					<td>Usuário:</td>
			    	<td><html:text property="usuario" styleId="usuario" size="12" maxlength="15"/></td>
				</tr>
				<tr>
					<td>Senha:</td>
			    	<td><html:text property="senha" styleId="senha" size="12" maxlength="15"/></td>
				</tr>
				<tr>
					<td>Diretorio:</td>
			    	<td><html:text property="diretorio" styleId="diretorio" size="12" maxlength="15"/></td>
				</tr>
			</table>
			<br/>
			<table width="400"  border="0" cellspacing="4" cellpadding="0">
			  <tr>
			    <td>Versão:</td>
			    <td><html:text property="versao" styleId="versao" size="12" maxlength="15"/></td>
			  </tr>
			  	  <tr>
				    <td>Script:</td>
				    <td><html:textarea property="script" cols="50" rows="10" /></td>
				  </tr>
			  <tr>
			  	<td></td>
			    <td>
			    	<img src="imagens/lupa.png" alt="Pesquisar" border="0" height="20" width="20" onclick="javascript:buscar();">
			    	<img src="imagens/salva.png" alt="Gerar Arquivo" border="0" height="20" width="20" onclick="javascript:gerarArquivo();">
			    </td>
			  </tr>
			</table>
		</html:form>
	</body>
</html>