package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: SuperState
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-31 20:11
 */
public class SuperState extends BaseMarioState {
    private static final SuperState INSTANCE = new SuperState();

    public static BaseMarioState getInstance() {
        return INSTANCE;
    }

    @Override
    public State getState() {
        return State.SUPER;
    }

    @Override
    public void obtainCape(MarioStateMachine mMarioStateMachine) {
        mMarioStateMachine.setState(CapeState.getInstance());
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine mMarioStateMachine) {
        mMarioStateMachine.setState(FireState.getInstance());
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine mMarioStateMachine) {
        mMarioStateMachine.setState(SmallState.getInstance());
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() - 100);
    }
}
