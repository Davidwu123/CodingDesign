package com.study.design.pattern.structure.facade;

/**
 * @author wuwei
 * @title: HandlerFacede
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-05 15:12
 */
public class HandlerFacade {
    //采用封装的设计思想
    private HandlerA mHandlerA;
    private HandlerB mHandlerB;

    public HandlerFacade() {
        mHandlerA = new HandlerA();
        mHandlerB = new HandlerB();
    }

    public String handleString(String originalString) {
        originalString = mHandlerA.trim(originalString);
        return mHandlerB.toLowerCase(originalString);
    }
}
