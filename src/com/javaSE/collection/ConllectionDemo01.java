package com.javaSE.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合 一些常用循环
 *
 */
public class ConllectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        // 集合遍历之 Iterator 方式。
        Iterator<String> iter = c1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            // 注：你调用这个方法删除元素时，前面必须要调用下 next() 方法才行。不然它就会报 java.lang.IllegalStateException 这个错误出来。
//            iter.remove();
        }
        System.out.println(c1.size());


        System.out.println("----------------------------");
        // for-each 循环。它在循环时，你不能去删除元素。
        for (String c : c1) {
            // 这样删除 会出现并发修改异常 java.util.ConcurrentModificationExceptiona
            // 所以 增强for循环是不能在循删除元素的。
//            c1.remove(c);
            System.out.println(c);
        }


        System.out.println("----------------------------");

        // 朗母表达式 循环
        c1.forEach(s -> System.out.println(s));

        // 一个方法引用来 循环。
        c1.forEach(System.out::println);

    }
}
