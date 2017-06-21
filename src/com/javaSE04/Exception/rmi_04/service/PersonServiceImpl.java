package com.javaSE04.Exception.rmi_04.service;

import com.javaSE04.Exception.rmi_04.model.PersonEntity;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/21 0021
 * <br/> time：14:28
 * <br/> now：星期三
 * <br/> description：<br/>
 */
public class PersonServiceImpl extends UnicastRemoteObject implements IPersonService {
	public PersonServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public List<PersonEntity> getList() throws RemoteException {
		System.out.println("get Person start");
		List<PersonEntity> ps = new LinkedList<>();
		PersonEntity p = new PersonEntity();
		p.setId(1);
		p.setAge(22);
		p.setName("kobe");
		ps.add(p);
		PersonEntity p2 = new PersonEntity();
		p2.setId(2);
		p2.setAge(24);
		p2.setName("mar中");
		ps.add(p2);
		return ps;
	}
}
