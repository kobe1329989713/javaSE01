package com.javaSE04.io.io01.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by kobe on 2017/7/11.22:16
 * <br/>
 * Description:
 * 序列化 另一种。
 */
public class Person implements Externalizable {
    private int age;
    private String name;

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
    /**
     * Externalizable
     *   它是 不会把全部的属性全部进行序列化的。它会执行下面的两个方法的。
     *
     *
     */

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
//        out.writeUTF(name); // 只有在这里添加了，它才进行序列化的。
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.readInt();
        name = in.readUTF(); // 只有在这里添加了，它才能反序列化出来。
    }

    // 可以控制哪些属性可以序列化，哪些属性可以说反序列化。
}
