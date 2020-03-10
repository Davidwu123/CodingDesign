package com.study.design.pattern.structure.decorator;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 应用场景：原始类已经不能修改，且随着需求的增加，如果需要新增功能，一般情况只能用继承来解决，但是
 * 多重继承会很复杂
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
