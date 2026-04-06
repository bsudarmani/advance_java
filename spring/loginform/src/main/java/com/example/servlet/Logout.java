package com.example.servlet;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.*;
@WebServlet("/logout")
public class Logout extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        HttpSession session=req.getSession(false);
        if(session!=null)
        {
            session.invalidate();
        }
        res.sendRedirect("index.html");
    }
}
