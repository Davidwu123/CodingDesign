package com.study.design.principle.OCP.alert;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:55
 */
public class TestMain {

    public static void main(String[] sa) {

        AlertMessage message = new AlertMessage()
                .setErrId(401)
                .setMsgId("sdfdsf")
                .setRetryCount(2)
                .setTimeStamp(System.currentTimeMillis())
                .setWaitTimeout(400);
        AlertMessage message1 = new AlertMessage()
                .setErrId(23434)
                .setMsgId("fatal")
                .setRetryCount(20)
                .setTimeStamp(System.currentTimeMillis())
                .setWaitTimeout(1000);
        ApplicationContext.getInstance().getAlertManager().check(message);
        ApplicationContext.getInstance().getAlertManager().check(message1);

    }
}
