package com.javaSE.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 把 User 类 进行序列化，它可以 持久化。
 */
public class SerialDemo {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setAge(24);
        user.setName("Kobe");

        // 把 User 类 序列化到 硬盘的某个文件里面去。
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();

        // 把 User 这个 序列化到 user.ser 这个文件去了，然后在通过 哪个类在读取出来。反序列化。因为这个文件它就可以 持久化
    }
}
