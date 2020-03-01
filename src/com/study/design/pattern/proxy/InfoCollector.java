package com.study.design.pattern.proxy;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: UserInfoCollector
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 13:43
 */
public class InfoCollector {
    public void recordRequest(String request) {
        Log.d(InfoCollector.class, "record request: " + request);
    }
}
