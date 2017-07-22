package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/21.22:45
 * <br/>
 * Description:
 *  一般的并时,用 synchronized 就可以了。
 */
public class SyncDubbol2 {

    /**
     * 他们老师线程安全。
     */
    static class Main{
        public int i = 10;

        public synchronized void operationsup() {
            try {
                i--;
                System.out.println("Mail print i = " + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class sub extends Main{
        @Override
        public synchronized void operationsup() {
            try {
                while (i > 0) {
                    i--;
                    System.out.println("sub print i = " + i);
                    Thread.sleep(100);
                    this.operationsup();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sub s = new sub();
                s.operationsup();
            }
        });
        t1.start();
    }
}
