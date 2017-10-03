package com.Patterns.patterns01.exercise01.compositionAggregation.composition;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/23/ 17:47 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>合成（composition）关系<BR>
 */
public class Room {
    public Room createRoom() {
        System.out.println("创建房间");
        return new Room();
    }
}
