package com.study.design.pattern.behavior.observer.eventbus;

/**
 * @author wuwei
 * @title: ZMsg
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 15:24
 */
public class ZMsg {
    private String msg;

    public ZMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public ZMsg setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "ZMsg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
