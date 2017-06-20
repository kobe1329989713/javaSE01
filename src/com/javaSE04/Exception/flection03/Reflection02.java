package com.javaSE04.Exception.flection03;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 2:14
 * <br/>
 *  通过 反射 获取
 *      1、获取 包 的信息。
 *      2、获取 类 处信息。
 *      3、获取 属性 的信息。
 */
public class Reflection02 {
    public static void main(String[] args) {
        //1、获取 包 的信息。
        Package p = Package.getPackage("java.lang");
        System.out.println(p.getName());
        // 这个 p 还有很多的方法，看文档。
        // 获取所有的包
        Package[] ps = Package.getPackages();
        for (Package aPackage : ps) {
            System.out.println(aPackage.getName());
        }
    }
}
