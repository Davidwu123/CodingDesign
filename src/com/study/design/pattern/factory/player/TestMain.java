package com.study.design.pattern.factory.player;

import com.study.design.common.Log;
import com.study.design.pattern.factory.player.method.IPlayerFactory;
import com.study.design.pattern.factory.player.method.PlayerFactoryMap;
import com.study.design.pattern.factory.player.simple.SimplePlayerFactory;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:29
 */
public class TestMain {

    public static void main(String[] args) {
        executeSimpleFactory();
        executeFactoryMethod();
    }

    private static void executeSimpleFactory() {
        IPlayer player = SimplePlayerFactory.createByClazz(MediaPlayer.class);
//        Log.d(TestMain.class, "simpleFactory player instance1 is " + player.toString());
//        player = SimplePlayerFactoryV3.create("exo");
        Log.d(com.study.design.pattern.singleton.TestMain.class, "simpleFactory player instance2 is " + player.toString());
        Log.d(TestMain.class, "simpleFactory do play");
        player.play();
    }

    private static void executeFactoryMethod() {
        //易用性较差,需要再次封装工厂类，工厂类更高层的封装类
        IPlayerFactory playerFactory = PlayerFactoryMap.getFactory("media");
        IPlayer player = playerFactory.create();
        Log.d(com.study.design.pattern.singleton.TestMain.class, "FactoryMethod instance1 is " + player.toString());
        player = playerFactory.create();
        Log.d(com.study.design.pattern.singleton.TestMain.class, "FactoryMethod instance2 is " + player.toString());
        Log.d(TestMain.class, "FactoryMethod do play");
        player.play();
    }


}
