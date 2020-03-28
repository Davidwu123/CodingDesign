package com.study.design.pattern.behavior.strategy.chain.linkedList;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: HighHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-25 21:14
 */
public class HighHandler extends Handler {
    @Override
    protected boolean doHandle(int range) {
        boolean ret = false;
        if (range > 100) {
            Log.d(HighHandler.class, "handle success in high");
            ret = true;
        }
        return ret;
    }
}
