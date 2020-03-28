package com.study.design.pattern.behavior.strategy.chain.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: HandlerV2Chain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-26 09:28
 */
public class HandlerV2Chain {
    private List<IHandler> mList = new ArrayList<>();

    public HandlerV2Chain addHandler(IHandler handler) {
        mList.add(handler);
        return this;
    }

    public void handle(int range) {
        for (IHandler handler : mList) {
            if (handler.handle(range)) {
                break;//只要又一个执行了就退出
                //如果需要全部收到，该break删除
            }
        }
    }
}
