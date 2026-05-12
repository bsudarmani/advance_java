package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String name=req.getParameter("u_name");
        String pass=req.getParameter("u_pass");
        HttpSession session= req.getSession();
        if(name.equals("admin") && pass.equals("12345"))
        {
            //out.println("username and password is correct");
            session.setAttribute("user",name);
            res.sendRedirect("dashboard");

        }
        else {
            if(!name.equals("admin") && !pass.equals("12345"))
            {
                out.println("username and password is incorrect");
            }
            else if (!name.equals("admin")) {
                out.println("username is incorrect");
            }
            else if (!pass.equals("12345")) {
                out.println("password is incorrect");
            }
        }
    }
}
