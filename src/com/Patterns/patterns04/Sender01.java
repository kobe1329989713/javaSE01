package com.Patterns.patterns04;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/14 0014
 * <br/> time：19:01
 * <br/> now：星期三
 * <br/> description：
 * <p>
 * 简单factory
 * 1、先确定体系。
 * 2、factory
 * 3、test、看。
 * <p>
 * 加 自定义Error、静态。
 */
public interface Sender01 {
	void send();
}

// 实现类1。
class mainSender01 implements Sender01 {

	@Override
	public void send() {
		System.out.println("实现类一、发关。");
	}
}

// 实现类2
class SmsSender02 implements Sender01 {

	@Override
	public void send() {
		System.out.println("222222_实现类二、发关。");
	}
}

// factory
class SendFactory {
	public Sender01 produce(String type) {
		if ("mainSender01".equals(type)) {
			return new mainSender01();
		} else if ("SmsSender02".equals(type)) {
			return new SmsSender02();
		} else {
			System.out.println("error");
			return null;
		}
	}

	// 静态工厂方法模式，多个工厂方法模式，就是不static 就好。
	public static Sender01 product01(){
		return new mainSender01();
	}
	public static Sender01 product02(){
		return new SmsSender02();
	}
}

// static factory Interface

// static factory



// test
class Test01 {
	public static void main(String[] args) {
		// 1、用的是factory，因为factory生产东东，用。
		SendFactory factory = new SendFactory();
		Sender01 is1 = factory.produce("mainSender01");
		is1.send();

		// 22
		Sender01 is2 = factory.produce("SmsSender02");
		is2.send();

		System.out.println("===--// Test 静态工厂方法模式，多个工厂方法模式，就是不static 就好。--==");
		Sender01 is3 = SendFactory.product01();
		is3.send();
		Sender01 is4 = SendFactory.product02();
		is4.send();

	}
}