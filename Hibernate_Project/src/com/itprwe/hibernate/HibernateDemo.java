package com.itprwe.hibernate;


import com.itprwe.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

    public static void main(String[] args) {

        //1.加载hibernate核心配置文件
        Configuration cfg = new Configuration();
        cfg.configure();
        //2.创建sessionFactory对象，并使用sessionFactory对象创建session对象
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session =sessionFactory.openSession();
        //3.开启事务
        Transaction transaction = session.beginTransaction();
        //4.写具体CRUD操作
        User user =new User();
        user.setUserName("嘎嘎");
        user.setPassword("22233ii");
        session.save(user);

        //5.提交事务
        transaction.commit();
        //6.关闭资源
        session.close();
        sessionFactory.close();
    }
}
