package com.study.design.pattern.behavior.fsm;

/**
 * @author wuwei
 * @title: State
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-30 20:46
 */
public enum State {
    SMALL(0, 0),
    SUPER(1, 100),
    FIRE(2, 300),
    CAPE(3, 200);
    private int value;
    private int score;

    State(int val, int score) {
        this.value = val;
        this.score = score;
    }

    public int getValue() {
        return this.value;
    }

    public int getScore() {
        return this.score;
    }
}
