package com.javaSE.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * 并发操作。
 */
public class AtomicIntegerDemo {
    public static void main(String[] args) {
        int num = 10;
        //num++;

        AtomicInteger i1 = new AtomicInteger(num);
        System.out.println(i1.getAndIncrement()); // 先获取值。在 ++ 自增。
        System.out.println(i1.getAndAccumulate(3, (x, y) -> x + y));
        System.out.println(i1.get());
        // i--
        System.out.println(i1.decrementAndGet());
        System.out.println(i1.updateAndGet(x -> x * x));

        int[] nums12 = {1, 2, 3, 4, 5};
        AtomicIntegerArray a = new AtomicIntegerArray(nums12);
        // 数组的第四个元素 加上 10
        System.out.println(a.addAndGet(3, 10));

        System.out.println(a.accumulateAndGet(2, 10, (x, y) -> x * y));


        User u = new User();
        u.setScore(100);
        AtomicIntegerFieldUpdater<User> updater = AtomicIntegerFieldUpdater.newUpdater(User.class,"score");
        updater.getAndAdd(u,200);
        System.out.println(updater.getAndAdd(u,200));
        System.out.println(u.getScore());
    }
}
