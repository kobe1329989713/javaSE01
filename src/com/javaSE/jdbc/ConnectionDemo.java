package com.javaSE.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;

/**
 * jdbc 连接。
 */
public class ConnectionDemo {
    public static void main(String[] args) throws Exception {
         //加载驱动。
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uhoo","root","root");

        System.out.println(conn);


    }



}
