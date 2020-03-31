package com.study.design.pattern.behavior.chain.linkedList;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: HandlerA
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-25 21:10
 */
public class MiddleHandler extends Handler {
    @Override
    protected boolean doHandle(int range) {
        boolean ret = false;
        if (range > 50 && range < 100) {
            Log.d(MiddleHandler.class, "handle success in middle");
            ret = true;
        }
        return ret;
    }
}
