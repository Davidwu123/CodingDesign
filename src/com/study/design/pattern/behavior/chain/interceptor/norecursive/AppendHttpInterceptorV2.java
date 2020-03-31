package com.study.design.pattern.behavior.chain.interceptor.norecursive;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: AppendHttpInterceptor
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 20:40
 */
public class AppendHttpInterceptorV2 implements IHttpInterceptorV2 {
    @Override
    public boolean doPreHandle(StringBuilder request, StringBuilder response) {
        Log.d(this.getClass().getSimpleName(), "request is " + request.toString());
        request.insert(0, "http");
        return true;
    }

    @Override
    public void doPostHandle(StringBuilder request, StringBuilder response) {
        Log.d(this.getClass().getSimpleName(), "response is " + response.toString());
        response.append(" add append ");
    }

    @Override
    public void doComplete(StringBuilder request, StringBuilder response) {
        Log.d(this.getClass().getSimpleName(), "invoke doComplete");
    }
}
