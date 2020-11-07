package com.itprwe.conctroller;

import com.itprwe.dao.UserDao;
import com.itprwe.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserAddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求对象中请求头中的值
        String userName, password, sex, email;
        UserDao userDao = new UserDao();
        Users users = null;

        userName = request.getParameter("userName");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");

        users = new Users(null, userName, password, sex, email);
        //将或的值传给UserDao,处理存储到数据库表中
        int add = userDao.add(users);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //将结果返回给浏览器
        if (add==1){
            out.print("插入成功");
        }else {
            out.print("插入失败");
        }

    }
}
