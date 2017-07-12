package com.javaSE04.io.nio2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by kobe on 2017/7/13.1:07
 * <br/>
 * Description:
 * 路径。
 */
public class PathDemo{
    public static void main(String[] args) {
        // 直接写 f2.txt 就是相对路径，                   这样写就是绝对路径。
        Path p1 = FileSystems.getDefault().getPath("D:\\kobe\\idea\\ideaProjects\\space01\\javaSE01\\javaSE01\\f2.txt");
        System.out.println(p1);
        int count = p1.getNameCount();// 它这个组成部分里，占几。
        // 这个路径的组成部分。
        System.out.println(count);
        for (int i=0;i<count;i++) {
            System.out.println(p1.getName(i));
        }
        System.out.println("得到根目录：" + p1.getRoot());
        System.out.println("得到父目录：" + p1.getParent());
        System.out.println("判断它是否是一个绝对路径：" + p1.isAbsolute());

        Path p2 = Paths.get("D:\\kobe\\..\\..\\space01\\javaSE01\\javaSE01\\f2.txt");
        // 把带有 【.】 点的，直接以它的名字的打印出来。
        // 它是 遇到 点了，直接以相对路径把你找到在说，然后继续循环下去。
        System.out.println(p2.normalize());

        Path p3 = Paths.get("f2.txt");
        // 它是把两个路径给连接起来。
        System.out.println(p2.resolve(p3));
        p2.relativize(p3); // 它的相当什么路径。

        //  求一个子路径。
        System.out.println(p2.subpath(1, 3));
    }
}
