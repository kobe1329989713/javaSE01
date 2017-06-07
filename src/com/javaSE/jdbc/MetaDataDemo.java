package com.javaSE.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * 元数据就是：如，数据库的版本，有多少行、
 是什么类型、多少列、等……、这种叫 元数据。
 */
public class MetaDataDemo {
    public static void main(String[] args) {

    }

    static void databaseMetaData() throws Exception {
        Connection conn = DBHelper.getConnection();
        DatabaseMetaData data = conn.getMetaData();
        // 数据库的产品名。
        System.out.println(data.getDatabaseProductName());
        // 获取版本号。
        System.out.println(data.getDatabaseMajorVersion());
        // 获取驱动。
        System.out.println(data.getDriverName());
        // 获取驱动版本。
        System.out.println(data.getDriverVersion());
    }
}
