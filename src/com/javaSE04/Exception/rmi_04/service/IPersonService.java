package com.javaSE04.Exception.rmi_04.service;

import com.javaSE04.Exception.rmi_04.model.PersonEntity;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/21 0021
 * <br/> time：14:25
 * <br/> now：星期三
 * <br/> description：<br/>
 */

// 此为远程对象调用的接口，必须继承Remote类
public interface IPersonService extends Remote {
	/**
	 * 调用远程方法，
	 * @return result
	 * @throws RemoteException，比
	 */
	public List<PersonEntity> getList() throws RemoteException;
}
