package com.study.design.pattern.proxy;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: ProductAuth
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 13:50
 */
public class ProductAuth implements IAuth {

    @Override
    public void login(String loginUrl) {
        Log.d(ProductAuth.class, "product login url : " + loginUrl);
    }

    @Override
    public void register(String registerUrl) {
        Log.d(ProductAuth.class, "product register url: " + registerUrl);
    }

    @Override
    public String verity() {
        Log.d(UserAuth.class, "product verity");
        return "product verify";
    }
}
