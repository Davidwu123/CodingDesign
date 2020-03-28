package com.study.design.pattern.behavior.strategy.chain.linkedList;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: BaseHandler
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-25 21:03
 */
public abstract class Handler {
    private Handler mNextHandler;

    public void setNextHandler(Handler handler) {
        this.mNextHandler = handler;
    }

    public final void handle(int range) {
        //如果所有的节点都要收到并处理，则if中无需isHandled的判断
        boolean isHandled = doHandle(range);
        if (!isHandled && mNextHandler != null) {
            Log.d(Handler.class, "transfer to " + mNextHandler.getClass().getSimpleName());
            mNextHandler.handle(range);
        }
    }

    protected abstract boolean doHandle(int range);
}
