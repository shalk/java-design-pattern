package com.xshalk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo2 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        response.setContentType("text/htnl");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>CLEAN!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>clean!</h1>");
        out.println("<p>架构即未来</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
