package com.patterns.patterns01.exercise01.chainOfResponsibility;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:58 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
@SuppressWarnings("Duplicates")
public class TestChain {
    public static void main(String[] args) {
        // 创建三个 命令
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");


        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
