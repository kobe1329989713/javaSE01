package com.javaSE04.Exception.flection03.demo02;

import java.lang.reflect.Array;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 0:39
 * <br/>
 * 通过反射来操作 数组。
 */
public class CatTest {
    public static void main(String[] args) throws Exception {
        Class<Cat> c = Cat.class;
        //c.newInstance();

        // 通过反射创建数组。
        Cat[] cats = (Cat[]) Array.newInstance(Cat.class, 10);
        System.out.println(cats.length);
        // 给数组赋值。
        cats[0] = new Cat();


        int[] nums = (int[]) Array.newInstance(int.class, 5);
        nums[0] = 2;
        nums[1] = new Integer(4);

        // [Ljava.lang.String;@1540e19d  注意数组的输出的样式 [L
        System.out.println(new String[10]);


        // 创建多维数组
        int[][] nums2 = (int[][]) Array.newInstance(int.class, 3, 5);


        int[] num3 = (int[]) Array.newInstance(int.class, 5);
        // 赋值。引用类型的 set() 赋值，基本类型的，根据类型来选择对应的方法赋值。
        Array.setInt(num3,0,10);
        Array.setInt(num3,1,9);
        Array.setInt(num3,2,8);
        Array.setInt(num3,3,7);
        Array.setInt(num3,4,6);
        // 取值。
        //for (int i : num3) {
        //    System.out.println(i);
        //}
        // 通过反射 取值。
        for (int i=0; i<num3.length; i++) {
            System.out.println(Array.getInt(num3, i));
        }


        System.out.println("==// 通过反射得到数组的 元素类型。==");
        // 判断它是不是一个数组。
        System.out.println(cats.getClass().isArray());
        // 得到数组元素类型
        System.out.println(
            cats.getClass().getComponentType().getName()
        );

    }
}
