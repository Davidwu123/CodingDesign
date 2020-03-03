package com.study.design.pattern.creation.proxy._static;

import com.study.design.pattern.creation.proxy.IAuth;
import com.study.design.pattern.creation.proxy.InfoCollector;

/**
 * @author wuwei
 * @title: ProductAuthProxy
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 13:50
 */
public class ProductAuthProxy implements IAuth {
    private InfoCollector mCollector;
    private IAuth mAuth;

    public ProductAuthProxy(IAuth auth) {
        this.mAuth = auth;
        mCollector = new InfoCollector();
    }

    @Override
    public void login(String loginUrl) {
        mAuth.login(loginUrl);
        mCollector.recordRequest("product login");
    }

    @Override
    public void register(String registerUrl) {
        mAuth.register(registerUrl);
        mCollector.recordRequest("product register");
    }

    @Override
    public String verity() {
        return "";
    }
}
