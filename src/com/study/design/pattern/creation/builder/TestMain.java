package com.study.design.pattern.creation.builder;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-26 09:30
 */
public class TestMain {

    public static void main(String[] arg) {
        ResourcePoolConfig.Builder builder = new ResourcePoolConfig.Builder()
                .setName("player")
                .setMinIdle(3)
                .setMaxTotal(5);
        ResourcePoolConfig resourcePoolConfig = builder.build();
        Log.d(TestMain.class, resourcePoolConfig.toString());

        ConstructorArg arg1 = new ConstructorArg.Builder()
                .setRef(true)
                .setArg("test")
                .setType(String.class)
                .build();
        Log.d(TestMain.class, arg1.toString());
        ConstructorArg arg2 = new ConstructorArg.Builder()
                .setRef(false)
                .setArg(3)
                .setType(Integer.class)
                .build();
        Log.d(TestMain.class, arg2.toString());

    }
}
