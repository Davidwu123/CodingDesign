package com.study.design.pattern.behavior.template;

import com.study.design.common.Log;
import com.study.design.pattern.behavior.template.abs.MainActivity;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-18 19:28
 */
public class TestMain {
    public static void main(String[] args) {
        executeTemplateByAbstractMethod();
        System.out.println("++++++++++++++");
        executeTemplateByCallback();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> Log.d(TestMain.class, "shut down")));
    }

    private static void executeTemplateByAbstractMethod() {
        new MainActivity().templateMethod();
    }

    private static void executeTemplateByCallback() {
        com.study.design.pattern.behavior.template.callback.MainActivity activity =
                new com.study.design.pattern.behavior.template.callback.MainActivity();
        activity.templateGetMethod();
        activity.templatePostMethod();
    }
}
