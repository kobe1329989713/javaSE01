package com.javaSE.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * collections 集合的工具类，有大量的静态方法使用。看 API
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(12);
        nums.add(13);
        nums.add(14);

        // 这种遍历方式只能针对 List 集合 及其它的子类。
        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }

        //
        System.out.println("-------用工具类来排序。--------");
        Collections.sort(nums);
        nums.forEach(System.out::println);


        //
        System.out.println("---------查找一个 9 数字。---------");
        System.out.println(Collections.binarySearch(nums,9));

        System.out.println("----随机把 集合里面的元素 打乱----------");
        Collections.shuffle(nums);
        nums.forEach(System.out::println);



        System.out.println("-----反转---------");
        Collections.reverse(nums);
        nums.forEach(System.out::println);


        System.out.println("------两个元素交换--------");
        Collections.swap(nums,0,1);
        nums.forEach(System.out::println);

        System.out.println("-----------");



        // 这样保证了 类型了。
        List<Integer> nums3 = Collections.checkedList(nums,Integer.class);
        List nums2 = nums3;
        // 就可以加其它类型了，但是在循环时，就会报类型转换异常了。
        //nums2.add("sss");
        //for (Object o : nums2) {
        //
        //}

        // java.lang.UnsupportedOperationException 不支持的操作异常。
        System.out.println("产生 单个集合。");
        List<String> name = Collections.singletonList("Tom");
        name.add("Jack");









    }
}
