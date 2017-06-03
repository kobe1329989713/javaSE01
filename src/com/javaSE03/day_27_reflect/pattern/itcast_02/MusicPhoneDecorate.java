package com.javaSE03.day_27_reflect.pattern.itcast_02;

public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		super.call();
		System.out.println("手机可以听音乐");
	}
}
