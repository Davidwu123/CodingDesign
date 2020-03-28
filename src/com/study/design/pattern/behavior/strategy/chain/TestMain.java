package com.study.design.pattern.behavior.strategy.chain;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.strategy.chain.linkedList.HandlerChain;
import com.study.design.pattern.behavior.strategy.chain.linkedList.HighHandler;
import com.study.design.pattern.behavior.strategy.chain.linkedList.LowHandler;
import com.study.design.pattern.behavior.strategy.chain.linkedList.MiddleHandler;
import com.study.design.pattern.behavior.strategy.chain.list.HandlerV2Chain;
import com.study.design.pattern.behavior.strategy.chain.list.HighV2Handler;
import com.study.design.pattern.behavior.strategy.chain.list.LowV2Handler;
import com.study.design.pattern.behavior.strategy.chain.list.MiddleV2Handler;
import com.study.design.pattern.behavior.strategy.chain.wordFilter.AdsWordFilter;
import com.study.design.pattern.behavior.strategy.chain.wordFilter.PoliticalWordFilter;
import com.study.design.pattern.behavior.strategy.chain.wordFilter.SensitiveWordFilterChain;
import com.study.design.pattern.behavior.strategy.chain.wordFilter.SexyWordFilter;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-25 19:46
 */
public class TestMain {
    public static void main(String[] args) {
        executeResponsibilityChainV1();
        System.out.println("++++++++++++");
        executeResponsibilityChainV2();
        System.out.println("++++++++++++");
        executeWordFilterChain();
    }

    private static void executeResponsibilityChainV1() {
        //责任链是不按照顺序的，总归可以找到一个可以处理的节点，不行就向后传递
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HighHandler());
        handlerChain.addHandler(new LowHandler());
        handlerChain.addHandler(new MiddleHandler());
        handlerChain.handle(900);
    }

    private static void executeResponsibilityChainV2() {
        HandlerV2Chain handlerV2Chain = new HandlerV2Chain();
        handlerV2Chain.addHandler(new MiddleV2Handler());
        handlerV2Chain.addHandler(new LowV2Handler());
        handlerV2Chain.addHandler(new HighV2Handler());
        handlerV2Chain.handle(900);
    }

    private static void executeWordFilterChain() {
        SensitiveWordFilterChain sensitiveWordFilterChain = new SensitiveWordFilterChain();
        sensitiveWordFilterChain.addWordFilter(new AdsWordFilter());
        sensitiveWordFilterChain.addWordFilter(new PoliticalWordFilter());
        sensitiveWordFilterChain.addWordFilter(new SexyWordFilter());
        boolean legal1 = sensitiveWordFilterChain.doFilter("fuck");
        Log.d(TestMain.class, "legal1 " + legal1);
        boolean legal2 = sensitiveWordFilterChain.doFilter("ww");
        Log.d(TestMain.class, "legal2 " + legal2);
    }
}
