package com.javaSE.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc 的查询。
 */
public class ResultSetDemo {
    public static void main(String[] args) {
        //query();
        query2();
    }
    static void query(){
        Connection conn = DBHelper.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(" select id as nid,name as nname from test_table ");
            while (rs.next()){
                // 用 别名、字段名、索引。都是可以的。
                int nid = rs.getInt("nid");
                //String nname = rs.getString("nname");
                String nname = rs.getString(2);
                System.out.println(nid + "，" + nname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    static void query2(){
        Connection conn = DBHelper.getConnection();
        try {
            //Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(" select id as nid,name as nname from test_table ");

            // 直接定位到某一行。就是 只获取这一行的数据出来。
            rs.absolute(2);
            int nid = rs.getInt("nid");
            //String nname = rs.getString("nname");
            String nname = rs.getString(2);
            System.out.println(nid + "，" + nname);
            rs.updateString(2,"kobe");
            rs.updateRow();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
