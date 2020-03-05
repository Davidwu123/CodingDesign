package com.study.design.pattern.structure.adapter;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MyPlayerAdapter
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-04 11:52
 */
public class MyPlayerAdapterByExtension extends MyPlayer implements IPlayer {
    @Override
    public void play() {
        super.start();
    }

    @Override
    public void pause() {
        Log.d(MyPlayerAdapterByExtension.class, "继承方式重新实现的：停止播放");
    }

    @Override
    public void release() {
        super.destroy();
    }
}
