package com.javaSE04.io.io01;

import java.io.FileOutputStream;

/**
 * Created by kobe on 2017/7/11.20:42
 * <br/>
 * Description:
 * outputStream 类，输出到哪里去。
 */
public class OutputStreameDemo {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("f3.txt")) {
            fos.write("hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
