package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/21.21:25
 * <br/>
 * Description:
 * 线程加了锁，如果线程多了可能会岩机的问题。
 */
public class Mythread02 {
    private static int num = 0;

    public static synchronized void printNum(String tag) {
        try {
            if (tag.equals("a")) {
                num = 100;
                System.out.println("tag a,num over");
                Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println("tag b,set num over");
            }
            System.out.println("tag," + tag + "，num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 它是一个对象，一把锁。
        final Mythread02 m1 = new Mythread02();
        final Mythread02 m2 = new Mythread02();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                m1.printNum("a");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                m2.printNum("b");
            }
        });

        t1.start();
        t2.start();

        /**
         *tag b,set num over
         tag,b，num=200
         tag a,num over
         tag,a，num=100
        它是 b 执行完了，在执行的 a 了？？？。
         它的输出结果，？？？因为它是,它是一个对象，一把锁。所以else 里面也执行了。？？？


         static synchronized
         如果你在 静态的方法上面 加锁了，它就是类级别的锁了。类锁。

         */
    }
}
