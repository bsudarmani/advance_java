package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        res.setContentType("text/html");

        String name=req.getParameter("name");
        PrintWriter out=res.getWriter();

        out.println("<html>" +
                "<h1> hello"+name +
                "</html>");
    }
}
