package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: IState
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-31 21:34
 */
public interface IState {
    State getState();
    void obtainMushRoom(MarioStateMachine marioStateMachine);
    void obtainCape(MarioStateMachine marioStateMachine);
    void obtainFireFlower(MarioStateMachine marioStateMachine);
    void meetMonster(MarioStateMachine marioStateMachine);

}
