package com.javaSE04.Exception.enum05;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 1:44
 * <br/>
 *  枚举 就是一个新的数据类型。
 */
public enum Enum1 {
    // 枚举 申明 变量，春 下 秋 冬。
    SPRING,SUMMER,AUTUMN,WINXX;



    // 枚举里面的 成员属性。
    String name;

    private Enum1(){
        System.out.println("=枚举的构造方法，只能是 private 的=");
    }


    // 枚举里面的普通方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
