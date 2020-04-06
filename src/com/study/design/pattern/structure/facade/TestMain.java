package com.study.design.pattern.structure.facade;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 门面/外观模式
 * @date 2020-03-05 13:18
 */
public class TestMain {
    public static void main(String[] args) {
        //没有使用门面模式的方式
        String test1 = "sd SDGDGDG";
        String test2 = "sd SDGDGDG";
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        Log.d(TestMain.class, "正常模式：" + handlerB.toLowerCase(handlerA.trim(test1)));

        HandlerFacade facade = new HandlerFacade();
        Log.d(TestMain.class, "门面模式：" + facade.handleString(test2));
    }
}
