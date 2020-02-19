package com.study.design.pattern;

import com.study.design.common.Log;
import com.study.design.pattern.singleton.IdGenerator;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-19 11:02
 */
public class TestMain {


    public static void main(String[] arg) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TestMain.class, "run thread 1");
                Log.d(TestMain.class, IdGenerator.getInstance1().getId());
            }
        }, "thread-one").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TestMain.class, "run thread 2");
                Log.d(TestMain.class, IdGenerator.getInstance1().getId());
            }
        }, "thread-two").start();
    }
}
