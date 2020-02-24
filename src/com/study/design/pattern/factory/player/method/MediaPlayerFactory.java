package com.study.design.pattern.factory.player.method;

import com.study.design.pattern.factory.player.IPlayer;
import com.study.design.pattern.factory.player.MediaPlayer;

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
