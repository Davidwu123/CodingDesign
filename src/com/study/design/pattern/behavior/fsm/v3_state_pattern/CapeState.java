package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: SuperState
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-31 20:11
 */
public class CapeState extends BaseMarioState {

    private static final CapeState INSTANCE = new CapeState();

    public static BaseMarioState getInstance() {
        return INSTANCE;
    }


    @Override
    public State getState() {
        return State.CAPE;
    }

    @Override
    public void meetMonster(MarioStateMachine mMarioStateMachine) {
        mMarioStateMachine.setState(SmallState.getInstance());
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() - 200);
    }
}
