package com.study.design.pattern.creation.factory;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MediaPlayer
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:27
 */
public class MediaPlayer implements IPlayer {

    public MediaPlayer() {
        Log.d(AudioTrack.class, "init MediaPlayer");
    }

    @Override
    public void play() {
        Log.d(MediaPlayer.class, "media play");
    }

    @Override
    public void pause() {
        Log.d(MediaPlayer.class, "media pause");
    }

    @Override
    public void stop() {
        Log.d(MediaPlayer.class, "media stop");
    }

    @Override
    public void release() {

    }

    @Override
    public void setCallback(IPlayEventCallback callback) {

    }
}
