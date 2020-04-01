package com.study.design.pattern.behavior.fsm.v2_map;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.fsm.State;

/**
 * @author wuwei
 * @title: TestMaiin
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 08:57
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
