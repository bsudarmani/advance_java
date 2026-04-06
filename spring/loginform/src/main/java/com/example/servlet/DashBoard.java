package com.example.servlet;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.*;
@WebServlet("/dashboard")
public class DashBoard extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws IOException,ServletException
    {
        res.setContentType("text/html");
        HttpSession session= req.getSession(false);
        PrintWriter out=res.getWriter();

        if(session!=null && session.getAttribute("username")!=null)
        {
            String name=(String) session.getAttribute("username");
            out.println("<h1>Welcome user:"+ name +"</h1>");
            out.println("<a href='logout'>Logout</a>");
        }
        else
        {
            res.sendRedirect("index.html");
        }

    }
}
