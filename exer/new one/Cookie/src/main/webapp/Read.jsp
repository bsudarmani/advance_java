<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Read Cookie</title>
</head>

<body>

<center>

<h2>Reading Cookie</h2>

<%
    Cookie[] cookies = request.getCookies();

    String username = null;

    if(cookies != null)
    {
        for(Cookie c : cookies)
        {
            if(c.getName().equals("new"))
            {
                username = c.getValue();
            }
        }
    }

    if(username != null)
    {
%>

        <h3>Username from Cookie:</h3>

        <h1><%= username %></h1>

<%
    }
    else
    {
%>

        <h3>Cookie Expired</h3>

<%
    }
%>

<br>

<a href="index.jsp">Go to Home Page</a>

</center>

</body>
</html>