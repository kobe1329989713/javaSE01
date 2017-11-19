package com.patterns.patterns01.exercise01.memento;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:31 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
