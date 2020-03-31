package com.study.design.pattern.behavior.chain.linkedList;

/**
 * @author wuwei
 * @title: HandlerChain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-25 21:17
 */
public class HandlerChain {
    private Handler mHeadHandler;
    private Handler mTailHandler;

    public void addHandler(Handler handler) {
        if (mHeadHandler == null) {
            mHeadHandler = handler;
            mTailHandler = handler;
            return;
        }
        //建立链子，前一个已经存在的实例指向下一个
        mTailHandler.setNextHandler(handler);
        //用于下次建立链子
        mTailHandler = handler;
    }

    public void handle(int range) {
        if (mHeadHandler != null) {
            mHeadHandler.handle(range);
        }
    }
}
