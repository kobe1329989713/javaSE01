package com.javaSE04.Exception.flection03.demo03;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 1:01
 * <br/>
 * 反射 加 泛型。
 *
 *  反射 没有完，
 *
 */
class Bird<T> {

}

public class TestReflection {

    Bird<String> b = new Bird<>();

    Bird<? extends Integer> b2 = new Bird<>();


    public static void main(String[] args) throws Exception {
        //Bird<String> 加了泛型就点不出来 class 了，接口也点不出来 class 样。

        // 获取 b 属性。
        Class<TestReflection> c = TestReflection.class;
        Field f1 = c.getDeclaredField("b2");
        System.out.println(f1.getType().getName());
        // 得到它的泛型的类型。 ParameterizedType 参数化的类型
        // getGenericType() 判断它是不是一个泛型。
        if (f1.getGenericType() instanceof ParameterizedType) {
            //System.out.println(
            //    ((ParameterizedType) f1.getGenericType())
            //      .getActualTypeArguments()[0]
            //      .getTypeName()
            //);


            // 判断它是否有 泛型的能配符
            // WildcardType 能配符 类型。
            if (((ParameterizedType) f1.getGenericType()).getActualTypeArguments()[0] instanceof WildcardType) {
                   WildcardType wtp = (WildcardType)((ParameterizedType) f1.getGenericType()).getActualTypeArguments()[0];
                System.out.println(wtp.getUpperBounds()[0].getTypeName());
            }



        }

    }
}
