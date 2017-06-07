package com.javaSE.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc 增 删 改。操作。
 */
public class StatementDemo {
    public static void main(String[] args) {
        //add();
        //update();
        //delete();
        batch();
    }
    static void add(){
        Connection conn = DBHelper.getConnection();
        try {
            Statement stmt = conn.createStatement();
            // 增 删 改 都可以用这个方法execute() 只需把 sql 语句改正就好。它返回的是 boolean
            //stmt.execute("insert into test_table values('1','Tom')");

            // 它也是可以的，只不过它返回的是：有多少行被更改了。
            int i = stmt.executeUpdate("insert into test_table values('2','Tom')");
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void update(){
        Connection conn = DBHelper.getConnection();
        try {
            Statement stmt = conn.createStatement();
            // 增 删 改 都可以用这个方法execute() 只需把 sql 语句改正就好。
            stmt.execute(" update test_table set name = 'kobe' where id = 1 ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void delete(){
        Connection conn = DBHelper.getConnection();
        try {
            Statement stmt = conn.createStatement();
            // 增 删 改 都可以用这个方法execute() 只需把 sql 语句改正就好。
            stmt.execute(" delete from test_table where id =1 ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 注：这三个方法可以封装的。



    // 批量处理。
    static void batch(){
        Connection conn = DBHelper.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.addBatch(" insert into test_table values('3','Tom') ");
            stmt.addBatch(" insert into test_table values('4','Tom') ");
            stmt.addBatch(" insert into test_table values('5','Tom') ");
            stmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
