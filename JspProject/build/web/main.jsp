<%-- 
    Document   : main
    Created on : Apr 30, 2023, 8:14:33 AM
    Author     : Basudev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("un");
            out.println("Hello ");
        %>
        <%= name %>
    </body>
</html>
