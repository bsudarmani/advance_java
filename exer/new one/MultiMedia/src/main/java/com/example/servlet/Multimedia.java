package com.example.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@WebServlet("/multi")
public class Multimedia extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServerException, IOException
    {
            res.setContentType("text/html");
        PrintWriter out=res.getWriter();

        String name=req.getParameter("user");
        String type=req.getParameter("type");

        if(type.equals("image"))
        {
            out.println("<image  src='f1.jpg' width='500'>");
        }
        if(type.equals("audio"))
        {
            out.println("<audio controls>" +
                    "<source src='dude.mp3' type='audio/mpeg' >"+
                    "</audio>");
        }
        if(type.equals("video"))
        {
            out.println("<video controls>" +
                    "<source src='ani.mp4' type='video/mp4'>" +
                    "</video>");
        }
    }
}
