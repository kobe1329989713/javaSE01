package com.javaSE.io;

import java.io.Serializable;

/**
 * 序列化：
 */
public class User implements Serializable {

    private static final long serialVersionUID = 6545972163212733393L;


    private int age;

    // transient 加了它的，就是这个属性不进行 序列化。
    private transient String name;

    private int num;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
