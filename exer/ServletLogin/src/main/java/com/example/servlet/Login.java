package com.example.servlet;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String name=req.getParameter("name");
        String password=req.getParameter("pass");
        HttpSession session= req.getSession();
        if(name.equals("admin") && password.equals("12345"))
        {
            session.setAttribute("uname", name);
            res.sendRedirect("dashboard");
        }
        else
        {
          if(!name.equals("admin") && !password.equals("12345"))
          {
              out.println("<h1>Username and password incorrect");
          }
          else if(!name.equals("admin"))
          {
              out.println("<h1>UserName is incorrect</h1>");
          }
          else if(!password.equals("12345"))
          {
              out.println("<h1>Password is incorrect</h1>");
          }
        }
    }

}
