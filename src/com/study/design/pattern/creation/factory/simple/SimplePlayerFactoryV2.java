package com.study.design.pattern.creation.factory.simple;


import com.study.design.pattern.creation.factory.AudioTrack;
import com.study.design.pattern.creation.factory.ExoPlayer;
import com.study.design.pattern.creation.factory.IPlayer;
import com.study.design.pattern.creation.factory.MediaPlayer;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wuwei
 * @title: SimplePlayerFactoryV2
 * @projectName CodingDesign
 * @description: 通过并发map来维护并初始化虽说使用的时候真正是单例，但还是初始化了
 * @date 2020-02-24 10:15
 */
public class SimplePlayerFactoryV2 {
    //创建的IPlayer对象可复用，对于每次都需要new新的不适用
    private static final ConcurrentHashMap<String, IPlayer> sCachedPlayerMap = new ConcurrentHashMap<>();

    public static IPlayer create(String type) {
        switch (type) {
            case "media":
                sCachedPlayerMap.putIfAbsent(type, new MediaPlayer());//还是要new 出来才设置进去，并没有减少初始化时间
                break;
            case "exo":
                sCachedPlayerMap.putIfAbsent(type, new ExoPlayer());
                break;
            default:
                sCachedPlayerMap.putIfAbsent(type, new AudioTrack());
                break;
        }
        return sCachedPlayerMap.get(type);
    }
}
