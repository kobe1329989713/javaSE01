package com.patterns.patterns08.memento;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 17:52 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
@SuppressWarnings("Duplicates")
public class TestMemento {
    public static void main(String[] args) {
        Original origi = new Original("egg");

        Storage storage = new Storage(origi.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }
}
