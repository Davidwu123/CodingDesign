package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: MarioStateMachine
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-31 13:40
 */
public class MarioStateMachine {
    private IState mBaseMarioState;
    private int mScore;

    public MarioStateMachine() {
        this.mBaseMarioState = SmallState.getInstance();
        this.mScore = 0;
    }

    public void obtainMushRoom() {
        Log.d(this.getClass().getSimpleName(), "obtainMushRoom");
        mBaseMarioState.obtainMushRoom(this);
    }

    public void obtainCape() {
        Log.d(this.getClass().getSimpleName(), "obtainCape");
        mBaseMarioState.obtainCape(this);
    }

    public void obtainFireFlower() {
        Log.d(this.getClass().getSimpleName(), "obtainFireFlower");
        mBaseMarioState.obtainFireFlower(this);
    }

    public void meetMonster() {
        Log.d(this.getClass().getSimpleName(), "meetMonster");
        mBaseMarioState.meetMonster(this);
    }

    public State getState() {
        return this.mBaseMarioState.getState();
    }

    public void setState(BaseMarioState state) {
        this.mBaseMarioState = state;
    }

    public void setScore(int score) {
        this.mScore = score;
    }

    public int getScore() {
        return this.mScore;
    }
}
