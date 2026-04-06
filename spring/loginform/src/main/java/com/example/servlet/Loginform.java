package com.example.servlet;
import javax.servlet.annotation.WebServlet;
import java.util.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet("/login")
public class Loginform extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws IOException,ServletException
    {
     res.setContentType("text/html");
     String name=req.getParameter("username");
     String pass=req.getParameter("password");
     PrintWriter out=res.getWriter();
     if(name.equals("admin")&&pass.equals("12345"))
     {
         HttpSession session=req.getSession();
         session.setAttribute("username",name);
         res.sendRedirect("dashboard");
     }
     else if(!name.equals("admin") && pass.equals("12345"))
     {
         out.println("<h1>Username is incorrect</h1>");
         out.println("<a href='index.html'>Go to Login Page</a>");
     }
     else if(name.equals("admin") && !pass.equals("12345")){
         out.println("<h1>Password is incorrect</h1>");
         out.println("<a href='index.html'>Go to Login page</a>");
     }
    }
}
