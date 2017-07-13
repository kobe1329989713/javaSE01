package com.javaSE04.io.nio2;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Created by kobe on 2017/7/13.0:37
 * <br/>
 * Description:
 * NIO.2 吐，之 File 增强版，FileSystem
 */
public class FileSystemDemo {
    public static void main(String[] args) throws Exception {
        // FileSystem 它是一个抽象的，所以必须用 FileSystems 这个工厂类来创建实例。
        FileSystem fs = FileSystems.getDefault();
        System.out.println("判断文件是否只读：" + fs.isReadOnly());
        System.out.println("查看文件的分隔符：" + fs.getSeparator());
        // 要循环下，
        System.out.println("标示文件存储：" + fs.getFileStores());
        for (FileStore s : fs.getFileStores()) {
            System.out.println(s);
            System.out.printf("%s,%s,%s,%s,%s,/n",s.name(),s.getTotalSpace(),s.getUnallocatedSpace()
            ,s.getUsableSpace(),s.type());
            // 1、文件名字。2、总的空间。3、未分派空间。4、可用空间。5、是否只读。6、文件类型。
        }


        System.out.println("===// 获取文件的根目录。=");
        for (Path p : fs.getRootDirectories()) {
            System.out.println(p);
        }





    }

}
