package com.patterns.patterns01.exercise01.memento;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:34 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  备忘录模式，就是把第一次 赋值的 值，存储到另一个 类中。
 *  恢复时在从哪个类里面 拿出来。
 *
 * <BR>
 */
@SuppressWarnings("Duplicates")
public class TestMemento {
    public static void main(String[] args) {
        // 创建原始类。
        Original original = new Original("egg");

        // 创建备忘录
        Storage storage = new Storage(original.createMemento());

        // 修改原始类的状态。
        System.out.println("初始化状态为：" + original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为：" + original.getValue());

        // 回复原始类的状态。
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getValue());
    }
}
