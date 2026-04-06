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
     String name=req.getParameter("name");
     PrintWriter out=res.getWriter();
     out.println("<h1>"+name+"</h1>");
     System.out.println(name);
    }
}
