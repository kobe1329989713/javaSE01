package com.javaSE03.day_27_reflect.pattern.itcast_01;

public class GetTimeDemo {
	public static void main(String[] args) {
		// ����һ����ͨ�Ĳ��ԡ�
		// GetTime gt = new GetTime();
		// System.out.println(gt.getTime() + "����");

		// ģ��ģʽ�Ĳ��ԡ�
		GetTime gt = new ForDemo();
		System.out.println(gt.getTime() + "����");

		// ģ��ģʽ�Ĳ��ԡ�֮����IO������ʱ�䡣
		gt = new IODemo();
		System.out.println(gt.getTime() + "����");
	}
}
