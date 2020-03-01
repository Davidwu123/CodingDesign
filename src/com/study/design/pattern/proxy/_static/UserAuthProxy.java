package com.study.design.pattern.proxy._static;

import com.study.design.pattern.proxy.IAuth;
import com.study.design.pattern.proxy.InfoCollector;

/**
 * @author wuwei
 * @title: UserAuthProxy
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 13:42
 */
public class UserAuthProxy implements IAuth {
    private InfoCollector mCollector;
    private IAuth mAuth;

    public UserAuthProxy(IAuth auth) {
        this.mAuth = auth;
        mCollector = new InfoCollector();
    }

    @Override
    public void login(String loginUrl) {
        //在业务逻辑前后加额外的业务逻辑
        mAuth.login(loginUrl);
        mCollector.recordRequest("login");
    }

    @Override
    public void register(String registerUrl) {
        mAuth.register(registerUrl);
        mCollector.recordRequest("register");
    }

    @Override
    public String verity() {
        return "";
    }


}
