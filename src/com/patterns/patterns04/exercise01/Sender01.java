package com.patterns.patterns04.exercise01;

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
interface provider{
	// 注：这里依赖的是 产品体系的抽象(父类与接口)
	public Sender01 SmsSender();
}

// static factory
class ProviderImpl implements provider{

	@Override
	public Sender01 SmsSender() {
		return new mainSender01();
	}
}


class ProviderImpl2 implements provider{

	@Override
	public Sender01 SmsSender() {
		return new SmsSender02();
	}
}



// test
class Test01 {
	public static void main(String[] args) {

	    // static factory Test
        // 多态的工厂
        provider provider = new ProviderImpl();
        // 多态的产品。左边是抽象，右边具体。
        Sender01 is1 = provider.SmsSender();
        is1.send();

        // 2
        provider provider2 = new ProviderImpl2();
        Sender01 is2 = provider2.SmsSender();
        is2.send();


// 增加一个产品就要，增加一个工厂。


		// 1、用的是factory，因为factory生产东东，用。
//		SendFactory factory = new SendFactory();
//		Sender01 is1 = factory.produce("mainSender01");
//		is1.send();
//
//		// 22
//		Sender01 is2 = factory.produce("SmsSender02");
//		is2.send();
//
//		System.out.println("===--// Test 静态工厂方法模式，多个工厂方法模式，就是不static 就好。--==");
//		Sender01 is3 = SendFactory.product01();
//		is3.send();
//		Sender01 is4 = SendFactory.product02();
//		is4.send();

	}
}