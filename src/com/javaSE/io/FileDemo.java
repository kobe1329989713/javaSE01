package com.javaSE.io;

import java.io.File;
import java.io.IOException;

/**
 *
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 获取到你这个项目的根目录。
        System.out.println(System.getProperty("user.dir"));

        // 这是一个绝对路径。
        //File f1 = new File("F:\\java\f1.txt");
        // 相对路径，相对上面哪个
        File f1 = new File("f1.txt");
        // 表示一个 目录。
        //File f1 = new File("test");
        // 判断这个文件或者文件夹是否存在。
        //System.out.println(f1.exists());
        // 没有就创建它
        System.out.println(f1.createNewFile());

        //System.out.println(System.getProperty("java.io.tmpdir"));
        //File.createTempFile("aaa","tmp");

        // 创建目录
        //f1.mkdir();
        // 删除
        //f1.delete();
        //f1.renameTo(new File("text222"));


        // 长度。
        System.out.println(f1.length());
        // 获取电脑上所有根目录。
        for (File f : File.listRoots()) {
            System.out.println(f.getPath());
        }


        // 过滤一些 文件或者是 文件夹。
        File src = new File("src/com");
        File[] files = src.listFiles(file -> file.getName().endsWith("Pa"));
        for (File file2 : files) {
            System.out.println(file2.getName());
        }
        //for (String f2:src.list()){
        //    System.out.println(f2);
        //}















    }
}
