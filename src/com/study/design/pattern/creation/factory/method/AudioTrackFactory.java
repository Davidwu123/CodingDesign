package com.study.design.pattern.creation.factory.method;

import com.study.design.pattern.creation.factory.AudioTrack;
import com.study.design.pattern.creation.factory.IPlayer;

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
