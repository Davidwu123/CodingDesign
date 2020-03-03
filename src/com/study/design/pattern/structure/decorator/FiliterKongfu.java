package com.study.design.pattern.structure.decorator;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: FiliterKongfu
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-03 13:35
 */
public class FiliterKongfu extends AbsKongfu {
    protected AbsKongfu mKongfu;
    public FiliterKongfu(AbsKongfu kongfu) {
        this.mKongfu = kongfu;
    }

    private AbsKongfu getKongfu() {
        return this.mKongfu;
    }

    @Override
    public void showKongfu() {
        mKongfu.showKongfu();
//        Log.d(FiliterKongfu.class, "还是啥都不会");
    }

    @Override
    public void doSth() {
        mKongfu.doSth();
//        Log.d(FiliterKongfu.class, "do sth");
    }
}
