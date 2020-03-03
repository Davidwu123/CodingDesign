package com.study.design.pattern.creation.factory.method;

import com.study.design.pattern.creation.factory.ExoPlayer;
import com.study.design.pattern.creation.factory.IPlayer;

/**
 * @author wuwei
 * @title: ExoPlayerFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 11:15
 */
public class ExoPlayerFactory implements IPlayerFactory{
    @Override
    public IPlayer create() {
        return new ExoPlayer();
    }
}
