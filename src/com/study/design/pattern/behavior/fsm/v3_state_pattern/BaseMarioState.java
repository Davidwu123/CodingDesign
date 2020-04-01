package com.study.design.pattern.behavior.fsm.v3_state_pattern;


/**
 * @author wuwei
 * @title: IState
 * @projectName CodingDesign
 * @description: 将状态抽象为一个对象，里面有行为：吃到蘑菇，遇到怪物等
 * @date 2020-03-31 13:34
 */
public abstract class BaseMarioState implements IState{

    /**
     * 吃到蘑菇
     */
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
    }

    /**
     * 吃到斗篷
     */
    public void obtainCape(MarioStateMachine marioStateMachine) {
    }

    /**
     * 吃到火花
     */
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {
    }

    /**
     * 遇到怪物
     */
    public void meetMonster(MarioStateMachine marioStateMachine) {
        throw new RuntimeException("unImplement exception");
    }
}
