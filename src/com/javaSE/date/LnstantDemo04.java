package com.javaSE.date;

import java.time.Duration;
import java.time.Instant;

/**
 *
 */
public class LnstantDemo04 {
    public static void main(String[] args) {
        // 从 1990 5
        Instant i1 = Instant.ofEpochMilli(1000);
        Instant i2 = Instant.now();// 这是当前时间。


        Duration d1 = Duration.ofDays(3);
        Duration d2 = Duration.ofMinutes(30);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(i1.isAfter(i2));
    }
}
