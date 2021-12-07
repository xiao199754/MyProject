package com.servlet;

import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//注解注册Servlet
@WebServlet(name = "helloServlet",urlPatterns = "/Servlet1hello")
public class helloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FirstServlet running ... ");
        PrintWriter out = resp.getWriter();
        out.write("success ... ");
        out.flush();
        out.close();
    }
}
