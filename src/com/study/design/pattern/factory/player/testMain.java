package com.study.design.pattern.factory.player;

import com.study.design.common.Log;
import com.study.design.pattern.factory.player.method.IPlayerFactory;
import com.study.design.pattern.factory.player.method.PlayerFactoryMap;
import com.study.design.pattern.factory.player.simple.SimplePlayerFactory;
import com.study.design.pattern.singleton.TestMain;

/**
 * @author wuwei
 * @title: testMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-24 09:29
 */
public class testMain {

    public static void main(String[] args) {
        executeSimpleFactory();
        executeFactoryMethod();
    }

    private static void executeSimpleFactory() {
        IPlayer player = SimplePlayerFactory.createByClazz(MediaPlayer.class);
//        Log.d(TestMain.class, "simpleFactory player instance1 is " + player.toString());
//        player = SimplePlayerFactoryV3.create("exo");
        Log.d(TestMain.class, "simpleFactory player instance2 is " + player.toString());
        Log.d(testMain.class, "simpleFactory do play");
        player.play();
    }

    private static void executeFactoryMethod() {
        //易用性较差,需要再次封装工厂类，工厂类更高层的封装类
        IPlayerFactory playerFactory = PlayerFactoryMap.getFactory("media");
        IPlayer player = playerFactory.create();
        Log.d(TestMain.class, "FactoryMethod instance1 is " + player.toString());
        player = playerFactory.create();
        Log.d(TestMain.class, "FactoryMethod instance2 is " + player.toString());
        Log.d(testMain.class, "FactoryMethod do play");
        player.play();
    }


}
