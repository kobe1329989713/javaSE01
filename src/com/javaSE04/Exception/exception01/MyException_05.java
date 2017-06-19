package com.javaSE04.Exception.exception01;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 *  自定义异常
 */
public class MyException_05 extends Exception {

    public MyException_05() {}

    public MyException_05(String msg) {
        super(msg); // 注：这是个构造方法，所以参数在 throw 哪里传，然后你就？？
    }

    /**
     * 只传递出错原因，
     * @param t 出错的原因
     */
    public MyException_05(Throwable t) {
        super(t);
    }


    /**
     *
     * @param msg 出错了消息，
     * @param t 出错的原因
     */
    public MyException_05(String msg, Throwable t) {
        super(msg,t);  // 你通过构造 throw 哪里面，传递进来，传递到异常的父类去，然后根据多态原则，它执行的还是 子类里面的。
    }
}
