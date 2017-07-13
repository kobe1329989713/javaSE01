package com.javaSE04.Exception.enum05;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 2:20
 * <br/>
 */
public enum Serson {
    // 枚举 申明 变量，春 下 秋 冬。
    SPRING("ss01"),SUMMER("ss02"),AUTUMN("ss03"),WINXX("ss04");



    // 枚举里面的 成员属性。
    String name;

    // 只要上面 枚举 的实例 被用一次，它的构造就会被调用一次。
    private Serson(){
        System.out.println("=枚举的构造方法，只能是 private 的=");
    }

    private Serson(String name) {
        this.name = name;
        System.out.println("season");
    }

    // 枚举里面的普通方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
