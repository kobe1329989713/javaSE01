package com.javaSE.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 读出一个 文本内容。
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        // 数据源。
        //FileInputStream fis = new FileInputStream("f1.txt");
        //int data = fis.read();
        //byte byteData;
        //while (data != -1){
        //    byteData = (byte) data;
        //    System.out.println((char)byteData);
        //    data = fis.read();
        //}
        //fis.close();




        // try 新用法。不需显示的来关闭流了。
        //try(FileInputStream fis = new FileInputStream("f1.txt")){
        //    int data = fis.read();
        //    byte byteData;
        //    while (data != -1){
        //        byteData = (byte) data;
        //        System.out.println((char)byteData);
        //        data = fis.read();
        //    }
        //}catch(Exception e){
        //    e.printStackTrace();
        //}

        // 222
        try(FileInputStream fis = new FileInputStream("f1.txt")){
            byte byteData;
            while ((byteData = (byte)fis.read()) != -1){
                System.out.println((char)byteData);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

















    }
}
