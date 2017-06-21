package com.javaSE04.Exception.rmi_04;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/21 0021
 * <br/> time：14:57
 * <br/> now：星期三
 * <br/> description：<br/>
 */

import com.javaSE04.Exception.rmi_04.model.PersonEntity;
import com.javaSE04.Exception.rmi_04.service.IPersonService;

import java.rmi.Naming;
import java.util.List;

public class TestRMI {

	public static void main(String[] args) {
		try {

			//调用远程对象，注意RMI路径与接口必须与服务器配置一致
			IPersonService personService = (IPersonService) Naming.lookup("rmi://192.168.0.194:6600/PersonService");
			List<PersonEntity> personList = personService.getList();
			for (PersonEntity person : personList) {
				System.out.println("ID:" + person.getId() + " Age:" + person.getAge() + " Name:" + person.getName());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
