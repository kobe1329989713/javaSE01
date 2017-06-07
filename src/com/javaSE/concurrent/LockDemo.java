package com.javaSE.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁。
 */
public class LockDemo {

    Lock lock = new ReentrantLock();

    public void print(){
        lock.lock(); // 加锁。
        for (int i=0; i<10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        test();
        lock.unlock(); // 释放锁。
    }


    public void test(){
        lock.lock(); // 可重入锁。
        System.out.println("test");
        lock.unlock();
    }

    public static void main(String[] args) {
        LockDemo demo = new LockDemo();
        new Thread(demo::print).start();
        new Thread(demo::print).start();
    }

}
