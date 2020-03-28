package com.study.design.pattern.behavior.strategy.chain.list;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: LowHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-26 09:24
 */
public class LowV2Handler implements IHandler {
    @Override
    public boolean handle(int range) {
        boolean ret = false;
        if (range > 0 && range < 50) {
            Log.d(LowV2Handler.class, "handle success in low");
            ret = true;
        }
        return ret;
    }
}
