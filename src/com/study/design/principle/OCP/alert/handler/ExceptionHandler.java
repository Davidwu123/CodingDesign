package com.study.design.principle.OCP.alert.handler;

import com.study.design.principle.OCP.alert.AlertMessage;
import com.study.design.principle.OCP.alert.pusher.IPusher;

/**
 * @author wuwei
 * @title: AuthHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:47
 */
public class ExceptionHandler extends BaseHandler {
    private static final String TAG = ExceptionHandler.class.getSimpleName();

    public ExceptionHandler(IPusher pusher) {
        super(pusher);
    }

    @Override
    public void check(AlertMessage message) {
        if (message.getMsgId().equals("fatal")) {
            this.mPusher.push("fatal\n" + message.toString());
        }
    }
}
