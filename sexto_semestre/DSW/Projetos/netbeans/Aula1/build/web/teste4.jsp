<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <%! int i; %>
        <%! String s = "teste"; %>
        <%! public int max(int a, int b) {
                if (a < b) {
                    return b;
                } else {
                    return a;
                }
            }
        %>
        <br>
        <a href="index.jsp">INDEX</a>
    </body>
</html>