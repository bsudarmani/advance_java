package com.example.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.rmi.ServerException;

@WebServlet("/logout")
public class Logout extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServerException, IOException
    {
        HttpSession session=req.getSession(false);

            if(session!=null && session.getAttribute("name")!=null)
            {
                session.invalidate();
            }
            res.sendRedirect("index.html");
    }
}
