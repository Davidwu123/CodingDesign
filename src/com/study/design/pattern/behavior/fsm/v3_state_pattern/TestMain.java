package com.study.design.pattern.behavior.fsm.v3_state_pattern;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-31 20:01
 */
public class TestMain {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        mario.meetMonster();
        mario.obtainMushRoom();
        mario.obtainMushRoom();
        mario.obtainFireFlower();
        int score = mario.getScore();
        State state = mario.getState();
        Log.d(TestMain.class, "mario score: " + score + "; state: " + state);
    }
}
