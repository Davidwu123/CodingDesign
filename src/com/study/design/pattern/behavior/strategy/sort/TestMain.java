package com.study.design.pattern.behavior.strategy.sort;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-23 20:39
 */
public class TestMain {

    /**
     * 策略模式中的不单可以优化掉if/else中的等于判断，还可以用于范围的判断
     * 即将范围的起始点作为自定义类的参数，将该类作为list中的一员
     * @param args
     */
    public static void main(String[] args) {
        String filePath = "/sdcard/1.txt";
        SortFactory.sortFile(filePath);
    }
}
