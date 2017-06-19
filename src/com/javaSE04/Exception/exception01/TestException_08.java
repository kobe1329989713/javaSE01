package com.javaSE04.Exception.exception01;

import java.io.IOException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 测试 自定义异常
 */
public class TestException_08 extends Exception {

    public void test() throws Exception {
        //try {
        //    System.in.read();
        //    Class.forName("");
        //} catch (IOException e) {
        //
        //} catch (ClassNotFoundException e) {
        //
        //}


        // 上面 的 cathc 还可以这样写
        try {
            System.in.read();
            Class.forName("");
        } catch (Exception e) { // 捕获它的父类就好。
            // 重新在抛出异常。
            throw e;
            // 就是我捕获你这个异常，我在把这个异常给抛出去。jdk7 以上才行。
        }


    }

}
