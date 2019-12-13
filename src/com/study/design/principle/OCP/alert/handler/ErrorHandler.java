package com.study.design.principle.OCP.alert.handler;

import com.study.design.principle.OCP.alert.AlertMessage;
import com.study.design.principle.OCP.alert.pusher.IPusher;

/**
 * @author wuwei
 * @title: ErrRuleHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:26
 */
public class ErrorHandler extends BaseHandler {
    private static final String TAG = ErrorHandler.class.getSimpleName();


    public ErrorHandler(IPusher pusher) {
        super(pusher);
    }

    @Override
    public void check(AlertMessage message) {
        if (message.getErrId() == 401) {
            this.mPusher.push("401\n" + message.toString());
        }
    }
}
