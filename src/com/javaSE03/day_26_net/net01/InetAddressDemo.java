package com.javaSE03.day_26_net.net01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 如果一个类没有构造方法：
 * A:成员全部是静态的(Math,Arrays,Collections)
 * B:单例设计模式(Runtime)
 * C:类中有静态方法返回该类的对象(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * 
 * 看InetAddress的成员方法： 根据 你的计算的名字或者是 ip地址获取 InetAddress 对象。有了这个对象你就可以 获取主机名，IP地址 了，
 * public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到IP地址对象
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// public static InetAddress getByName(String host)
//		 InetAddress address = InetAddress.getByName("lu-PC");
//		 InetAddress address = InetAddress.getByName("192.168.12.92");
//		System.out.println(address);

		// 你拿别人的IP地址试试。
		InetAddress address = InetAddress.getByName("192.168.199.140");
		// 获取两个东西：主机名，IP地址
//		 public String getHostName()
		String name = address.getHostName();
		// public String getHostAddress()
		String ip = address.getHostAddress();
		System.out.println(name + "---" + ip);
	}
}