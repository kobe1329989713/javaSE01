package com.patterns.patterns01.exercise02.factory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 18:05 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
class SendException extends Exception {
    private static final long serialVersionUID = 4609205354611848362L;

    SendException(String s) {
        super(s);
    }
}
