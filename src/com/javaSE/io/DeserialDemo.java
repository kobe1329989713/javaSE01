package com.javaSE.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 把序列化，通过它把 哪个 把 User序列化里面文件里面去了，通过它 把它反序列化出来。
 */
public class DeserialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User user = (User) ois.readObject();
        System.out.println(user.getAge()+"，" + user.getName());
    }
}
