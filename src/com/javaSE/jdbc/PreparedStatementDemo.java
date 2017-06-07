package com.javaSE.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * jdbc 预处理
 */
public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {
        Connection conn = DBHelper.getConnection();
        // 这个 ？ 号是 点位符。
        //PreparedStatement stmt = conn.prepareStatement(" INSERT INTO test_table VALUES(?,?) ");
        //// 前面的 数据 是代表的 第几个 ？号 ，后面是添加的值。
        //stmt.setInt(1,6);
        //stmt.setString(2,"稵比");
        //stmt.execute();

        // 数据库也有去空格功能。
        PreparedStatement stmt = conn.prepareStatement(" SELECT * FROM test_table WHERE trim(name) = ? ");
        stmt.setString(1,"kobe");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1));
        }
    }
}
