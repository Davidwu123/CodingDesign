package com.study.design.pattern.behavior.template;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MainActivity
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-18 20:13
 */
public class MainActivity extends AbstractActivity {
    @Override
    void onCreate() {
        Log.d(MainActivity.class, "invoke onCreate");
    }

    @Override
    void initView() {
        Log.d(MainActivity.class, "init custom view");
    }
}
