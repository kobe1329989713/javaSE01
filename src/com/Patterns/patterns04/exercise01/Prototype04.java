package com.Patterns.patterns04.exercise01;

import java.io.*;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：12:22
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 * 原型模式：
 *      就是对一个对象进行复制、克隆，产生一个和原对象类似的新对象。
 */
public class Prototype04 implements Cloneable {
    // 克隆
    public Object clone() throws CloneNotSupportedException {
        Prototype04 proto = (Prototype04) super.clone();
        return proto;
    }
}

// 复制
class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /* 深复制 */
    public Object deepClone() throws IOException, ClassNotFoundException {

            /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

            /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}