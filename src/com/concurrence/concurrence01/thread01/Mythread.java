package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/21.20:55
 * <br/>
 * Description:
 * 一个简单的 线程类。
 */
public class Mythread extends Thread{
    private int count = 5;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(this.currentThread().getName() + "：count=" + count);
    }

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Thread t1 = new Thread(mythread,"t1");
        Thread t2 = new Thread(mythread,"t2");
        Thread t3 = new Thread(mythread,"t3");
        Thread t4 = new Thread(mythread,"t4");
        Thread t5 = new Thread(mythread,"t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        /**
         * 五个线程，去执行 run() 方法。它打印的是 没有顺序的，所以它是线程不安全的。
         *  加了锁(synchronized)它就是线程安全的，它打印的就是 4，3，2，1，0。
         *
         *  synchronized 同步锁，让线程安全的执行。不会出现几个线程同时操作一个数据。
         *  只能拿到 锁的线程才可以执行。其它没有拿到锁的线程等待。直到拿到锁它才能够执行。
         *  上 厕所样。
         *  缺点：
         *      如果有1000个线程，甚至更多线程时，如果第一个线程拿到锁了，其它999个线程同时
         *      去抢这一把锁会造成CPU使用率马上100%甚至造成死机(岩机)的可能 ，
         *      而999个线程全部在等待中会有效率的问题。
         *
         *  解决办法：多个线程多个锁。看 Mythread02 类。
         */
    }
}
