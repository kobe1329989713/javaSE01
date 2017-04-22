package com.javaSE.date;

import java.time.Clock;
import java.time.Instant;

/**
 *
 */
public class ClockDemo08 {
    public static void main(String[] args) {
        // 获取一个默认时区。
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());

        // 获取这个时区的 时间。
        Instant i = c.instant();
        Instant i2 = Instant.now(c);
        System.out.println(i);
        System.out.println(i2);
    }
}
