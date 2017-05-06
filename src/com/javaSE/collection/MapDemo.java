package com.javaSE.collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map 集合
 * 遍历 方式。
 *
 *  has 开关的集合，一般都不保证顺序的
 *  Link 这种开关的它就是有顺序的。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<>();
        m1.put("a","A");
        m1.put("b","Bcdfe"); // key 不能重复。

        System.out.println("-----// 循环 map，方式一：----");
        Set<String> keys = m1.keySet();
        keys.forEach(key ->{
            System.out.println(m1.get(key));
        });



        System.out.println("-----// 循环 map，方式二：----");
        m1.values().forEach(v -> System.out.println(v));



        System.out.println("-----// 循环 map，方式三：----");
        Set<Map.Entry<String,String>> entries = m1.entrySet();
        entries.forEach(e -> System.out.println(e.getKey() + "--，" + e.getValue()));




        System.out.println("-----// 循环 map，方式四：----");
        m1.forEach((k,v) -> System.out.println(k + "，" + v));


        System.out.println("--------------------");



    }
}
