package com.study.design.pattern.behavior.fsm;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MarioStateMachine
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-30 20:49
 */
public class MarioStateMachine {
    private int mScore;
    private State mState;

    public MarioStateMachine() {
        this.mState = State.SMALL;
        this.mScore = 0;
    }

    public void obtainMushRoom() {
        Log.d(this.getClass().getSimpleName(), "obtainMushRoom");
        transferState(State.SUPER);
        addScore(State.SUPER.getScore());
    }

    public void obtainCape() {
        Log.d(this.getClass().getSimpleName(), "obtainCape");
        transferState(State.CAPE);
        addScore(State.CAPE.getScore());
    }

    public void obtainFireFlower() {
        Log.d(this.getClass().getSimpleName(), "obtainFireFlower");
        transferState(State.FIRE);
        addScore(State.FIRE.getScore());
    }

    public void meetMonster() {
        Log.d(this.getClass().getSimpleName(), "meetMonster");
        addScore(-mState.getScore());
        transferState(State.SMALL);
    }

    public State getState() {
        return this.mState;
    }

    public int getScore() {
        return this.mScore;
    }

    private void transferState(State state) {
        Log.d(this.getClass().getSimpleName(), "transfer state: " + mState + " to: " + state);
        this.mState = state;
    }

    private void addScore(int delta) {
        Log.d(this.getClass().getSimpleName(), "add score: " + delta);
        this.mScore = mScore + delta;
    }
}
