package com.study.design.pattern.proxy;

import com.study.design.common.Log;
import com.study.design.pattern.bean.FileBean;
import com.study.design.pattern.factory.player.IPlayer;
import com.study.design.pattern.factory.player.MediaPlayer;
import com.study.design.pattern.proxy._dynamic.InfoCollectorProxy;
import com.study.design.pattern.proxy._static.UserAuthProxy;

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


        /**
         * 具体的业务bean必须实现某个接口
         */
//        FileBean fileBean = (FileBean) collectorProxy.createProxy(new FileBean());
//        fileBean.setName("test");
    }
}
