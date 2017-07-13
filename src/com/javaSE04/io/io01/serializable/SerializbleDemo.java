package com.javaSE04.io.io01.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by kobe on 2017/7/11.22:05
 * <br/>
 * Description:
 */
public class SerializbleDemo {
    public static void main(String[] args) throws Exception {
        // 要序列化哪个类。
        User user = new User();
        user.setAge(24);
        user.setName("kobe");

        // 准备序列化。
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        // 它就把 在内存中的 User 这个类，保存在了 user.ser 这个文件里面去了。
        oos.writeObject(user); // 也是你看开肯定是看不懂的，因为必须要把它反序列化出来，你才能看的懂。
        oos.close();
    }
}
