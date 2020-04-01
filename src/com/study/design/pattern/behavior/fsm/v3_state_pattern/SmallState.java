package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: SmallState
 * @projectName CodingDesign
 * @description: 状态类的接口即为事件对应的转移接口，定义类似
 * @date 2020-03-31 13:38
 */
public class SmallState extends BaseMarioState {
    private static final SmallState INSTANCE = new SmallState();

    public static BaseMarioState getInstance() {
        return INSTANCE;
    }


    @Override
    public State getState() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine mMarioStateMachine) {
        //状态转移
        mMarioStateMachine.setState(SuperState.getInstance());
        //行为活动作的处理
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() + 100);
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
        mMarioStateMachine.setScore(mMarioStateMachine.getScore() - 100);
    }
}
