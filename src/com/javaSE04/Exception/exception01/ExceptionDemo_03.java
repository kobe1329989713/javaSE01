package com.javaSE04.Exception.exception01;

import java.io.IOException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 受检异常的处理
 */
public class ExceptionDemo_03 {

    // 这种初始块异常的处理。
    // 是在构造方法里面处理，还是哪两个选项，要么 try{}，要么 throws
    {
        System.in.read();
    }
    public ExceptionDemo_03() throws IOException {
    }



    // 静态代码块 异常处理。
    static {
        // 只能在 静态代码块 try{} 掉。
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        int num1 = 10, num2 = 0;
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        /**
         *  RuntimeException 及其子异常是非受检异常的
         *  是Exception及其子异常，但是不是RuntimeException及其子异常
         *  就是 受检异常，IO异常就是受检异常。
         *
         */


        /**
         * throws 可能会抛出了什么异常，throw 一定抛出了什么异常
         *
         * 受检异常。必须要显示的处理掉。
         * 必须要处理，用 try 或者是 throws
         */
        //try {
        //    System.in.read();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}


        // 用 throws 处理异常，抛到方法上面去，将来所调用它，
        // 谁来处理，处理就是用 try{}，往上抛就是交给虚拟机处理了，
        System.in.read();



        /**
         *  你如果在调用别人的 throws 异常的方法，
         *  你在调用了，就会提示你处理异常了，
         *  你有两个选项，
         *  1、try{}
         *  2、继承往上抛。
         */
        ExceptionDemo_03 e3 = new ExceptionDemo_03();
        // 还是哪两个选项处理掉异常。
        e3.test();
        /**
         *  我们都是在处理try{} JDK 抛出来的异常。
         *  有时也可以 try{} 一部分异常，然后在抛出来一部分异常。
         */
    }


    public void test() throws IOException {
        // 你处理异常了，将来别人就不用管异常了。
        //try {
        //    System.in.read();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

        // 让别人来处理。 注：异常类层次结构。
        System.in.read();
    }


    public void test01() {
        //try {
            // 注：如果你 try{} 里面没有发生你 catch() 里面捕获的
            // 哪个异常 catch() 哪里是会报错的。
            // catch() 捕获的异常一定是 try{} 里面可能会出现的异常才行。
            System.out.println("test01");
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
    }


    // throw 肯定会抛出什么异常，之用法。
    public void test03() {
        // 因为 throw 是肯定会抛出什么异常的，
        // 所以你必须要处理掉，也是 要么 try{} ，要么 throws
        try {
            throw new IOException();
            // 在某些业务当中出现什么情况是肯定会出现异常的，
            // 所以用 throw 抛出，让上一层的代码处理掉。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
