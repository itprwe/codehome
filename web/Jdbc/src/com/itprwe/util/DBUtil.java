package com.itprwe.util;

import java.sql.*;

/**
 * JDBC工具类
 */
public class DBUtil {

    /**
     * 工具类中的构造方法都是私有的。
     * 因为工具类当中的方法都是静态的，不需要new对象，直接材料类名调用。
     */
    private DBUtil(){}

    /**
     * 静态代码块，在类加载时执行，并且只执行一次
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     * @return 连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {//异常不在这捕捉，先扔出去后面捕捉
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/itprwe?serverTimezone=UTC", "root", "123456");
    }

    /**
     * 关闭资源
     * @param conn
     * @param ps
     * @param rs
     */
    public static void close(Connection conn, Statement ps, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
