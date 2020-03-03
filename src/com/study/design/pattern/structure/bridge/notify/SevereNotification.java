package com.study.design.pattern.structure.bridge.notify;

import com.study.design.common.Log;
import com.study.design.pattern.structure.bridge.send.IMessageSender;

/**
 * @author wuwei
 * @title: SevereNotification
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-02 10:50
 */
public class SevereNotification extends AbsNotification {

    public SevereNotification(IMessageSender sender) {
        super(sender);
    }

    @Override
    void doCustomConfig() {
        Log.d(SevereNotification.class, "severe custom");
    }
}
