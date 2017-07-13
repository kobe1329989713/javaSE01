package com.javaSE04.io.io01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by kobe on 2017/7/11.20:47
 * <br/>
 * Description:
 * 文件的 copy
 */
public class FileCopy {
    public static void main(String[] args) {
                // 读
        try (FileInputStream fis = new FileInputStream("D:\\kobe\\tool\\Dowloades\\mysql\\MySQL Workbench 6.2.3 CE (winx64).zip");
                // 写
             FileOutputStream fos = new FileOutputStream("D:\\kobe\\tool\\Dowloades\\mysql\\write\\kobe.zip")
        ) {
            byte[] data = new byte[2048];
            int length = 0;
            // 读：一次读 2048 出来赋值给 length，不等于-1 代表它后面还有内容。继续就没有了。
            while ((length = fis.read(data, 0, data.length)) != -1) {
                // 写。输出到哪里去。
                fos.write(data,0,length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
