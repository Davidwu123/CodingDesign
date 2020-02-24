package com.study.design.pattern.factory.player.method;

import com.study.design.pattern.factory.player.AudioTrack;
import com.study.design.pattern.factory.player.IPlayer;

/**
 * @author wuwei
 * @title: AudioTrackFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 11:15
 */
public class AudioTrackFactory implements IPlayerFactory {
    @Override
    public IPlayer create() {
        return new AudioTrack();
    }
}
