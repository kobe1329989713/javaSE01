package com.javaSE.date;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期
 */
public class DateDemo01 {
    public static void main(String[] args) {
        // d 就是当前日期点。它是从 1970年1月1号0时0分0秒，开始计算了。
        Date d = new Date();
        System.out.println(d.getTime()); // 时间戳

        // jdk 8 新日期API,  方根上标有 Deprecated 的方法 不要使用 了。
        Date d1 = new Date();
        // 根据时间戳,获取 xx年xx月xx日。。
        d1.setTime(1492859427052L);
        //System.out.println(d1);

        // 判断哪个时间在前，哪个在后。
        System.out.println(d.after(d1));






        // javaAPI 方法 全部都是有：重载的。
        // 通过Calendar 来获取年月日，这些东东。它是Date 里面哪个过期方法替代方案。
        Calendar c = Calendar.getInstance();
        // 获取年。
        //System.out.println(c.get(Calendar.YEAR));
        // 月。因为 月是从 0 开始算。
        //System.out.println(c.get(Calendar.MONTH) + 1);


        // 在某一个时间上，在加个什么时间，如在加过 7天，就是 时间的加减。
        System.out.println(c.get(Calendar.YEAR)+"年，"
         + (c.get(Calendar.MONTH)+1)+"月，"
         + c.get(Calendar.DATE)
        );
        // 在这个时间节点上加 7 天。
        c.add(Calendar.DATE,7);

          System.out.println(c.get(Calendar.YEAR)+"年，"
         + (c.get(Calendar.MONTH)+1)+"月，"
         + c.get(Calendar.DATE)
        );


        // 在这个时间节点上减 7 天。如果你加的是 年 月 日  分  。。 这些的话，前面哪个常量变化就行。
        c.add(Calendar.DATE,-7);
        System.out.println(c.get(Calendar.YEAR)+"年，"
                + (c.get(Calendar.MONTH)+1)+"月，"
                + c.get(Calendar.DATE)
        );


        // 它是不会进位的。add() 方法它就会
        // 如你用 add() 月份已经是最后一个了，前端对应的 年 月这些会加 1 的。
        // roll(年月。。，Boolean); true + 1 ，false - 1
        c.roll(Calendar.DATE,30);
        System.out.println(c.get(Calendar.YEAR)+"年，"
                + (c.get(Calendar.MONTH)+1)+"月，"
                + c.get(Calendar.DATE)
        );

    }
}
