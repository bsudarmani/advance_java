<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
</body>
   <h1>Visitor Counter</h1>
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
   <h2>Visitor Count <%=count%></h2>
</html>
