package com.study.design.principle.OCP.alert.pusher;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: AuthFailPusher
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:30
 */
public class MobilePusher implements IPusher {
    private static final String TAG = MobilePusher.class.getSimpleName();

    @Override
    public void push(String msg) {
        Log.d(TAG, "send msg by mobile " + msg);
    }
}
