package com.study.design.pattern.behavior.chain.interceptor.recursive;


/**
 * @author wuwei
 * @title: IHttpInterceptor
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-28 16:21
 */
public interface IHttpInterceptor {
    boolean doHandle(StringBuilder request, StringBuilder response, RecHttpInterceptorChain chain);
}
