package com.javaSE.concurrent;

import java.util.concurrent.*;

/**
 * 线程池。
 */
public class ExceutorDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        Future<Integer> f = es.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 1;
            }

        });

        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        es.shutdown(); // 这个线程就关闭了。
    }
}
