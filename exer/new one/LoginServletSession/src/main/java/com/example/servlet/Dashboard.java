package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
         res.setContentType("text/html");
        HttpSession session= req.getSession(false);
        PrintWriter out=res.getWriter();
        if(session.getAttribute("user")==null ||session==null)
        {
            res.sendRedirect("index.html");
        }
        String name=(String)session.getAttribute("user");
        out.println("Welcome user:"+name+"in your dashboard");
        out.println("<a href='logout'>logout</a>");
    }
}
