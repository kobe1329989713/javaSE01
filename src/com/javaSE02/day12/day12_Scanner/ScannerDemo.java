package com.javaSE02.day12.day12_Scanner;

/*
 * Scanner:用于接收键盘录入数据。
 *
 * 前面的时候：
 * 		A:导包
 * 		B:创建对象
 * 		C:调用方法
 *
 * System类下有一个静态的字段：
 * 		public static final InputStream in; 标准的输入流，对应着键盘录入。
 *
 * 		InputStream is = System.in;
 *
 * class Demo {
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * int y = Demo.x;
 * Student s = Demo.s;
 *
 *
 * 构造方法：
 * 		Scanner(InputStream source)  因为它的构造是这样所以，就必须要传一个流进去。
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// System 类在：java.lang 包下。
		// 因为要输入就必须要用到流，所以就要用到 System.in  因为它是 static 的一个属性，可以用类来点。
		// System.in 返回一个 InputStream 用的是 API 第三个构造方法。
		// 创建对象
		Scanner sc = new Scanner(System.in);
		// 然后你输入的是什么类型，Scanner 会帮你转换成什么类型的，用对应的方法接收就好，不是你在控制输入的全部都是 String类型的

        // 转成一个 int 类型的。
		int x = sc.nextInt();

		System.out.println("x:" + x);
	}
}
