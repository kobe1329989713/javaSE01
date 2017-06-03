package com.javaSE03.day_27_reflect.pattern.itcast_01;

public class GetTimeDemo {
	public static void main(String[] args) {
		// 这是一个普通的测试。
		// GetTime gt = new GetTime();
		// System.out.println(gt.getTime() + "毫秒");

		// 模板模式的测试。
		GetTime gt = new ForDemo();
		System.out.println(gt.getTime() + "毫秒");

		// 模板模式的测试。之测试IO操作的时间。
		gt = new IODemo();
		System.out.println(gt.getTime() + "毫秒");
	}
}
