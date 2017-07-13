package com.javaSE04.io.io01;

import java.io.FileInputStream;

/**
 * Created by kobe on 2017/7/9.15:55
 * <br/>
 * Description:
 * io，读取一个 file
 */
public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("f2.txt");
//        // 开始读。
//        int data = fis.read();
//        byte byteDate;
//        while (data != -1) {
//            byteDate = (byte) data;
//            System.out.println((char) byteDate);
//            data = fis.read();
//        }
//        fis.close();



       // 改进版本。
        try (FileInputStream fis = new FileInputStream("f2.txt")) {
            byte byteDate;
            while ((byteDate = (byte) fis.read()) != -1) {
                System.out.println((char) byteDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }





    }



}
