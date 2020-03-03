package com.study.design.pattern.creation.factory;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: ExoPlayer
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:28
 */
public class ExoPlayer implements IPlayer {

    public ExoPlayer() {
        Log.d(ExoPlayer.class, "init ExoPlayer");
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void release() {

    }

    @Override
    public void setCallback(IPlayEventCallback callback) {

    }
}
