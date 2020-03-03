package com.study.design.pattern.creation.factory.simple;

import com.study.design.pattern.creation.factory.AudioTrack;
import com.study.design.pattern.creation.factory.ExoPlayer;
import com.study.design.pattern.creation.factory.IPlayer;
import com.study.design.pattern.creation.factory.MediaPlayer;

/**
 * @author wuwei
 * @title: SimpleFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:39
 */
public class SimplePlayerFactory {
//创建的IPlayer对象不可复用，但是if逻辑过于繁琐，可以实现工厂方法来实现

    /**
     * 每次获取都要重新new，耗费内存和初始化的时间
     * @param type
     * @return
     */
    public static IPlayer create(String type) {
        IPlayer player;
        switch (type) {
            case "media":
                player = new MediaPlayer();
                break;
            case "exo":
                player = new ExoPlayer();
                break;
            default:
                player = new AudioTrack();
                break;
        }
        return player;
    }

    public static IPlayer createByClazz(Class clazz) {
        try {
            return (IPlayer) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
