package com.study.design.verify.interfaces;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: ICallback
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-07 20:57
 */
public interface ICallback {
    void test();

    default void doIt() {
        Log.d(ICallback.class, "ha ha");
    }
}
