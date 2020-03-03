package com.study.design.pattern.creation.proxy;

/**
 * @author wuwei
 * @title: IAuth
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 13:41
 */
public interface IAuth {
    void login(String loginUrl);

    void register(String registerUrl);

    String verity();
}
