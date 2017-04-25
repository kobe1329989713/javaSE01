package com.javaSE.compare;

import java.util.Comparator;

/**
 * 也是一个自定义 比较。
 * 它是使两个类 有了比较的能力。
 * user 它就不用实现 某个接口。
 */
public class MyAgeComparator implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        if(o1.age > o2.age){
            return 1;
        }else if(o1.age < o2.age){
            return -1;
        }
        return 0;
    }
}
