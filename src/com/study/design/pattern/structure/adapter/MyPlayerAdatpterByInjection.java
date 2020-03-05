package com.study.design.pattern.structure.adapter;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MyPlayerAdatpterByInjection
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-04 11:55
 */
public class MyPlayerAdatpterByInjection implements IPlayer {
    private MyPlayer mPlayer;

    public MyPlayerAdatpterByInjection(MyPlayer myPlayer) {
        this.mPlayer = myPlayer;
    }

    @Override
    public void play() {
        mPlayer.start();
    }

    @Override
    public void pause() {
        Log.d(MyPlayerAdatpterByInjection.class, "依赖注入方式实现的：暂停播放");

    }

    @Override
    public void release() {
        mPlayer.destroy();
    }
}
