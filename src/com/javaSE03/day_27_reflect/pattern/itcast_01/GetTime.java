package com.javaSE03.day_27_reflect.pattern.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//模板模式
public abstract class GetTime {
	// 需求：请给我计算出一段代码的运行时间
	public long getTime() {
		long start = System.currentTimeMillis();
		// for循环
		// for (int x = 0; x < 10000; x++) {
		// System.out.println(x);
		// }

		// 视频
		// try {
		// BufferedInputStream bis = new BufferedInputStream(
		// new FileInputStream("a.avi"));
		// BufferedOutputStream bos = new BufferedOutputStream(
		// new FileOutputStream("b.avi"));
		// byte[] bys = new byte[1024];
		// int len = 0;
		// while ((len = bis.read(bys)) != -1) {
		// bos.write(bys, 0, len);
		// }
		// bos.close();
		// bis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// 再给我测试一个代码：集合操作的，多线程操作，常用API操作的等等...
		code(); // 把哪个需要测试 时间的代码，让子类自己去重写，这就是模板模式。？？？
		// 因为它调用下面哪个抽象方法，
		
		long end = System.currentTimeMillis();

		return end - start;
	}
	
	// 而这个方法会被子类重写的，所以就可以测试任意代码的执行时间了，？？？,它就像 拼接起来样，只不过中间哪一陀是变化的。
	public abstract void code();
}
