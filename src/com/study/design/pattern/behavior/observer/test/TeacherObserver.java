package com.study.design.pattern.behavior.observer.test;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TecherObserver
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-12 09:14
 */
public class TeacherObserver implements IObserver {

    @Override
    public void handleMsg(String msg) {
        Log.d(TeacherObserver.class, "teacher get msg " + msg);
    }
}
