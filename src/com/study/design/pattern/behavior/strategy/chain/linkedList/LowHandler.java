package com.study.design.pattern.behavior.strategy.chain.linkedList;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: LowHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-25 21:14
 */
public class LowHandler extends Handler {
    @Override
    protected boolean doHandle(int range) {
        boolean ret = false;
        if (range > 0 && range < 50) {
            Log.d(LowHandler.class, "handle success in low");
            ret = true;
        }
        return ret;
    }
}
