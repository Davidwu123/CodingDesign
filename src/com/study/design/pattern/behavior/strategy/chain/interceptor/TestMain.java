package com.study.design.pattern.behavior.strategy.chain.interceptor;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.strategy.chain.interceptor.norecursive.AppendHttpInterceptorV2;
import com.study.design.pattern.behavior.strategy.chain.interceptor.norecursive.LogHttpInterceptorV2;
import com.study.design.pattern.behavior.strategy.chain.interceptor.norecursive.NoRecHttpInterceptorChain;
import com.study.design.pattern.behavior.strategy.chain.interceptor.recursive.AppendHttpInterceptor;
import com.study.design.pattern.behavior.strategy.chain.interceptor.recursive.LogHttpInterceptor;
import com.study.design.pattern.behavior.strategy.chain.interceptor.recursive.RecHttpInterceptorChain;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 19:11
 */
public class TestMain {

    public static void main(String[] arg) {
        executeRecChain();
        System.out.println("+++++++++++++++++");
        executeNoRecChain();
    }

    private static void executeRecChain() {
        RecHttpInterceptorChain chain = new RecHttpInterceptorChain();
        chain.addInterceptor(new LogHttpInterceptor());
        chain.addInterceptor(new AppendHttpInterceptor());
        StringBuilder request = new StringBuilder("www.baidu.com");
        StringBuilder response = new StringBuilder();
        chain.doHandle(request, response);
        Log.d(TestMain.class, "final repose is: " + response);
    }


    private static void executeNoRecChain() {
        NoRecHttpInterceptorChain noRecHttpInterceptorChain = new NoRecHttpInterceptorChain();
        noRecHttpInterceptorChain.addInterceptor(new LogHttpInterceptorV2());
        noRecHttpInterceptorChain.addInterceptor(new AppendHttpInterceptorV2());
        StringBuilder request = new StringBuilder("www.baidu.com");
        StringBuilder response = new StringBuilder();
        noRecHttpInterceptorChain.preHandle(request, response);
        noRecHttpInterceptorChain.executeRequest(request, response);
        noRecHttpInterceptorChain.postHandle(request, response);
        Log.d(TestMain.class, "final repose is: " + response);
    }
}
