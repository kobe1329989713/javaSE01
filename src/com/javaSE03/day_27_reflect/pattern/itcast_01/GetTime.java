package com.javaSE03.day_27_reflect.pattern.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ģ��ģʽ
public abstract class GetTime {
	// ��������Ҽ����һ�δ��������ʱ��
	public long getTime() {
		long start = System.currentTimeMillis();
		// forѭ��
		// for (int x = 0; x < 10000; x++) {
		// System.out.println(x);
		// }

		// ��Ƶ
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

		// �ٸ��Ҳ���һ�����룺���ϲ����ģ����̲߳���������API�����ĵȵ�...
		code(); // ���ĸ���Ҫ���� ʱ��Ĵ��룬�������Լ�ȥ��д�������ģ��ģʽ��������
		// ��Ϊ�����������ĸ����󷽷���
		
		long end = System.currentTimeMillis();

		return end - start;
	}
	
	// ����������ᱻ������д�ģ����ԾͿ��Բ�����������ִ��ʱ���ˣ�������,������ ƴ����������ֻ�����м���һ���Ǳ仯�ġ�
	public abstract void code();
}
