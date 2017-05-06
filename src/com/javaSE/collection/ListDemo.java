package com.javaSE.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * list 集合。
 *
 */
class User{
    String name;
}

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add(0,"Tom");
        names.add(1,"jack");
        names.add(2,"jack222");
        names.add(3,"jack333");

        // 是否包含一个元素。
        System.out.println(names.contains("Tom"));

        // 按照这种索引的方法的方式，必须要有顺序的添加不是报：java.lang.IndexOutOfBoundsException 错误。
        //names.add(4,"jack");

        names.forEach(System.out::println); // 方法引用遍历。

        // 获取 这个元素的 下标。lastIndexOf(); 有相同元素就可以使用它，
        System.out.println(names.indexOf("Tom"));

        // 获取下标之间的元素。截取。
        System.out.println(names.subList(1,3));



        ListIterator<String> iter = names.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-------倒着遍历--------");
        while (iter.hasPrevious()){
            System.out.println(iter.previous());
        }

        // LinkedList 和 ArrayList 一样的。练习下。
        // LinkedList 可能有一些差异的方法。

        List<User> users = new ArrayList<>();
        User u = new User();
        u.name = "Tom";

        User u1 = new User();
        u1.name = "Tom";

        // 装到集合中去。
        users.add(u);
        // 这里面肯定是不包含的。
        // 也可以让它等于 true 的 ，重写下 User 里面的 equals() 方法就好。
        System.out.println(users.contains(u1));
    }
}
