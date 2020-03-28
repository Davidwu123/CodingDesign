package com.study.design.pattern.behavior.strategy.chain.interceptor.recursive;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: AppendHttpInterceptor
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 19:08
 */
public class AppendHttpInterceptor implements IHttpInterceptor {
    @Override
    public boolean doHandle(StringBuilder request, StringBuilder response, RecHttpInterceptorChain chain) {
        Log.d(this.getClass().getSimpleName(), "request is " + request.toString());
        Log.d(this.getClass().getSimpleName(), "response is " + response.toString());
        request.insert(0, "http");
        chain.doHandle(request, response);
        response.append(" add append ");
        return true;
    }
}
