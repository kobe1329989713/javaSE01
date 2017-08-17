package com.Patterns.patterns08.flyWeight;

import java.sql.Connection;
import java.util.Vector;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/17/ 22:59 星期四<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>模块名称：</B>javaSE01<BR>
 * <B>中文类名：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class ConnectionPool {
    private Vector<Connection> pool;


    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
}
