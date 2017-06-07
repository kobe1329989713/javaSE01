package com.javaSE.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 *  RowSet 简化JDBC 的一个编程。
 *  jdbc 事物是自动完成了。
 */
public class RowSetDemo {
    public static void main(String[] args) throws Exception {
        RowSetFactory factory = RowSetProvider.newFactory();
        JdbcRowSet rs = factory.createJdbcRowSet();

        Class.forName("com.mysql.jdbc.Driver");
        rs.setUrl("jdbc:mysql://localhost:3306/uhoo");
        rs.setUsername("root");
        rs.setPassword("root");

        // 也可以用 ？，注：不能使用  * 号。
        rs.setCommand(" select id,name from test_table ");
        rs.execute();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + "，" + rs.getString(2));

        }


        // 更新。
        rs.first();
        rs.updateString(2, "Rose1");
        rs.updateRow();

    }
}
