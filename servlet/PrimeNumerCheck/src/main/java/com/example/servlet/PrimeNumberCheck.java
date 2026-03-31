package com.example.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/prime")
public class PrimeNumberCheck extends HttpServlet
{
    @Override
   protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws IOException, ServletException
   {
       res.setContentType("text/html");
       int num=Integer.parseInt(req.getParameter("number"));
       PrintWriter out=res.getWriter();
       boolean isPrime=true;
       out.println("<html><head><title>Prime number check program</title></head>");
       out.println("<body>");
       if(num==1)
       {
           isPrime=false;
       }
        else {
           for(int i=2;i<=Math.sqrt(num);i++) {
               if (num%i == 0) {
                   isPrime = false;
                   break;
               }
           }
       }
        if(isPrime==true)
            out.println("Number" +  num  + "is prime");
        else
            out.println("Number" +  num  + "is not prime");
            out.println("</body></html>");
   }
}
