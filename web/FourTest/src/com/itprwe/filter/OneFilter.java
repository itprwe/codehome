package com.itprwe.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class OneFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //1.通过请求对象得到请求包参数信息，从而得到来访用户的真实信息
        String age = servletRequest.getParameter("age");
        //2.根据获得请求参数，判断是否执行
        if (Integer.valueOf(age)<50){
            //3.将拦截的请求对象和响应对象交换给Tomcat，由Tomcat继续调用资源文件
            filterChain.doFilter(servletRequest,servletResponse);//放行
        }else {
            //4过滤器代替Http服务器拒绝本次请求
            servletResponse.setContentType("text/html;charset=utf-8");
            PrintWriter out = servletResponse.getWriter();
            out.print("fffff不uuuu");

        }
    }

    @Override
    public void destroy() {

    }
}
