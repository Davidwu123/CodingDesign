package com.study.design.pattern.behavior.fsm.v1_simple;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 有限状态机模式:finite state machine
 * @date 2020-03-30 20:42
 */
public class TestMain {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        mario.meetMonster();
        mario.obtainFireFlower();
        int score = mario.getScore();
        State state = mario.getState();
        Log.d(TestMain.class, "mario score: " + score + "; state: " + state);
    }
}
