package com.itprwe.util;

import java.sql.*;

public class JdbcUtil {


    /**
     *
     * 0.定义url
     * 1.注册驱动
     * 2.创建连接
     * 3.创建执行sql语句的对象
     * 4.执行语句
     * 5.处理执行结果
     * 6.释放资源
     *
     */

    /**
     * 0.定义url
     */
    static final String URL = "jdbc:mysql://localhost:3306/itprwe?serverTimezone=UTC";
    static final String uerName = "root";
    static final String password = "123456";
    static final String driver = "com.mysql.jdbc.Driver";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /**
         * 1.注册驱动
         *
         */
        //方法一
//        DriverManager.registerDriver(com.mysql.jdbc.Driver);
        //方法二
//        System.setProperty("jdbc.drivers","com.mysql.jdbc.Driver");
        //方法三
        Class.forName(driver);
        /**
         * 2.创建连接
         */
        Connection conn = DriverManager.getConnection(URL, uerName, password);

        /**
         * 3.创建sql语句执行对象
         */
        //这里有两个对象可以使用：Statement、PreparedStatement(防止注入)对象
        Statement st = conn.createStatement();

        String strSql = "select * from test_it";
//        PreparedStatement ps = conn.prepareStatement(strSql);

        /**
         * 4.执行语句（增删改查）
         */
        //增删改
//        ResultSet rs = st.executeQuery(strSql);
        // 查
        ResultSet rs = st.executeQuery(strSql);
//        ResultSet resultSet1 = ps.executeQuery();

        /**
         * 5.处理查询结果
         */
        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t"
                    + rs.getObject(2) + "\t"
                    + rs.getObject(3) + "\t");

            rs.getString(1);//第一列
            rs.getString("查询列的列名");
        }

        /**
         * 6.关闭连接
         */
        //ResultSet、Statement（或PreparedStatement）、Connection对象，释放顺序与创建顺序相反（类似“栈”结构）
        rs.close();
        st.close();
        conn.close();

    }

}
