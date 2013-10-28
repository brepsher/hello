package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        // Very simple - just return some plain text
        PrintWriter writer = response.getWriter();
        writer.print("<h1>Hello World!</h1>");
        writer.print("<h2>Hello World!</h2>");
        writer.print("<h3>Hello World!</h3>");
        writer.print("<h4>Hello World!</h4>");
    }
}
