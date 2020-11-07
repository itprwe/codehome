package com.itprwe.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            String parameter = request.getParameter(s);
            System.out.println(s+":"+parameter);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
//            out.print("test/get");
            out.print(s+":"+parameter+"<br>");
        }


    }
}
