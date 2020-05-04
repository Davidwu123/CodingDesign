package com.study.design.pattern.behavior.observer.test;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: StudentObserver
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-12 09:16
 */
public class ParentObserver implements IObserver {
    @Override
    public String handleMsg(String msg) {
        Log.d(ParentObserver.class, "parent get msg " + msg);
        msg += "p";
        return msg;
    }
}
