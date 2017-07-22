package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/22.14:15
 * <br/>
 * Description:
 * 好像是不要对 String 常量进行加锁。
 */
public class StringLock {
    public void mtthod() {
        synchronized ("字符口中常量") { // 不要这样给"字符口中常量" 这样加锁。要 new String("字符口中常量")  这样new 下。 来加锁。
            try {
                while (true) {
                    System.out.println("当前线程是：" + Thread.currentThread().getName() + "开始。");
                    Thread.sleep(100);
                    System.out.println("当前线程是：" + Thread.currentThread().getName() + "结束。");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final StringLock stringLock = new StringLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringLock.mtthod();
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringLock.mtthod();
            }
        });

        t1.start();
        t2.start(); // Multi_001
    }
}
