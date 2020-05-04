package com.study.design.pattern.behavior.template.callback;

/**
 * @author wuwei
 * @title: MainActivity
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-19 20:59
 */
public class MainActivity extends BaseActivity {
    public void templateGetMethod() {
        super.templateGetMethod(new IGetCallback() {
            @Override
            public String getResult() {
                return "just do it!";
            }
        });
    }

    public void templatePostMethod() {
        super.templatePostMethod(new IPostCallback() {
            @Override
            public String getUrl() {
                return "www.baidu.com";
            }
        });
    }

    @Override
    public String doTest() {
        return "ha ha test";
    }
}