package com.Patterns.patterns04.exercise01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：14:50
 * <br/> now：星期五
 * <br/> description：<br/>
 * 享元模式：
 *      享元模式的主要目的是实现对象的 共享，即共享池，
 *      当系统中对象多的时候可以减少内存的开销，
 *      通常与工厂模式一起使用。
 *      连接池的代码，就是
 */
public class Flyweight11 {

    private Vector<Connection> pool;

    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;
    private static Flyweight11 instance = null;
    Connection conn = null;

    /*构造方法，做一些初始化工作*/
    private Flyweight11() {
        pool = new Vector<>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password); //获取到一个连接。
                pool.add(conn); // 装载到到连接池去。
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /* 返回连接到连接池 */
    public synchronized void release() {
        pool.add(conn);
    }

    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
