package com.javaSE.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * 事物。
 */
public class TransactionDemo {
    public static void main(String[] args) {
        Connection conn = DBHelper.getConnection();
        try {
            // 设置事物不自动提交。
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            // 这两个条sql 语句要么一直成功，要么一直失败。
            stmt.execute( " INSERT INTO test_table VALUES('11','在来一个') ");
            // 回滚到某一点去。它后面的操作都会回滚了，就是不能保存到数据库里面了。
            Savepoint sp = conn.setSavepoint();
            stmt.execute( " INSERT INTO test_table VALUES('12','NULL02') ");
            conn.rollback(sp);
            conn.commit();
        } catch (SQLException e) {
            try {
                // 回滚事物。
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
