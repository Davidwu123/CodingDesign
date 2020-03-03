package com.study.design.pattern.creation.factory.method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuwei
 * @title: PlayerFactoryMap
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 11:30
 */
public class PlayerFactoryMap {
    private static final Map<String, IPlayerFactory> sFactoryMap = new HashMap<>();

    static {
        sFactoryMap.put("exo", new ExoPlayerFactory());
        sFactoryMap.put("media", new MediaPlayerFactory());
        sFactoryMap.put("audio", new AudioTrackFactory());
    }

    public static IPlayerFactory getFactory(String type) {
        return sFactoryMap.get(type);
    }
}
