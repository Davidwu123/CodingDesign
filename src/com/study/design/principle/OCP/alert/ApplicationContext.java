package com.study.design.principle.OCP.alert;

import com.study.design.principle.OCP.alert.handler.ErrorHandler;
import com.study.design.principle.OCP.alert.handler.ExceptionHandler;
import com.study.design.principle.OCP.alert.pusher.MobilePusher;
import com.study.design.principle.OCP.alert.pusher.SmsPusher;

/**
 * @author wuwei
 * @title: ApplicationContext
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:57
 */
public class ApplicationContext {
    private static final String TAG = ApplicationContext.class.getSimpleName();
    private static volatile ApplicationContext sInstance;
    private AlertManager mAlertManager;

    private ApplicationContext() {
        this.mAlertManager = new AlertManager();
        this.mAlertManager.addRules(new ExceptionHandler(new SmsPusher()));
        this.mAlertManager.addRules(new ErrorHandler(new MobilePusher()));
    }

    public static ApplicationContext getInstance() {
        if (sInstance == null) {
            synchronized (ApplicationContext.class) {
                if (sInstance == null) {
                    sInstance = new ApplicationContext();
                }
            }
        }
        return sInstance;
    }

    public AlertManager getAlertManager() {
        return this.mAlertManager;
    }


}
