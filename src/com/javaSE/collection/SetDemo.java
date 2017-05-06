package com.javaSE.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * set 集合
 *      它是无序的。不可重复。
 */
class Dept implements Comparable<Dept>{
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dept dept = (Dept) o;

        return name != null ? name.equals(dept.name) : dept.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Dept o) {
        return name.compareTo(o.name);
    }
}
public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("jack");
        names.add("Robe");
        names.add("Tom");// 它是添加不进去的，因为不可重复。
        names.forEach(System.out::println);

        System.out.println("-----------------");

        Set<Dept> depts = new HashSet<>();
        Dept d1 = new Dept();
        d1.name = "部门1";

        Dept d2 = new Dept();
        d2.name = "部门1";

        depts.add(d1);
        depts.add(d2); // 因为它是两个对象，所以是可以打印出。可以重写 equals() hashCod() 这两个就可以了，就是你是两个对象，但是你的内容是一样的也是不能添加进去的。
        depts.forEach(dept -> System.out.println(dept.name));


        // LinkedHashSet 它是有顺序的。
        LinkedHashSet<String> names2 = new LinkedHashSet<>();
        names2.add("Tom");
        names2.add("jack");
        names2.add("Robe");
        names2.add("Tom");
        names2.forEach(System.out::println);


        System.out.println("------// TreeSet 集合。-------");
        TreeSet<String> names3 = new TreeSet<>();
        names3.add("Tom");
        names3.add("jack");
        names3.add("Robe");
        names3.add("Tom");
        names3.forEach(System.out::println);


        System.out.println("-----------------------");

        Dept d3 = new Dept();
        d3.name = "dept1";

        Dept d4 = new Dept();
        d4.name = "dept4";

        Dept d5 = new Dept();
        d5.name = "dept5";

        Dept d6 = new Dept();
        d6.name = "dept6";
        // Dept 这个类必须要 实现一个类才行，不是传报下面这个错误。
        // ClassCastException:
        TreeSet<Dept> depts2 = new TreeSet<>();
        depts2.add(d3);
        depts2.add(d4);
        depts2.add(d5);
        depts2.add(d6);
        depts2.forEach(dept -> System.out.println(dept.name));



    }
}
