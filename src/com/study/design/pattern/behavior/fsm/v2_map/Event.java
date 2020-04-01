package com.study.design.pattern.behavior.fsm.v2_map;

/**
 * @author wuwei
 * @title: Event
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 08:58
 */
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);
    private int value;

    Event(int val) {
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }
}
