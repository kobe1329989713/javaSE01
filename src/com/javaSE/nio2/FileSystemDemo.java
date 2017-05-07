package com.javaSE.nio2;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * FileSystem 应用。
 */
public class FileSystemDemo {
    public static void main(String[] args) throws Exception {
        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs.isReadOnly());
        System.out.println(fs.getSeparator());
        // 文件存储。
        for (FileStore s : fs.getFileStores()) {
            System.out.printf("%s,%s,%s\n",s.name(),s.getTotalSpace(),s.getUnallocatedSpace(),s.type());
        }
// 查看当前 文件系统信息。
        for(Path p:fs.getRootDirectories()){
            System.out.println(p);
        }








    }
}
