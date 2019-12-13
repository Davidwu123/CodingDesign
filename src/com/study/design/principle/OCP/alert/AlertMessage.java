package com.study.design.principle.OCP.alert;

/**
 * @author wuwei
 * @title: AlertMessage
 * @projectName CodingDesign
 * @description: TODO
 * @date 2019-12-13 17:06
 */
public class AlertMessage {
    private String msgId;
    private long timeStamp;
    private int retryCount;
    private int waitTimeout;
    private int errId;

    public String getMsgId() {
        return msgId;
    }

    public AlertMessage setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public AlertMessage setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public AlertMessage setRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    public int getWaitTimeout() {
        return waitTimeout;
    }

    public AlertMessage setWaitTimeout(int waitTimeout) {
        this.waitTimeout = waitTimeout;
        return this;
    }

    public int getErrId() {
        return errId;
    }

    public AlertMessage setErrId(int errId) {
        this.errId = errId;
        return this;
    }

    @Override
    public String toString() {
        return "AlertMessage{" +
                "msgId='" + msgId + '\'' +
                ", timeStamp=" + timeStamp +
                ", retryCount=" + retryCount +
                ", waitTimeout=" + waitTimeout +
                ", errId=" + errId +
                '}';
    }
}
