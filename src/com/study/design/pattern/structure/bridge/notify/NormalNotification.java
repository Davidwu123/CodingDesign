package com.study.design.pattern.structure.bridge.notify;

import com.study.design.common.Log;
import com.study.design.pattern.structure.bridge.send.IMessageSender;

/**
 * @author wuwei
 * @title: NormalNotification
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-02 10:54
 */
public class NormalNotification extends AbsNotification {

    public NormalNotification(IMessageSender sender) {
        super(sender);
    }

    @Override
    void doCustomConfig() {
        Log.d(NormalNotification.class, "normal custom");
    }
}
