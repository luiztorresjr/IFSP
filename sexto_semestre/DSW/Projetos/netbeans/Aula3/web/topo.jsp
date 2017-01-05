<%-- 
    Document   : topo
    Created on : 11/03/2016, 22:25:21
    Author     : Luiz
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            public String funcaoMes(int mes) {
                String retorno = "";
                switch (mes) {
                    case 1:
                        retorno = "Janeiro";
                        break;
                    case 2:
                        retorno = "Fevereiro";
                        break;
                    case 3:
                        retorno = "Março";
                        break;
                    case 4:
                        retorno = "Abril";
                        break;
                    case 5:
                        retorno = "Maio";
                        break;
                    case 6:
                        retorno = "Junho";
                        break;
                    case 7:
                        retorno = "Julho";
                        break;
                    case 8:
                        retorno = "Agosto";
                        break;
                    case 9:
                        retorno = "Setembro";
                        break;
                    case 10:
                        retorno = "Outubro";
                        break;
                    case 11:
                        retorno = "Novembro";
                        break;
                    case 12:
                        retorno = "Dezembro";
                        break;
                }
                return retorno;
            }
        %>
        <h1> Página JSP </h1>
        <h4> <%
            int mes = Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
            int dia = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
            int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
            out.println("Hoje é dia " + dia + " de " + funcaoMes(mes) + " de " + ano);
            %></h4>
    </body>
</html>
