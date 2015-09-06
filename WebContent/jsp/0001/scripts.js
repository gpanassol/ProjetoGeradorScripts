var base = elements[0].href;

function gerarArquivo(){
	document.getElementsByTagName("FORM")[0].target = "_self";
	document.getElementsByTagName("FORM")[0].action = "Gerador.do?method=gerarArquivo";
	document.getElementsByTagName("FORM")[0].submit();
}

function buscar(){
	document.getElementsByTagName("FORM")[0].target = "_self";
	document.getElementsByTagName("FORM")[0].action = "Gerador.do?method=buscar";
	document.getElementsByTagName("FORM")[0].submit();
}
