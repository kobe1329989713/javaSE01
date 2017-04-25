package com.javaSE.math;

import java.util.Random;

/**
 *  跟数据学相关的，如：相下 相上 取整。
 */
public class MathDemo01 {
    public static void main(String[] args) {
        // 得到一个负数的绝对值。就是 负数的整数。
        System.out.println(Math.abs(-12.34));
        // 向上取整 1.1 它也打印的是：2.0
        System.out.println(Math.ceil(1.1));
        // 向上取整，1.9 它也打印的是：1.0
        System.out.println(Math.floor(-1.9));
        System.out.println(Math.max(-1.9,2));


        // 随机数，
        for(int i=0; i<10; i++){
            // 如果你给了种子的话，它就取哪个种子里面的随机数了
            System.out.println(Math.random());
        }
        System.out.println("---------------");
        Random r1 = new Random();
        // 得到一个随机的整数，，随机数。
        // 给一个参数。它就从 0 ~ 10 的一个随机数。
        System.out.println(r1.nextInt(10));

        // 一个范围随机数。是一个 10 ~ 20 的随机数，
        // 因为前面是 0 ~ 10 在加一个 10 所以就是 10 ~ 20 的随机数了。
        System.out.println(r1.nextInt(10)+10);


    }
}
