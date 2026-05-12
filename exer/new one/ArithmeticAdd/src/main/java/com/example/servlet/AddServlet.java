package com.example.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws ServerException,IOException
    {
           res.setContentType("text/html");
        PrintWriter out=res.getWriter();
           int num1=Integer.parseInt(req.getParameter("num1"));
           int num2=Integer.parseInt(req.getParameter("num2"));
           int sum=num1+num2;
           out.println("sum of value:"+sum);
    }
}
