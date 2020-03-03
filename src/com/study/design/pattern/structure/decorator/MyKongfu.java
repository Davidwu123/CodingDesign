package com.study.design.pattern.structure.decorator;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MyKongfu
 * @projectName CodingDesign
 * @description: 唯一实例，拥有的功能
 * @date 2020-03-03 14:04
 */
public class MyKongfu extends AbsKongfu {
    @Override
    public void showKongfu() {
        Log.d(MyKongfu.class, "啥也不会");
    }

    @Override
    public void doSth() {
//        super.doSth();
        Log.d(MyKongfu.class, "do sth");
    }
}
