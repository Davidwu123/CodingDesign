package com.study.design.pattern.behavior.strategy.chain.list;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: HighV2Handler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-26 09:27
 */
public class HighV2Handler implements IHandler {
    @Override
    public boolean handle(int range) {
        boolean ret = false;
        if (range > 100) {
            Log.d(HighV2Handler.class, "handle success in high");
            ret = true;
        }
        return ret;
    }
}
