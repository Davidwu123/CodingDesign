package com.study.design.pattern.structure.bridge;

import com.study.design.pattern.structure.bridge.notify.NormalNotification;
import com.study.design.pattern.structure.bridge.notify.SevereNotification;
import com.study.design.pattern.structure.bridge.send.EmailMessageSender;
import com.study.design.pattern.structure.bridge.send.SmssMessageSender;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-02 10:39
 */
public class TestMain {
    public static void main(String[] args) {
        SevereNotification severeNotification = new SevereNotification(new EmailMessageSender());
        severeNotification.sendMsg("严重崩溃,通过邮件发送");

        NormalNotification normalNotification = new NormalNotification(new SmssMessageSender());
        normalNotification.sendMsg("正常问题,通过短信发送");
    }
}
