package com.study.design.pattern.behavior.observer.eventbus;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TeacherObserver
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 15:23
 */
public class TeacherObserver {

    @Subscribe
    public void handleX(XMsg xMsg) {
        Log.d(TeacherObserver.class, "handleX " + xMsg.getMsg());
    }

    @Subscribe
    public void handleZ(ZMsg zMsg) {
        Log.d(TeacherObserver.class, "handleZ " + zMsg.getMsg());
    }
}
