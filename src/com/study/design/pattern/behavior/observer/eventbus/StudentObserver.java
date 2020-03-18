package com.study.design.pattern.behavior.observer.eventbus;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: StudentObserver
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 15:23
 */
public class StudentObserver {

    @Subscribe
    public void handleY(YMsg yMsg) {
        Log.d(StudentObserver.class, "handleY " + yMsg.getMsg());
    }
}

