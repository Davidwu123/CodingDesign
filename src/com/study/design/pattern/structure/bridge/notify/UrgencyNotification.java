package com.study.design.pattern.structure.bridge.notify;

import com.study.design.common.Log;
import com.study.design.pattern.structure.bridge.send.IMessageSender;

/**
 * @author wuwei
 * @title: UrgencyNotification
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-02 10:53
 */
public class UrgencyNotification extends AbsNotification {

    public UrgencyNotification(IMessageSender sender) {
        super(sender);
    }

    @Override
    void doCustomConfig() {
        Log.d(UrgencyNotification.class, "urgency custom");
    }
}
