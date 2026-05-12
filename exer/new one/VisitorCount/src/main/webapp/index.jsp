<html>
<body>
<h2>Hello World!</h2>
<%
  Integer count=(Integer)application.getAttribute("visitorcount");
  if(count==null)
  {
  count=0;
  }
  if(session.getAttribute("visitor")==null)
  {
  count++;
  application.setAttribute("visitorcount",count);
  session.setAttribute("visitor",true);
  }
%>
<h2>Visitor Count<%=count%></h2>
</body>
</html>
