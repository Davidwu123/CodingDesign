package com.study.design.pattern.behavior.observer.test;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: StudentObserver
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-12 09:16
 */
public class StudentObserver implements IObserver {
    @Override
    public void handleMsg(String msg) {
        Log.d(StudentObserver.class, "student get msg " + msg);
    }
}
