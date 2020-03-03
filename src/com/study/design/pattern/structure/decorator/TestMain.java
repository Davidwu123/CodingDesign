package com.study.design.pattern.structure.decorator;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-03 10:26
 */
public class TestMain {
    public static void main(String[] args) {
        AbsKongfu myKongfu = new MyKongfu();
        XLKongfu xlKongfu = new XLKongfu(myKongfu);
        JYKongfu jyKongfu = new JYKongfu(xlKongfu);
        jyKongfu.showKongfu();
        jyKongfu.doSth();
    }
}
