package com.Patterns.patterns08.bridge;

/**
 * Created by kobe on 2017/8/17.18:49
 * <br/>
 * Description:
 *
 *  JDBC 标准，接口。
 *  DriverManager 实现，有多种实现。1、mysql2   2、oracle
 *
 */
public interface ISourceable {
    //  JDBC
    public void method();
}
