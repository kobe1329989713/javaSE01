package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/22.12:36
 * <br/>
 * Description:
 * 当 使用 synchronized 出现异常时。
 */
public class SyncException {
    private int i = 0;

    public synchronized void operation() {
        while (true) {
            try {
                i++;
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + "，i = " + i);
                if (i == 10) {
                    Integer.parseInt("a");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("这种就必须要记录日志了，如下：");
                System.out.println("log info i = " + i);

                // 也可以抛出来一个运行时异常，让线程停止。
                throw new RuntimeException("也可以抛出来一个运行时异常，让线程停止。");

                // 用 continue; 也是可以的。让它路过出错 的这一次循环。
//                continue;
            }
        }
    }

    public static void main(String[] args) {
        final SyncException se = new SyncException();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                se.operation();
            }
        });
        t1.start();
    }
}
