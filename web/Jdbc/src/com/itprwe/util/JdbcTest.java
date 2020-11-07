package com.itprwe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * jdbd中的事务
 * 1.jdbc中的事务是自动只要执行任意一条dml语句，则自动提交一次提交的，，这是jdbc默认行为
 * 但是在实际业务中，通常都是N条DML语句共同联合才能完成，必须保证他们这些DML语句在同一个事务中同时失败或成功
 */
public class JdbcTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //1.注册
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itprwe?serverTimezone=UTC", "root", "123456");
            //3.创建sql执行对象
            String sql ="insert into test_it (userName,password,address,email) values (?,?,?,?)";
            ps = conn.prepareStatement(sql);
            //4.执行
//            ps.executeQuery();//查
            ps.setString(1,"keke");
            ps.setString(2,"000");
            ps.setString(3,"地址是aa");
            ps.setString(4,"798uu@q.com");
            int i = ps.executeUpdate();//增删改
            //5.处理结果
            System.out.println(i==1?"更新成功":"更新失败");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //6关闭连接
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
