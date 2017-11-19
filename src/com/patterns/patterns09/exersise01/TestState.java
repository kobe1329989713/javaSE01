package com.patterns.patterns09.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 18:24 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestState {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        // 2
        state.setValue("state2");
        context.method();
    }
}
