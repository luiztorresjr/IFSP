<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Salva o nome do usuário</title>
</head>
<body>
	<%
String nome = request.getParameter( "nomeUsuario" );
session.setAttribute( "nomeUsuario", nome );
%>
<p>Página que recebe o parâmetro de nome do usuário e
seta na variável (objeto implícito) sessão, o qual será
recuperado em uma próxima página.</p>
<p>O valor de nome de usuário é: <%= nome %></p>
<A HREF="proximaPagina.jsp">Continuar</A>
</body>
</html>