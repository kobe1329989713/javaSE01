package com.concurrence.concurrence01.base.conn011;

/**
 * 多线程时，要用的单列模式。
 */
public class InnerSingleton {
	
	private static class Singletion {
		private static Singletion single = new Singletion();
	}
	
	public static Singletion getInstance(){
		return Singletion.single;
	}

	// 如果要序列化时，还可以加。
}
