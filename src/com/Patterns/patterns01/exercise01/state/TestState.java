package com.Patterns.patterns01.exercise01.state;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:47 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
@SuppressWarnings("Duplicates")
public class TestState {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        // 设置第一种状态。
        state.setValue("state1");
        context.method();


        // 设置第二种状态。
        state.setValue("state2");
        context.method();
    }
}
