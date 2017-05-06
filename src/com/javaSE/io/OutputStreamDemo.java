package com.javaSE.io;

import java.io.FileOutputStream;

/**
 * 把数据写到一个 文件里面去。
 */
public class OutputStreamDemo {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("f3.txt")) {
           fos.write("hello".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
