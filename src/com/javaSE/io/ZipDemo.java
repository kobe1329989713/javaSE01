package com.javaSE.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * zip 模式的压缩文件，处理。
 */
public class ZipDemo {
    public static void main(String[] args) {

    }
    private static void createZip() throws Exception {
        // 创建 zip 文件里面，并指定放置在哪个位置。
        try(ZipOutputStream zos =new ZipOutputStream(new FileOutputStream("test1.zip"))){
            // 设置压缩的级别。
            zos.setLevel(Deflater.BEST_COMPRESSION);
            // 把 这个 f1.txt 文件压缩到 文件里面去。
            ZipEntry ze1 = new ZipEntry("f1.txt");
            zos.putNextEntry(ze1);
        }
    }



}
