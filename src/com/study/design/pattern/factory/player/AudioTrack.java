package com.study.design.pattern.factory.player;


import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: AudioTrack
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:28
 */
public class AudioTrack implements IPlayer {

    public AudioTrack() {
        Log.d(AudioTrack.class, "init AudioTrack");
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
