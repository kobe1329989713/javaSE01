package com.javaSE04.io.file;


import java.io.File;
import java.io.IOException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 1:43
 * <br/>
 */
public class fileDemo {
    public static void main(String[] args) throws Exception {
        // 获取项目的相对路径。 没有某个文件，就在这个目录下面创建。
        System.out.println(System.getProperty("user.dir"));
        // 一个文件对象。
        File f1 = new File("f1.txt");
        // 一个目录对象。没有就创建。
        File f2 = new File("test");

        System.out.println("判断些文件是否存在："+f1.exists());
        System.out.println("没有存在就创建："+f1.createNewFile());
        //if (f1.exists()) {
        //    f1.createNewFile()
        //}


        System.out.println(System.getProperty("java.io.tmpdir"));
        File.createTempFile("aaa", "tmp");
    }
}
