package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/media")
public class Multimedia extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws IOException,ServletException
    {
      res.setContentType("text/html");
      String name=req.getParameter("name");
      String type=req.getParameter("type");
        PrintWriter out=res.getWriter();
        String clientip=req.getHeader("X-Forwarded-For");
        if(clientip==null ||clientip.isEmpty() || "unknown".equalsIgnoreCase(clientip))
        {
            clientip=req.getRemoteAddr();
        }
        //types
        if(type!=null && type.equals("image"))
        {
            out.println("<h1>Image Display</h1>");
            out.println("<image src='f1.jpg' width='400'>");
            out.println("<br><a href='index.html'>Go Back to Home</a>");
        }
        else if(type!=null && type.equals("video"))
        {
         out.println("<h1>Video Display</h1>");
         out.println("<video controls>");
         out.println("<source src='ani.mp4' type='video/mp4'>");
         out.println("</video>");
            out.println("<br><a href='index.html'>Go Back to Home</a>");
        }
        else if(type!=null && type.equals("audio"))
        {
            out.println("<h1>Audio Display</h1>");
            out.println("<audio controls>");
            out.println("<source src='dude.mp3' type='audio/mpeg'>");
            out.println("</audio>");
            out.println("<br><a href='index.html'>Go Back to Home</a>");
        }

       System.out.println("client ip:"+clientip);
        String serverip=req.getLocalAddr();
        System.out.println("server ip:"+serverip);
        System.out.println("username:"+name);
        System.out.println("user select type:"+type);
    }
}
