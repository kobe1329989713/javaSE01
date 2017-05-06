package com.javaSE.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 文件的 copy
 */
public class FileCopy {
    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("F:\\java\\input33IO-2.rar");
                FileOutputStream fos = new FileOutputStream("F:\\java\\xxx\\kobe.rar")) {
            byte[] data = new byte[2048];
            int length = 0;
            while ((length = fis.read(data, 0, data.length)) != -1){
                fos.write(data,0,length);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 剪切就是，等你复制完了，把原来删除。

    }
}
