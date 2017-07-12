package com.javaSE04.io.io01.serializable;

import java.io.Serializable;

/**
 * Created by kobe on 2017/7/11.22:04
 * <br/>
 * Description:
 * 序列化。rmi 也是必须要序列化的，才能调用。
 *
 * 处理文件时 老是用 XxxInputStream  XxxOutputStream
 * 但是在处理文本文件时，要write ReaDer 来处理，汉字多的就要用它
 *
 */
public class User implements Serializable {

    private static final long serialVersionUID = -888671906844353645L;

    private int age;
//    private String name;

    /**
     * transient 它修饰了，代表这个属性不进行序列化
     * 静态属性，也不会进行序列化的。
     *
     *  如果出现 InvalidClassException 异常时，这就是你把一个类给 序列化了，然后你又去修改了这个类，
     *  所以哪边在把序列化时，就会出现这个异常。生成 serialVersionUID 这个id 就不会出现 这个异常了。
     *  有了这个ID 它就能保证序列化与反序列化时版本一致的问题了。
     */
    private transient String name;

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
