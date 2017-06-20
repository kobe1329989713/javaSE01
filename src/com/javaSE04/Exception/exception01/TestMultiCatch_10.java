package com.javaSE04.Exception.exception01;

import java.io.IOException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * catch() 里面处理 多个异常。
 */
public class TestMultiCatch_10 extends Exception {

    public static void main(String[] args) {
        // 最原始的处理方式。
        try {
            System.in.read();
            Class.forName("");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // 改进版本。
        try {
            System.in.read();
            Class.forName("");
        } catch (IOException | ClassNotFoundException e) { // |  这后面还可以在跟异常
            e.printStackTrace();
        }
        // 如果你想对不同的异常是不同的处理，还是用第一种好战。
        // 这种方式，加 异常判断可以 对 不同异常 不同处理不？？？

    }

}
