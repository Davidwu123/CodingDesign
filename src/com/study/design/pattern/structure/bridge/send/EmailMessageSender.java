package com.study.design.pattern.structure.bridge.send;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: EmailMessageSender
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-02 10:41
 */
public class EmailMessageSender implements IMessageSender {
    @Override
    public void sendMsg(String msg) {
        Log.d(EmailMessageSender.class, "msg is " + msg);
    }
}
