package com.javaSE.compare;

/**
 * 比较 自定义 的比较。
 * 为现有的类 提供了比较的能力。
 */
public class CompareDemo {
    public static void main(String[] args) {
        User u1 = new User();
        u1.age = 10;

        User u2 = new User();
        u2.age = 20;


        // 比较的逻辑。
        if(u1.compareTo(u2) > 0){
            System.out.println("u1 > u2");
        }else if(u1.compareTo(u2) < 0){
            System.out.println("u1 < u2");
        }else {
            System.out.println("u1 == u2");
        }


    } 
}
