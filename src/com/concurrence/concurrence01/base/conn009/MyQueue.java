package com.concurrence.concurrence01.base.conn009;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * 模拟Queue
 * @author alienware
 *	队列。
 * ArrayBlockingQueue 有界的队列。有上界队列。
 *
 *
 * put() 阻塞方法，如果队列(容器) 里面已经有一个元素了。t1 这个线程。还想
往队列里面添加元素时，就只能阻塞着，只有当队列里面消耗了，一个
元素后，才能往里面添加元素。
take()  当队列里面里面是空的时，take(拿)你还想往 队列里面取出一个元素。
时就会阻塞着，因为队列里面是空的了。只有当 put() 进去一个元素时
take() 方法就可以执行了。因为队列里面有元素了。
这就是：阻塞队列形式。
 */
public class MyQueue {
	// 容器。
	private final LinkedList<Object> list = new LinkedList<Object>();
	// 计数器，
	private final AtomicInteger count = new AtomicInteger(0);
	// 指定 上界 和 下限。
	private final int maxSize;
	private final int minSize = 0;
	
	private final Object lock = new Object();
	
	public MyQueue (int maxSize){
		this.maxSize = maxSize;
	}

	public void put (Object obj) {
		synchronized(lock){
			while(count.get() == maxSize){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			list.add(obj);
			count.getAndIncrement(); // ++ 操作样。
			System.out.println(" 元素 " + obj + " 被添加 ");
			lock.notify();
			
		}
	}
	
	public Object take(){
		Object temp = null;
		synchronized (lock) {
			while(count.get() == minSize){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			count.getAndDecrement();
			temp = list.removeFirst();
			System.out.println(" 元素 " + temp + " 被消费 ");
			lock.notify();
		}
		return temp;
	}
	
	public int size(){
		return count.get();
	}
	
	
	public static void main(String[] args) throws Exception {
		
		final MyQueue m = new MyQueue(5);
		m.put("a");
		m.put("b");
		m.put("c");
		m.put("d");
		m.put("e");
		System.out.println("当前元素个数：" + m.size());
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				m.put("h");
				m.put("i");
			}
		}, "t1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					Object t1 = m.take();
					//System.out.println("被取走的元素为：" + t1);
					Thread.sleep(1000);
					Object t2 = m.take();
					//System.out.println("被取走的元素为：" + t2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "t2");

		t1.start();
		Thread.sleep(1000);
		t2.start();
		
	}
	
	
	
}
