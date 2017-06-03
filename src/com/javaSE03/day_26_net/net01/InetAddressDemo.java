package com.javaSE03.day_26_net.net01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ���һ����û�й��췽����
 * A:��Աȫ���Ǿ�̬��(Math,Arrays,Collections)
 * B:�������ģʽ(Runtime)
 * C:�����о�̬�������ظ���Ķ���(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * 
 * ��InetAddress�ĳ�Ա������ ���� ��ļ�������ֻ����� ip��ַ��ȡ InetAddress �����������������Ϳ��� ��ȡ��������IP��ַ �ˣ�
 * public static InetAddress getByName(String host):��������������IP��ַ���ַ�����ʾ�õ�IP��ַ����
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// public static InetAddress getByName(String host)
//		 InetAddress address = InetAddress.getByName("lu-PC");
//		 InetAddress address = InetAddress.getByName("192.168.12.92");
//		System.out.println(address);

		// ���ñ��˵�IP��ַ���ԡ�
		InetAddress address = InetAddress.getByName("192.168.199.140");
		// ��ȡ������������������IP��ַ
//		 public String getHostName()
		String name = address.getHostName();
		// public String getHostAddress()
		String ip = address.getHostAddress();
		System.out.println(name + "---" + ip);
	}
}