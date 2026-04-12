package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
@WebServlet("/dashboard")
public class DashBoard extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws IOException,ServletException
    {

        res.setContentType("text/html");
        HttpSession session=req.getSession(false);
        PrintWriter out=res.getWriter();
        if(session==null ||session.getAttribute("uname")==null)
        {
            res.sendRedirect("login.html");
            return;
        }
        String name=(String)session.getAttribute("uname");
        out.println("<h1>Welcome  "+name+" in your Dashboard</h1>");
        out.println("<a href='logout'>logout</a>");
    }
}
