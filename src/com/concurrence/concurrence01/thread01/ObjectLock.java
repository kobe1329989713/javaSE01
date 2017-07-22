package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/22.14:09
 * <br/>
 * Description:
 * 另一种锁。Lock
 */
public class ObjectLock {
    public void method1() {
        synchronized (this) { // thid 就是当前这个类。
            try {
                System.out.println("do method");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void method2() {
        synchronized (ObjectLock.class) { // 类锁。
            try {
                System.out.println("do method2");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Object lock = new Object();

    public void method3() {
        synchronized (lock) {  // 对象锁。
            try {
                System.out.println("do method03");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
