package com.javaSE03.day_27_reflect.pattern.itcast_01;

public class GetTimeDemo {
	public static void main(String[] args) {
		// GetTime gt = new GetTime();
		// System.out.println(gt.getTime() + "����");

		GetTime gt = new ForDemo();
		System.out.println(gt.getTime() + "����");

		gt = new IODemo();
		System.out.println(gt.getTime() + "����");
	}
}
