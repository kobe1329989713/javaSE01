package com.javaSE04.Exception.rmi_04.model;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/21 0021
 * <br/> time：14:21
 * <br/> now：星期三
 * <br/> description：<br/>
 */
public class PersonEntity implements java.io.Serializable {

	private static final long serialVersionUID = -5752041974933595781L;

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
