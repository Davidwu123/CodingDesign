package com.study.design.principle.OCP.alert.pusher;

/**
 * @author wuwei
 * @title: IAlertPush
 * @projectName CodingDesign
 * @description: 推送模块接口
 * @date 2019-12-13 17:19
 */
public interface IPusher {
    void push(String msg);
}
