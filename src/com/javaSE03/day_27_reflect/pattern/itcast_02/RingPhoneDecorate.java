package com.javaSE03.day_27_reflect.pattern.itcast_02;

public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		System.out.println("�ֻ�����������");
		super.call();
	}
}
