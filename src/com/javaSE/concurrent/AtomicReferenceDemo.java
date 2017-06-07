package com.javaSE.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * 原子操作。
 */
public class AtomicReferenceDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setName("kobe");
        user.setScore(100);
        AtomicReference<User> r1 = new AtomicReference<>();
        r1.set(user);

        r1.getAndUpdate(u -> {
            u.setScore(300);
            return u;
        });
        System.out.println(user.getScore());

        User user2 = new User();
        user2.setName("kob2222e");
        user2.setScore(100);
        r1.accumulateAndGet(user2, (u1, u2) -> {
            u1.setScore(u2.getScore());
            return u1;
        });
        System.out.println(user.getScore());


        //AtomicReferenceArray<User> r2 = new AtomicReferenceArray<User>(new User[]{user, user2});
        //r2.accumulateAndGet(0, user2, (u1, u2) -> {
        //    u1.setScore(u2.getScore() * 2);u2.getScore() * 2); return u1;
        //});
    }
}
