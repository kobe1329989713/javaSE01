package com.javaSE.date;

import java.time.Period;

/**
 * 这些类的对象，都还是用 new 的方法哦。
 */
public class PeriodDemo09 {
    public static void main(String[] args) {
        Period p = Period.of(1,2,20);
        System.out.println(p);

        // 继续往这个时间节点上面 加时间。或者是 减 时间(负数)
        System.out.println(p.minusDays(21));
    }
}
