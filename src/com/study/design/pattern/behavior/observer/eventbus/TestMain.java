package com.study.design.pattern.behavior.observer.eventbus;


import java.util.Observer;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-16 17:01
 */
public class TestMain {
    public static void main(String[] args) {
        executeEventBus();
        System.out.println("+++++++++++++");
        executeAsyncEventBus();
    }
    private static void executeAsyncEventBus() {
        EventBus eventBus = new AsyncEventBus();
        //x是y父类
        TeacherObserver teacherObserver = new TeacherObserver();
        teacherObserver.handleX(new YMsg("test y"));
        eventBus.register(new StudentObserver());//y
        eventBus.register(new TeacherObserver());//x,z
        eventBus.post(new XMsg("我要测试xMsg"));//只能x接收
        eventBus.post(new YMsg("我要测试yMsg"));//y和父类x都可以接收
        eventBus.post(new ZMsg("我要测试zMsg"));//只能z接收
    }

    private static void executeEventBus() {
        EventBus eventBus = new EventBus();
        //x是y父类
        eventBus.register(new StudentObserver());//y
        eventBus.register(new TeacherObserver());//x,z
        eventBus.post(new XMsg("我要测试xMsg"));//只能x接收
        eventBus.post(new YMsg("我要测试yMsg"));//y和父类x都可以接收
        eventBus.post(new ZMsg("我要测试zMsg"));//只能z接收
    }
}
