package com.javaSE.concurrent;

/**
 * @Author:Administrator
 * @Date:2017/5/7 15:56
 */
public class THreadLocalDemo {
    private static ThreadLocal<Integer> t = new ThreadLocal<>();
    public static int test(){
        Integer num = t.get();
        if (num == null){
            num = 10;
            t.set(num);
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test());
    }
}
