package com.javaSE.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 解析 decorator.properties 属性文件。
 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        // 加载属性文件。
        Properties p = new Properties();
        p.load(new FileInputStream("config.properties"));
        // 遍历。全部。
        //p.forEach((n, v) -> System.out.println(n + "，" + v));
        // 得到某一个属性。
        System.out.println(p.getProperty("name"));
        System.out.println(p.get("name"));

        // 修改属性文件里面的内容。
        p.setProperty("name","Jack");
        // 往后面添加属性。
        p.setProperty("name222","Jack222");
        p.store(new FileOutputStream("config.properties"),"");


        // 获取系统属性。
        Properties sp = System.getProperties();
        sp.forEach((n, v) -> System.out.println(n + "=====" + v));
    }
}
