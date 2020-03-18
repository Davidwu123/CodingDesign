package com.study.design.pattern.behavior.template;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-18 19:28
 */
public class TestMain {
    public static void main(String[] args) {
        executeTemplateForReuse();
        System.out.println("++++++++++++++");
        executeTemplateForExtension();
    }

    private static void executeTemplateForReuse() {
        new MainActivity().templateMethod();
    }

    private static void executeTemplateForExtension() {
    }
}
