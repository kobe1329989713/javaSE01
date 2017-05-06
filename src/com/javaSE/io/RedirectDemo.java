package com.javaSE.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 把输出 内容，生定向到 某个文件去。
 */
public class RedirectDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("out.txt");
        PrintStream p = new PrintStream(f);
        // 对 out 重定向
        System.setOut(p);
        // 对 In 重定向。
        //System.setIn();
        // 这样，这个 hello 就会输出到 out.txt 文件里面去了。
        System.out.println("hello");
        // out In Err 都是可以重定向的
    }
}
