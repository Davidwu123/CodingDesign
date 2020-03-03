package com.study.design.pattern.structure.decorator;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: LevelTwoKongfu
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-03 13:33
 */
public class XLKongfu extends FiliterKongfu {

    public XLKongfu(AbsKongfu kongfu) {
        super(kongfu);
    }

    @Override
    public void showKongfu() {
//        super.showKongfu();
        mKongfu.showKongfu();
        Log.d(XLKongfu.class, "降龙十八掌");
    }

    @Override
    public void doSth() {
        super.doSth();//这里必须是传入的实例方法调用，否则还是FilterKongfu的方法调用
//        mKongfu.doSth();
        Log.d(XLKongfu.class, "do sth");
    }
}
