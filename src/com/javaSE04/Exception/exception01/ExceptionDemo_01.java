package com.javaSE04.Exception.exception01;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 见名知意？？？
 */
public class ExceptionDemo_01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int r = num1 / num2;
            System.out.println(r);
        //} catch (ArrayIndexOutOfBoundsException e) { // 异常匹配就会中断程序的执行。
        } catch (Exception e) { // 这里只能放 Exception 或者是它的子类。其它不行。
            /**
             *  如果异常了，就是执行这里面的、像 if 样。
             *  e 就是异常的一个对象，它就可以调用异常一切相关
             *  的方法，能捕获的异常都是 Exception 或者是它的子类。
             *  ，如果没有出现它就正常执行。所以try{} 是可能会产生异常
             *  而不是一定会产生异常。
             *
             *  它是捕猎异常时，会匹配异常信息，如果捕猎的异常
             *  和你的异常不一致，它以会中断程序的执行，????
             *
             */
            // 打印异常信息。
            // e. 就会把异常的哪些信息给输出，找错误
            e.printStackTrace();
            // 这种是不专业的做法
            System.out.println("出错了。");
        }finally {
            // finally 是否发生异常 finally 里面的 代码都能被执行到。
            System.out.println("==finally 是否发生异常 finally 里面的 代码都能被执行到。=");
        }
        // 这个 r 在这里是访问不到了，但是你把这个 r 定义在
        // try{} 的外面就可以访问的到。不是你就把它r 放在 try{}里面才行。
        //System.out.println(r);

        // 用了 try{} 就算 哪里出现异常了，后面的代码还是可以执行的。
        System.out.println("Hello");
    }

    // try{}finally{} try{} 后面可以直接给 Finally{} 的
    // try{} 单独的一个 try{} 是错误的。
    // finally{} 是释放资源，关闭连接等。


    // Throwable 所有异常的 根。
    // 看看异常。
}
