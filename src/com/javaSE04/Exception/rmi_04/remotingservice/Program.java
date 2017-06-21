package com.javaSE04.Exception.rmi_04.remotingservice;

import com.javaSE04.Exception.rmi_04.service.IPersonService;
import com.javaSE04.Exception.rmi_04.service.PersonServiceImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/21 0021
 * <br/> time：14:54
 * <br/> now：星期三
 * <br/> description：<br/>
 */
public class Program {
	public static void main(String[] args) {
		try {
			IPersonService service = new PersonServiceImpl();

			//注册通讯端口
			LocateRegistry.createRegistry(6600);

			//注册通讯路径
			Naming.rebind("rmi://192.168.0.194:6600/PersonService", service);

			System.out.println("Service Start!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
