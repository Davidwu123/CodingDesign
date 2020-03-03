package com.study.design.pattern.creation.proxy;

import com.study.design.common.Log;
import com.study.design.pattern.creation.factory.IPlayer;
import com.study.design.pattern.creation.factory.MediaPlayer;
import com.study.design.pattern.creation.proxy._dynamic.InfoCollectorProxy;
import com.study.design.pattern.creation.proxy._static.UserAuthProxy;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 10:44
 */
public class TestMain {
    public static void main(String[] args) {
        _staticProxy();
        Log.d(TestMain.class, "+++++++++++++++++++++++");
        _dynamicProxy();
    }


    private static void _staticProxy() {
        UserAuthProxy userAuthProxy = new UserAuthProxy(new UserAuth());//以后类型修改，只需要该这个传参即可
        userAuthProxy.login("user login");
        userAuthProxy.register("user register");
    }

    private static void _dynamicProxy() {
        InfoCollectorProxy collectorProxy = new InfoCollectorProxy();
        IAuth userAuthProxy = (IAuth) collectorProxy.createProxy(new UserAuth());
        userAuthProxy.login("dynamic user login");
        userAuthProxy.register("dynamic user register");
        userAuthProxy.verity();

        IAuth productAuthProxy = (IAuth) collectorProxy.createProxy(new ProductAuth());
        productAuthProxy.login("dynamic product login");
        productAuthProxy.register("dynamic product register");
        productAuthProxy.verity();

        IPlayer player = (IPlayer) collectorProxy.createProxy(new MediaPlayer());
        player.play();
        player.pause();
        player.stop();

    }
}
