package com.itprwe.util;

import java.sql.Connection;
import java.sql.*;

public class JdbcTest2 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //1.注册
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itprwe?serverTimezone=UTC", "root", "123456");
            conn.setAutoCommit(false);//关闭自动提交事务
            //3.创建sql执行对象
            String sql = "update test_prwe set salary =? where userId=?";
            ps = conn.prepareStatement(sql);
            //4.执行
//            ps.executeQuery();//查
            ps.setDouble(1, 10000);
            ps.setInt(2, 11);
            int i = ps.executeUpdate();//增删改

//            String s = null;
//            s.toString();

            ps.setDouble(1, 10000);
            ps.setInt(2, 22);
            i += ps.executeUpdate();//增删改

            //5.处理结果
            System.out.println(i == 2 ? "更新成功" : "更新失败");

            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            //6关闭连接
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
