package com.Patterns.patterns07.prototype;

/**
 * <br/> User: liukun c
 * <br/> Date: 2017/07/21/ 19:04
 * <br/>：
 * prototype 将一个对象作为原型，然后对其进行复制、克隆，产生一个和原对象类似的新对象
 */
public class Prototype implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
	/**
	 *
	 */

}
