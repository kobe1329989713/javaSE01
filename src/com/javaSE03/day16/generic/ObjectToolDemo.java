package com.javaSE03.day16.generic;

public class ObjectToolDemo {
	public static void main(String[] args) {
		// ObjectTool ot = new ObjectTool();
		// ot.show("hello");
		// ot.show(100);
		// ot.show(true);

		// ObjectTool<String> ot = new ObjectTool<String>();
		// ot.show("hello");
		//
		// ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		// ot2.show(100);
		//
		// ObjectTool<Boolean> ot3 = new ObjectTool<Boolean>();
		// ot3.show(true);

		// ��������ö����Ǿ�˵����������û�������
		// �����أ�˭˵���ҵķ���һ��Ҫ��������͵�һ����?
		// ��Ҫ������û�з��͵Ļ����������ܲ��ܽ����������͵Ĳ�������?

		
		
		
		
		// ���巺�ͷ����󣬵��� ���ͷ���
		ObjectTool ot = new ObjectTool();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
	}
	
	// ���ͷ���
//	public class ObjectTool {
//		public <T> void show(T t) {
//			System.out.println(t);
//		}
//	}
	
}
