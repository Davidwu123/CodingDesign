package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: SuperState
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-31 20:11
 */
public class FireState extends BaseMarioState {

    private static final FireState INSTANCE = new FireState();

    public static BaseMarioState getInstance() {
        return INSTANCE;
    }

    @Override
    public State getState() {
        return State.FIRE;
    }

    @Override
    public void meetMonster(MarioStateMachine mMarioStateMachine) {
        mMarioStateMachine.setState(SmallState.getInstance());
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() - 300);
    }
}
