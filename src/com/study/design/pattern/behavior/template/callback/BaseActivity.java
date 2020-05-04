package com.study.design.pattern.behavior.template.callback;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: BaseActivity
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-19 20:47
 */
public abstract class BaseActivity implements ITestCallback{
    protected void templateGetMethod(IGetCallback callback) {
        String result = callback.getResult();
        Log.d(BaseActivity.class, "get result is " + result);
    }

    protected void templatePostMethod(IPostCallback callback) {
        String url = callback.getUrl();
        Log.d(BaseActivity.class, "get url is " + url);
    }

    void test() {
        String testString = doTest();
    }

    @Override
    public String doTest() {
        return null;
    }
}
