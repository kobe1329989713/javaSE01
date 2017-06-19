package com.javaSE04.Exception.exception01;

import java.io.IOException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 *  自定义异常，继承Exception类，或者是它的子类
 *
 *  自定义异常的处理也是，要么try{}，要么 throws
 *
 *  注：它的四个构造重载方法，用法
 */
public class MyException_04 extends Exception {

    public MyException_04() {}

    public MyException_04(String msg) {
        super(msg); // 注：这是个构造方法，所以参数在 throw 哪里传，然后你就？？
    }

    /**
     * 只传递出错原因，
     * @param t 出错的原因
     */
    public MyException_04(Throwable t) {
        super(t);
    }


    /**
     *
     * @param msg 出错了消息，
     * @param t 出错的原因
     */
    public MyException_04(String msg,Throwable t) {
        super(msg,t);  // 你通过构造 throw 哪里面，传递进来，传递到异常的父类去，然后根据多态原则，它执行的还是 子类里面的。
    }
}
