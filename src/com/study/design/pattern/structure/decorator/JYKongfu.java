package com.study.design.pattern.structure.decorator;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: LevelOneKongfu
 * @projectName CodingDesign
 * @description: 附属能力，可动态添加给任意实体类
 * @date 2020-03-03 13:31
 */
public class JYKongfu extends FilterKongfu {

    public JYKongfu(AbsKongfu kongfu) {
        super(kongfu);
    }

    @Override
    public void showKongfu() {
        mKongfu.showKongfu();
        Log.d(JYKongfu.class, "九阳神功");
    }

    @Override
    public void doSth() {
        mKongfu.doSth();
        Log.d(JYKongfu.class, "do sth");
    }
}
