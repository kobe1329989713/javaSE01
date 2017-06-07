package com.javaSE02.day12.day12_String.string01;

/*
 * 所有 java.lang 包下的东东，都是不用导包的。
 *
 *
 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
 * 通过查看API，我们可以知道
 * 		A:字符串字面值"abc"也可以看成是一个字符串对象。
 * 		B:字符串是常量，一旦被赋值，就不能被改变。
 *
 * 构造方法：
 * 		public String():空构造
 *		public String(byte[] bytes):把字节数组转成字符串
 *		public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
 *		public String(char[] value):把字符数组转成字符串
 *		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
 *		public String(String original):把字符串常量值转成字符串
 *	String(byte[] bytes, Charset charset) 把这个 bytes 数组转换成什么编码的、如：UTF-8
 *
 * 字符串的方法：
 * 		public int length()：返回此字符串的长度。
 *
 	 你直接打印一个对象，其本质是调用 toString() 方法，你可以重写 toString() 方法，然后你直接打印
 	 这个对象，就可以按照你的要求来，方便测试。因为不用调用方法。

 */
public class StringDemo {
    public static void main(String[] args) {
        // public String():空构造
        String s1 = new String();
        System.out.println("s1:" + s1);
        System.out.println("s1.length():" + s1.length());
        System.out.println("--------------------------");

        // public String(byte[] bytes):把字节数组转成字符串
        byte[] bys = { 97, 98, 99, 100, 101 }; // 因为 97 会转换成 a ，所以只有5
        String s2 = new String(bys);
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());
        System.out.println("--------------------------");

        // public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
        // 我想得到字符串"bcd"
        String s3 = new String(bys, 1, 3);
        System.out.println("s3:" + s3);
        System.out.println("s3.length():" + s3.length());
        System.out.println("--------------------------");

        // public String(char[] value):把字符数组转成字符串
        char[] chs = { 'a', 'b', 'c', 'd', 'e', '爱', '林', '亲' };
        String s4 = new String(chs);
        System.out.println("s4:" + s4);
        System.out.println("s4.length():" + s4.length());
        System.out.println("--------------------------");

        // public String(char[] value,int index,int count):把字符数组的一部分转成字符串
        String s5 = new String(chs, 2, 4);
        System.out.println("s5:" + s5);
        System.out.println("s5.length():" + s5.length());
        System.out.println("--------------------------");

        //public String(String original):把字符串常量值转成字符串
        String s6 = new String("abcde");
        System.out.println("s6:" + s6);
        System.out.println("s6.length():" + s6.length());
        System.out.println("--------------------------");

        //字符串字面值"abc"也可以看成是一个字符串对象。
        String s7 = "abcde";
        System.out.println("s7:"+s7);
        System.out.println("s7.length():"+s7.length());
    }
}
