package com.bjsxt.base.sync007;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * volatile关键字不具备synchronized关键字的原子性（同步）
 * @author alienware
 *
 */
public class VolatileNoAtomic extends Thread{
//	private static volatile int count;  // 不具备 原子性，它只是 多线程 之间具备可见性。
	private static AtomicInteger count = new AtomicInteger(0); // 它具备 原子性
	private static void addCount(){
		for (int i = 0; i < 1000; i++) {
//			count++ ;
			count.incrementAndGet(); // 相当 ++ 操作样。
		}
		System.out.println(count);
	}
	
	public void run(){
		addCount();
	}
	
	public static void main(String[] args) {
		
		VolatileNoAtomic[] arr = new VolatileNoAtomic[100];
		for (int i = 0; i < 10; i++) {
			arr[i] = new VolatileNoAtomic();
		}
		
		for (int i = 0; i < 10; i++) {
			arr[i].start();
		}
	}
	
	
	
	
}
