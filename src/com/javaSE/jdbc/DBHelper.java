package com.javaSE.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 用于获取连接。
 */
public class DBHelper {

    /**
     * 获取数据库连接。
     * @return result
     */
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uhoo", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection connection = DBHelper.getConnection();
        System.out.println(connection);
    }
}
