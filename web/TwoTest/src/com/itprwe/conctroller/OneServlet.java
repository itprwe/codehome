package com.itprwe.conctroller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Onservlet 负责，，，");
        //重定向方案
//        resp.sendRedirect("/web/two");

        //请求转发
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/two");
        requestDispatcher.forward(req,resp);


    }
}
