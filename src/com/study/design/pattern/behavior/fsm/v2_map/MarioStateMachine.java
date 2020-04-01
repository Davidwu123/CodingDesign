package com.study.design.pattern.behavior.fsm.v2_map;

import com.study.design.pattern.behavior.fsm.State;

import static com.study.design.pattern.behavior.fsm.State.*;

/**
 * @author wuwei
 * @title: MarioStateMachine
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 09:08
 */
public class MarioStateMachine {
    private State mState;
    private int mScore;
    private static final State[][] mStateTable = new State[][] {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] mScoreTable = new int[][] {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachine() {
        mState = State.SMALL;
        mScore = 0;
    }

    /**
     * 吃到蘑菇
     */
    public void obtainMushRoom() {
        executeAction(Event.GOT_MUSHROOM);
    }

    /**
     * 吃到斗篷
     */
    public void obtainCape() {
        executeAction(Event.GOT_CAPE);
    }

    /**
     * 吃到火花
     */
    public void obtainFireFlower() {
        executeAction(Event.GOT_FIRE);
    }

    /**
     * 遇到怪物
     */
    public void meetMonster() {
        executeAction(Event.MET_MONSTER);
    }

    private void executeAction(Event event) {
        mScore += mScoreTable[mState.getValue()][event.getValue()];
        mState = mStateTable[mState.getValue()][event.getValue()];
    }

    public State getState() {
        return mState;
    }

    public int getScore() {
        return mScore;
    }
}
