package com.javaSE.io;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

/**
 * zip 模式的压缩文件，处理。
 */
public class ZipDemo {
    public static void main(String[] args) throws Exception {
        //createZip();
        //unzip();
        //list();
        list2();
    }

    /**
     * 添加压缩文件。
     * @throws Exception
     */
    private static void createZip() throws Exception {
        // 创建 zip 文件里面，并指定放置在哪个位置。
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test1.zip"))) {
            // 设置压缩的级别。
            zos.setLevel(Deflater.BEST_COMPRESSION);
            // 把 这个 f1.txt 文件压缩到 文件里面去。
            ZipEntry ze1 = new ZipEntry("f2.txt");
            zos.putNextEntry(ze1);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("f2.txt"));
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = bis.read(buffer, 0, buffer.length)) != -1) {
                zos.write(buffer, 0, len);
            }
            bis.close();
// -------------------------------------------------------------------------------

            // 在压缩一个文件，最好是在写一个方法传入进来完成。
            ZipEntry ze2 = new ZipEntry("out.txt");
            zos.putNextEntry(ze1);
            BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("out.txt"));
            byte[] buffer2 = new byte[1024];
            int len2 = -1;
            while ((len2 = bis2.read(buffer, 0, buffer2.length)) != -1) {
                zos.write(buffer2, 0, len2);
            }
            bis2.close();

            zos.closeEntry(); // 没有文件需要压缩进去时，关闭掉。
        }
    }

    /**
     * 解压。
     * @throws Exception
     */
    private static void unzip() throws Exception {
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream("test1.zip"))){
            ZipEntry entry = null;
            while ((entry = zis.getNextEntry()) != null){
                String name = entry.getName();
                String path = "test2" + File.separator + name;
                File file = new File(path);
                if(file.getParentFile().exists()){
                    file.getParentFile().mkdir();
                }
                file.createNewFile();
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int len = -1;
                while ((len = zis.read(buffer,0,buffer.length)) != -1){
                    bos.write(buffer,0,len);
                }
                bos.close();
            }
        }
    }


    /**
     * 查看 压缩文件里面的 列表。
     * @throws Exception exception
     */
    public static void list() throws Exception {
        ZipFile f = new ZipFile("test1.zip");
        Enumeration<? extends ZipEntry> e = f.entries();
        while (e.hasMoreElements()){
            ZipEntry ze = e.nextElement();
            System.out.println(ze.getName());
        }
    }

    /**
     * 方式 二。
     * @throws Exception e
     */
    private static void list2() throws Exception {
        ZipFile f = new ZipFile("test1.zip");
        f.stream().forEach(entry -> System.out.println(entry.getName()));
    }


}
