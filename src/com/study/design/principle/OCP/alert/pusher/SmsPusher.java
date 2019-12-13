package com.study.design.principle.OCP.alert.pusher;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: SmsPusher
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:36
 */
public class SmsPusher implements IPusher {
    private static final String TAG = SmsPusher.class.getSimpleName();

    @Override
    public void push(String msg) {
        Log.d(TAG, "send msg by sms " + msg);
    }
}
