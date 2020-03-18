package com.study.design.pattern.behavior.template;

/**
 * @author wuwei
 * @title: AbstractActivity
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-18 20:11
 */
public abstract class AbstractActivity {
    /**
     * 模版方法，定义了该类的执行流程
     */
    public final void templateMethod() {
        onCreate();
        initView();
    }

    abstract void onCreate();

    /**
     * 在很多抽象方法的时候，且并不是所有抽象方法都会调用时候，用该方法对于子类而言，只需要重写用的方法即可
     */
    void initView() {
        throw new UnsupportedOperationException();
    }
}
