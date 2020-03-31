package com.study.design.pattern.behavior.chain.interceptor.norecursive;

/**
 * @author wuwei
 * @title: IHttpInterceptorV2
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 20:36
 */
public interface IHttpInterceptorV2 {
    boolean doPreHandle(StringBuilder request, StringBuilder response);

    void doPostHandle(StringBuilder request, StringBuilder response);

    void doComplete(StringBuilder request, StringBuilder response);
}
