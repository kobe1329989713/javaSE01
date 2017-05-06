package com.javaSE.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 序列化 之 你实现的是  Externalizable 这个接口
 * 它是你在序列化时，会调用 下面这两个方法。
 * 它是 有些序列化，有些不序列化。
 *
 */
public class Person implements Externalizable{

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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // 它是 你在这里面写什么属性，它就序列化什么
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // 它读取时，也是只读取 你在这里面添加的。才读取出来。
        age = in.readInt();
    }
    // 通过这两个方法 可以控制 哪些属性可以 序列化，哪些属性可以读取出来。

}
