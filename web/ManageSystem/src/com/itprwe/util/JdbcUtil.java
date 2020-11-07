package com.itprwe.util;

import java.sql.*;

public class JdbcUtil {

    final String URL = "jdbc:mysql://localhost:3306/itprwe?serverTimezone=UTC";
    final String USERNAME = "root";
    final String PASSWORD = "123456";
    PreparedStatement ps = null;
    Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return
     */
    public Connection getConn() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 创建sql执行对象
     * @param sql
     * @return
     */
    public PreparedStatement createStatement(String sql) {
        try {
            ps = getConn().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    /**
     * 释放资源
     */
    public void close() {
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

    //释放查询结果集对象
    public void close(ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
