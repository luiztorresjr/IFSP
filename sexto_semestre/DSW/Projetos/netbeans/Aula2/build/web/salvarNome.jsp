<%-- 
    Document   : salvarNome
    Created on : 27/02/2016, 13:53:55
    Author     : luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salva o nome do usuário</title>
    </head>
    <body>
        <%
            String nome = request.getParameter("nomeUsuario");
            session.setAttribute("nomeUsuario", nome);
        %>
        <p>
            Página que recebe o parâmetro do nome do usuário e seta a variável(objeto implícito) sessão, 
            o qual será recuperado em uma próxima página 
        </p>
        <p>O valor de nome de usuário é: <%= nome %></p>
        <a href="proximaPagina.jsp">Continuar</a>
    </body>
</html>
