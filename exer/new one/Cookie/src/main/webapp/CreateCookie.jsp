<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
 Cookie c=new Cookie("new","mca");
 c.setMaxAge(10);
 response.addCookie(c);

%>
<head>
 <head>
  <title>cretea cookie</title>
 </head>
 <body>
  <h1>Cookie created successfully</h1>
  <p>cookie time 10 sec </p>
  <a href='Read.jsp'>Read Cookie</a>
 </body>
 </html>