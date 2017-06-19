package com.javaSE04.Exception.exception01;

import java.io.IOException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 测试 自定义异常
 */
public class TestMyException_04 extends Exception {


    public void test(int num) throws MyException_04 {
        if (num < 10) {
            // 抛出自定义的异常信息。
            throw new MyException_04("小于10了");

            /**
             * 注：这里面为什么要 throws 了，因为你自定义的
             * 肯定是需要别人来处理的，如果你自己 try{} 掉了，
             * 就是意义不大了。
              */
        }
    }


    // 重新抛出异常。注：看调用哪里。
    public void test1() throws MyException_05 {
        try {
            test(2);
        } catch (MyException_04 e) {
            // 处理掉 自定义一，
            e.printStackTrace();
            // 在抛出 自定义异常二。
            //throw new MyException_05("自定义异常二。");

            // 这样就保留了 MyException_04 的异常了。
            // 传递消息，与出错原因的构造。
            throw new MyException_05("msg2222222",e);
        }
    }


    // 测试 自定义异常 之 自定义运行时异常 测试。
    // 你看就不用 throws 或者 try{} 了，因为你的是运行时异常。
    // 我们可处理，可不处理的。
    public void test02(int num) {
        if (num % 2 == 0) {
            throw new MyException_06("偶数是 2 4 6 这种。");
        }
    }



    public static void main(String[] args) throws IOException {
        TestMyException_04 e4 = new TestMyException_04();
        try {
            //e4.test(4);
            e4.test1(); // 这样就可以隐藏掉一个异常信息，客服端，它只看见了一个异常了。
        } catch (MyException_05 e) {
            // 等到 myException_04 的异常信息了
            Throwable e2 = e.getCause();

            // 这样就可以判断异常了，什么异常，哪么搞。
            if (e2 instanceof MyException_04) {
                System.out.println("44444");
            }
            e.printStackTrace();
        }

        // 测试 自定义异常 之 自定义运行时异常 测试。
        try {
            e4.test02(4);
        } catch (MyException_06 e) {
            e.printStackTrace();
        }
        // 如果 e4.test02(4); 这个报错了，会中断下面的代码的执行
        // 所以你要处理下。
        System.out.println("Hello");
        /**
         * 运行时异常不会强制让你去写 try{} 或者 throws 的，
         * 但是如果你不做处理的话，它是公影响下面的代码 的执行的。
         */
    }

    // 做 自定义异常时，最好是继承之 RuntimeExceptin 类
    // 因为 RuntimeExceptin 是一个运行时异常(非爱检查异常)。
    // 我们可以处理，可不处理。







}
