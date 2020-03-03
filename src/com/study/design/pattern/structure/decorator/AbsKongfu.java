package com.study.design.pattern.structure.decorator;


import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: IAbility
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-03 13:27
 */
public abstract class AbsKongfu {

    public abstract void showKongfu();

    public void doSth() {
        Log.d(AbsKongfu.class, "do sth");
    }

}
