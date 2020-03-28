package com.study.design.pattern.behavior.strategy.chain.list;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MiddleHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-26 09:25
 */
public class MiddleV2Handler implements IHandler {
    @Override
    public boolean handle(int range) {
        boolean ret = false;
        if (range > 50 && range < 100) {
            Log.d(MiddleV2Handler.class, "handle success in middle");
            ret = true;
        }
        return ret;
    }
}
