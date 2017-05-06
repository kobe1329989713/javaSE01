package com.javaSE.io;

import java.io.IOException;

/**
 * 标准输入设备：如，键盘。
 * 标准输出设备：如，显示器
 */
public class SystemErrDemo {
    public static void main(String[] args) throws Exception {
        // 用于输出一些错误的信息。和 out 差不多
        System.err.println("Error");
        // 如果是：System.in 它是从键盘获取数据。


        int num = -1;
        // 等于 回车时，就把你输入的 打印出来。
        while ((num = System.in.read()) != '\n'){
            System.out.print((char) num);
        }



    }
}
