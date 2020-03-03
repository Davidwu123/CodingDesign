package com.study.design.pattern.structure.bridge.send;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: SmssMessageSender
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-02 10:42
 */
public class SmssMessageSender implements IMessageSender {
    @Override
    public void sendMsg(String msg) {
        Log.d(SmssMessageSender.class, "msg is " + msg);
    }
}
