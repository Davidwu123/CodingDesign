package com.study.design.pattern.behavior.strategy.chain.interceptor.norecursive;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: LogHttpInterceptor
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 20:35
 */
public class LogHttpInterceptorV2 implements IHttpInterceptorV2{
    @Override
    public boolean doPreHandle(StringBuilder request, StringBuilder response) {
        Log.d(this.getClass().getSimpleName(), "request is " + request.toString());
        request.insert(0, "://");
        return true;
    }

    @Override
    public void doPostHandle(StringBuilder request, StringBuilder response) {
        Log.d(this.getClass().getSimpleName(), "response is " + response.toString());
        response.append(" add response log");
    }

    @Override
    public void doComplete(StringBuilder request, StringBuilder response) {
        Log.d(this.getClass().getSimpleName(), "invoke doComplete");
    }
}
