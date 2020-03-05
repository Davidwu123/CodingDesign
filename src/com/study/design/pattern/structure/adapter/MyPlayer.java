package com.study.design.pattern.structure.adapter;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MyPlayer
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-04 11:49
 */
public class MyPlayer {
    public void start() {
        Log.d(MyPlayer.class, "开始播放");
    }

    public void stop() {
        Log.d(MyPlayer.class, "停止播放");
    }

    public void destroy() {
        Log.d(MyPlayer.class, "销毁播放器");
    }
}
