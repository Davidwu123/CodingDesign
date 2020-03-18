package com.study.design.pattern.behavior.observer.eventbus;

/**
 * @author wuwei
 * @title: XMsg
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 15:23
 */
public class XMsg {
    private String msg;

    public XMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public XMsg setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "XMsg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
