
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>Page visitor Count</title>
</head>
<body style="text-align:center">
  <h1>Page visitor Count</h1>
  <%
  Integer count=(Integer)application.getAttribute("visitorCount");

  if(count==null)
  {
  count=0;
  }
  if(session.getAttribute("visited")==null)
  {
  count++;
  application.setAttribute("visitorCount",count);
  session.setAttribute("visited",true);
  }
  %>
  <h2>Total visitor <%=count%></h2>
</body>
</html>