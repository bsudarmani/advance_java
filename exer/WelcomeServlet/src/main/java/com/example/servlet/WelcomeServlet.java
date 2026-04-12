package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/prime")
public class WelcomeServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
    {
//        res.setContentType("text/html");
//        String name=req.getParameter("uname");
//        PrintWriter out=res.getWriter();
//        out.println("<h1>Welcome "+ name);


//        res.setContentType("text/html");
//        PrintWriter out=res.getWriter();
//
//        String clientip = req.getHeader("X-Forwarded-For");
//
//        if(clientip==null ||clientip.isEmpty())
//        {
//            clientip=req.getRemoteAddr();
//        }
//        String serverip=req.getLocalAddr();
//        System.out.println("clientip:"+clientip +"\nserverip:"+serverip);
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int sum=num1+num2;
//        out.println("<h1>Add Two Number result is  "+ sum);
//        System.out.println("client enter the 1st num:"+num1);
//        System.out.println("client enter the 2nd num:"+num2);
//        System.out.println("The sum of Two values:"+sum);

        res.setContentType("text/html");
        int num=Integer.parseInt(req.getParameter("num"));
        PrintWriter out=res.getWriter();
        boolean flag=true;
        if(num<2) {
            flag=false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                out.println("<h1>" + num + "is prime" + "</h1>");
                out.println("<a href='index.html'>Go back to Home</a>");
            } else {
                out.println("<h1>" + num + "is not prime" + "</h1>");
                out.println("<a href='index.html'>Go back to Home</a>");
            }
        }
    }
}
