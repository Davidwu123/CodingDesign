package com.study.design.pattern.behavior.fsm.v1_simple;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.fsm.State;

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
        if (mState.equals(State.SMALL)) {
            Log.d(this.getClass().getSimpleName(), "obtainMushRoom");
            transferState(State.SUPER);
            addScore(State.SUPER.getScore());
        }
    }

    public void obtainCape() {
        if (mState.equals(State.SMALL) || mState.equals(State.SUPER)) {
            Log.d(this.getClass().getSimpleName(), "obtainCape");
            transferState(State.CAPE);
            addScore(State.CAPE.getScore());
        }
    }

    public void obtainFireFlower() {
        if (mState.equals(State.SMALL) || mState.equals(State.SUPER) ) {
            Log.d(this.getClass().getSimpleName(), "obtainFireFlower");
            transferState(State.FIRE);
            addScore(State.FIRE.getScore());
        }
    }

    public void meetMonster() {
        Log.d(this.getClass().getSimpleName(), "meetMonster");
        //如果是一个具体的业务逻辑，则通过动态的方式不易实现，且if/else或者switch不可省
        /**
         * 当然可以通过策略模式来专门处理该函数里面的东西，但是如果变化的不只是这一个函数，
         * 所有的函数都需要各自自定义实现不同的逻辑，那么每个函数都需要进行策略模式的调用
         */
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
