package com.concurrence.concurrence01.multi_001.sync007;

/**
 *  valatile 关键字 使用。
 */
public class RunThread extends Thread{

	private volatile boolean isRunning = true;  // 如果你不加 volatile 线程就不会停止。
	private void setRunning(boolean isRunning){
		this.isRunning = isRunning;
	}

	@Override
	public void run(){
		System.out.println("进入run方法..");
		int i = 0;
		while(isRunning == true){
			//..
		}
		System.out.println("线程停止");
	}
	
	public static void main(String[] args) throws InterruptedException {
		RunThread rt = new RunThread();
		rt.start();
		Thread.sleep(1000);
		rt.setRunning(false);
		System.out.println("isRunning的值已经被设置了false");
		Thread.sleep(1000);
        System.out.println(rt.isRunning);
    }
	
	
}
