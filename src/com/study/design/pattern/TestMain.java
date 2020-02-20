package com.study.design.pattern;

import com.study.design.common.Log;
import com.study.design.pattern.singleton.EnumIdGenerator;
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
                Log.d(TestMain.class, "run thread 1" + "\t" + IdGenerator.getInstance4().getId());
            }
        }, "thread-1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TestMain.class, "run thread 2" + "\t" + IdGenerator.getInstance4().getId());
            }
        }, "thread-2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TestMain.class, "run thread 3" + "\t" + EnumIdGenerator.INSTANCE.getId());
            }
        }, "thread-3").start();
    }
}
