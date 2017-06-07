package com.javaSE.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 并发编程。
 */
public class CallableAndFuturDemo {
    public static void main(String[] args) {
        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 1;
            }
        };

        FutureTask<Integer> task = new FutureTask<Integer>(c);
        try {
            task.run();
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
