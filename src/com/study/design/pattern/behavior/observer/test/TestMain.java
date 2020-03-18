package com.study.design.pattern.behavior.observer.test;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-11 20:43
 */
public class TestMain {
    public static void main(String[] args) {
        SchoolObservable schoolObservable = new SchoolObservable();
        schoolObservable.registerObserver(new ParentObserver());
        schoolObservable.registerObserver(new StudentObserver());
        schoolObservable.sendMsg("明天不上学");
        schoolObservable.registerObserver(new TeacherObserver());
        schoolObservable.sendMsg("周一开会");
    }
}
