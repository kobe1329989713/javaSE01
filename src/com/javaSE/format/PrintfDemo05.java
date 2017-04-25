package com.javaSE.format;

/**
 *
 */
public class PrintfDemo05 {
    public static void main(String[] args) {
        // 这也是一种格式化 字符串 的方式。后面 和 前面 必须一一对应。可以多，不能少。
        //System.out.printf("%s,%s,%s","kobe","曲折","LOVE");


        System.out.println("------------------------------");

        // 和上面哪个差不多，只不过加了一个 索引。
        //System.out.printf("%1$s,%3$s,%3$s\n","kobe","曲折","LOVE");

        // 它会在前端 补3位，长度搞 四，它还有 - （  这些东东。
        System.out.printf("%4s","a");
        System.out.println("\n");

        // 还有很多 关于 printf() 这个输入的，方式。百度。在看 格式 13。看 帮助文档。
    }
}
