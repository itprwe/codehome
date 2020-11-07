package com.itprwe.dao;

import com.itprwe.entity.Users;
import com.itprwe.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    JdbcUtil jdbcUtil = new JdbcUtil();

    //将请求头中获取的值传给add，如果一个值一个的传，数据库表字段多的话则不适用，
    // 可以直接将Users对象传入。正好是一个数据库表的内容
    //public int add(userName,password,sex,email){
    public int add(Users users){
        int i = 0;
        Connection conn = jdbcUtil.getConn();
        String sql = "INSERT into users (userName,password,sex,email) " +
                "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,users.getUserName());
            ps.setString(2,users.getPassword());
            ps.setString(3,users.getSex());
            ps.setString(4,users.getEmail());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
