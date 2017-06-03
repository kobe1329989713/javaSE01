package com.javaSE03.day_27_reflect.pattern.itcast_02;

public abstract class PhoneDecorate implements Phone {

	private Phone p;

	public PhoneDecorate(Phone p) {
		this.p = p;
	}

	@Override
	public void call() {
		this.p.call();
	}
}
