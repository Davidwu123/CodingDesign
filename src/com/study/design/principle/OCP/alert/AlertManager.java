package com.study.design.principle.OCP.alert;


import com.study.design.principle.OCP.alert.handler.BaseHandler;

import java.util.ArrayList;

/**
 * @author wuwei
 * @title: Alert
 * @projectName CodingDesign
 * @description: 告警类入口，处理上层系统转发的消息，并分析和处理
 * @date 2019-12-13 16:41
 */
public class AlertManager {
    private static final String TAG = AlertManager.class.getSimpleName();
    private ArrayList<BaseHandler> mRuleHandlers;

    public AlertManager() {
        this.mRuleHandlers = new ArrayList<>();
    }

    public void addRules(BaseHandler handler) {
        if (mRuleHandlers != null && !mRuleHandlers.contains(handler)) {
            mRuleHandlers.add(handler);
        }
    }

    public void check(AlertMessage alertMessage) {
        for (BaseHandler handler : mRuleHandlers) {
            handler.check(alertMessage);
        }
    }

}
