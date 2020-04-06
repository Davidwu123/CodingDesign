package com.study.design.pattern.structure.bridge.notify;

import com.study.design.pattern.structure.bridge.send.IMessageSender;


/**
 * @author wuwei
 * @title: AbsNotification
 * @projectName CodingDesign
 * @description: 变化的是两个或两个以上的维度(同一个维度:具有相同的本质特征)
 * @date 2020-03-02 10:45
 */
public abstract class AbsNotification {
    /**
     * 抽象类：和具体的业务无关，不管用什么来通知
     */

    private IMessageSender mSender;
    public AbsNotification(IMessageSender sender) {//抽象化和实现化之间通过组合的方式来链接(桥接)
        this.mSender = sender;
    }

    public final void sendMsg(String msg) {
        this.mSender.sendMsg(msg);
        doCustomConfig();
    }

    abstract void doCustomConfig();
}
