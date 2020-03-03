package com.study.design.pattern.creation.factory.method;

import com.study.design.pattern.creation.factory.IPlayer;
import com.study.design.pattern.creation.factory.MediaPlayer;

/**
 * @author wuwei
 * @title: MediaPlayerFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 11:14
 */
public class MediaPlayerFactory implements IPlayerFactory {
    @Override
    public IPlayer create() {
        return new MediaPlayer();
    }
}
