package com.javaSE04.io.io01.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by kobe on 2017/7/11.22:10
 * <br/>
 * Description:
 * 反序列化，
 */
public class DeserialDemo {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        // 开始把序列。
        User user = (User) ois.readObject();
        System.out.println(user.getAge());
        System.out.println(user.getName());
        // 创建对象，反射，么序列化，new，
    }
}
