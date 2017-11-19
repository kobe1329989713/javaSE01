package com.patterns.patterns01.exercise01.compositionAggregation.composition;

/**
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>合成（composition）关系<BR>
 */
public class House {
    private Room room;

    public House() {
        room = new Room();
    }

    public void createHouse() {
        room.createRoom();
    }
}
