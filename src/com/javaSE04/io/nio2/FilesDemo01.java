package com.javaSE04.io.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by kobe on 2017/7/13.1:32
 * <br/>
 * Description:
 * Filss 类
 */
public class FilesDemo01 {
    public static void main(String[] args) throws Exception {
        Path p1 = Paths.get("f3.txt");
        // 创建一个文件。
        Files.createFile(p1);

        // 创建目录。
    }
}
