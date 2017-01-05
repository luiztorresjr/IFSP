<%-- 
    Document   : gravarDados
    Created on : 11/03/2016, 22:33:11
    Author     : Luiz
--%>
<%@page import="acessoBD.AcessoBD"%>
<%-- Declaração de variáveis globais --%>
<%!
    String nome, endereco, rg, telefone, email;
    String sql;
%>
<%-- Leitura das variáveis recebidas por POST
e armazenamento nas variáveis globais --%>
<%
    nome = request.getParameter("nome");
    endereco = request.getParameter("endereco");
    rg = request.getParameter("rg");
    telefone = request.getParameter("telefone");
    email = request.getParameter("email");
    AcessoBD acessoBD = new AcessoBD();
    acessoBD.conecta();
    sql = "insert into (nome, endereco, rg, telefone, email) cliente values('" + nome + "','" + endereco + "','" + rg + "','" + telefone + "','" + email + "')";
    out.println("SQL: "+sql);
    acessoBD.executa(sql);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gravação de Dados</title>
</head>
<body bgcolor="f0f0f0">
<p align="center">Dados gravados com sucesso na tabela cliente!</p>
<br>
<p align="center"><a href="index.html">Página Principal</a></p>
</body>
</html>
