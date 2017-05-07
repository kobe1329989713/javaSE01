package com.javaSE.nio2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Path
 */
public class PathDemo {
    public static void main(String[] args) {
        Path p1 = FileSystems.getDefault().getPath("F:\\idea\\ideaSpace\\space02\\javaSE\\javaSE01\\f2.txt");
        System.out.println(p1);
        int count = p1.getNameCount();
        System.out.println(count);
        // f2.txt 的绝对路径 是由下面这些组成。
        for(int i=0; i<count; i++){
            System.out.println(p1.getName(i));
        }
        // 得到根目录。
        System.out.println(p1.getRoot());
        // 得到父目录。
        System.out.println(p1.getParent());
        // 是否是绝对路径。
        System.out.println(p1.isAbsolute());


        System.out.println("------------------------------------------");

        Path p2 = Paths.get("F:\\idea\\ideaSpace\\space02\\..\\..\\f2.txt");
        System.out.println(p2.normalize());

        // 路径加一层。
        Path p3 = Paths.get("f1");
        System.out.println(p2.resolve(p3));


        Path p4 = Paths.get("F:\\idea");
        System.out.println(p2.relativize(p4));
        System.out.println(p4.relativize(p2));

        System.out.println(p2.subpath(0,4));

        System.out.println(p2.startsWith(p4));
        System.out.println(p2.endsWith(p4));
        System.out.println(p2.equals(Paths.get("F:\\idea\\IDEASPACE\\..\\..\\f2.txt")));








    }
}
