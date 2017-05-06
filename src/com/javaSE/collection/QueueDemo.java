package com.javaSE.collection;

import java.util.*;

/**
 * Queue队列：
 *
 */
//class Person implements Comparable<Person>{
class Person{
    String name;

    public String getName() {
        return name;
    }

    //@Override
    //public int compareTo(Person o) {
    //    return name.compareTo(o.name);
    //}
}
public class QueueDemo {
    public static void main(String[] args) {
        // 简单队列
        Queue<String> s1 = new LinkedList<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        System.out.println(s1);
        //s1.offer("d"); // 也是一个添加方法。有容量的队列，优先使用它。
        // 先放进去的，先出来。
        // peek() 和 next() 方法差不多的。
        while (s1.peek() != null){
            //System.out.println(s1.peek());
            System.out.println(s1.element());
            //s1.remove();
            s1.poll(); // 和 remove() 差不多。
            System.out.println(s1);
        }
        // 在哪种有容量的队列，就要使用 注解掉的这些方法 来添加 获取。不是的话可能会报错。


        //System.out.println("--------// 优先队列之自定义类型。-----");
        //Queue<Person> s2 = new PriorityQueue<>();
        Person p1 = new Person();
        p1.name = "Tom";
        Person p2 = new Person();
        p2.name = "Tom222";
        Person p3 = new Person();
        p3.name = "Tom333";
        //
        //// 添加到队列当中。
        //s2.add(p1);
        //s2.add(p2);
        //s2.add(p3);
        //System.out.println(s2);
        //while (s2.peek() != null){
        //    Person p = s2.peek();
        //    System.out.println(p.name);
        //    s2.remove();
        //}


        System.out.println("-----------------");
        Queue<Person> s3 = new PriorityQueue<>(Comparator.comparing(Person::getName));
        s3.add(p1);
        s3.add(p2);
        s3.add(p3);
        while (s3.peek() != null){
            Person p = s3.peek();
            System.out.println(p.name);
            s3.remove();
        }


        System.out.println("-----双端队列-----");
        Deque<String> s4 = new LinkedList<>();
        // s4它可以 在头 尾来 添加元素，相应的 取也可以 从头或者 是尾来获取。





    }
}
