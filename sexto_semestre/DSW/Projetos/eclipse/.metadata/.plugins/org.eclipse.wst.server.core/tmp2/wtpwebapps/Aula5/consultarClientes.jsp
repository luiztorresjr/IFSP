<%@page import="java.sql.ResultSet"%>
<%@page import="acessoBD.AcessoBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- Declaração de variáveis globais --%>
<%!
String clienteID, nome, endereco, rg, telefone, email;
String sql;
ResultSet rs;
%>
<%-- Leitura da tabela cliente do Banco de Dados --%>
<%
AcessoBD acessoBD = new AcessoBD();
acessoBD.conecta();
sql = "select * from cliente;";
rs = acessoBD.consulta(sql);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consulta de Clientes</title>
</head>
<body bgcolor="f0f0f0">
<p align="center"><b>Listagem de Clientes</b></p>
<table border="0" align="center">
<thead>
<tr>
<th>Cliente Id</th>
<th>Nome</th>
<th>Endereço</th>
<th>RG</th>
<th>Telefone</th>
<th>E-mail</th>
</tr>
</thead>
<tbody>
<tr><td colspan="6">&nbsp;</td></tr>
<% while(rs.next()){
clienteID = rs.getString("clienteID");
nome = rs.getString("nome");
endereco = rs.getString("endereco");
rg = rs.getString("rg");
telefone = rs.getString("telefone");
email = rs.getString("email");
%>
<tr>
<td><%= clienteID %></td>
<td><%= nome %></td>
<td><%= endereco %></td>
<td><%= rg %></td>
<td><%= telefone %></td>
<td><%= email %></td>
</tr>
<% } // fim do while %>
<tr><td colspan="6">&nbsp;</td></tr>
<tr>
<td colspan="6">
<a href="index.html">Página Principal</a>
</td>
</tr>
</tbody>
</table>
</body>
</html>