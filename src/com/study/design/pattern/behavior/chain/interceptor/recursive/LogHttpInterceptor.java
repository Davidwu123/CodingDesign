package com.study.design.pattern.behavior.chain.interceptor.recursive;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: LogHttpInterceptor
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 18:48
 */
public class LogHttpInterceptor implements IHttpInterceptor {
    @Override
    public boolean doHandle(StringBuilder request, StringBuilder response, RecHttpInterceptorChain chain) {
        Log.d(this.getClass().getSimpleName(), "request is " + request.toString());
        Log.d(this.getClass().getSimpleName(), "response is " + response.toString());
        request.insert(0, "://");
        chain.doHandle(request, response);
        response.append(" add response log");
        return true;
    }
}
