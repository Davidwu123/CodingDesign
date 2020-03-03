package com.study.design.pattern.creation.proxy;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: UserAuth
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 13:42
 */
public class UserAuth implements IAuth {
    @Override
    public void login(String loginUrl) {
        Log.d(UserAuth.class, "login url: " + loginUrl);
    }

    @Override
    public void register(String registerUrl) {
        Log.d(UserAuth.class, "register url: " + registerUrl);
    }

    @Override
    public String verity() {
        Log.d(UserAuth.class, "user verity");
        return "user verify";
    }
}
