package com.javaSE04.Exception.generice02;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 1:31
 * <br/>
 * 没有泛型的 坏处。
 */
class Wrapper {
    private Object data;

    public Wrapper() {}
    public Wrapper(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}


public class NoGenericeDemo01 {
    public static void main(String[] args) {
        // Object 你在放数据时，好放，你在取数据可能就会报错。

        // 也放在各种类型。
        Wrapper w1 = new Wrapper("One");
        Wrapper w2 = new Wrapper(new Integer(100));
        Wrapper w3 = new Wrapper(100);

        // 取数据
        Object d1 = (String)w1.getData();
        Object d2 = (Integer)w1.getData();
        // 在运行时可能会出错哦。
    }
    // 在看
}
