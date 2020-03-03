package com.study.design.pattern.creation.factory.simple;

import com.study.design.pattern.creation.factory.AudioTrack;
import com.study.design.pattern.creation.factory.ExoPlayer;
import com.study.design.pattern.creation.factory.IPlayer;
import com.study.design.pattern.creation.factory.MediaPlayer;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wuwei
 * @title: SimplePlayerFactoryV3
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 10:28
 */
public class SimplePlayerFactoryV3 {
    //创建的IPlayer对象可复用，对于每次都需要new新的不适用
    private static final ConcurrentHashMap<String, IPlayer> sCachedPlayerMap = new ConcurrentHashMap<>();
    static {
        sCachedPlayerMap.put("exo", new ExoPlayer());
        sCachedPlayerMap.put("media", new MediaPlayer());
        sCachedPlayerMap.put("audio", new AudioTrack());
    }

    public static IPlayer create(String type) {
        return sCachedPlayerMap.get(type);
    }
}
