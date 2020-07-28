package com.study.design.verify;

//import com.study.design.common.Log;

import com.study.design.verify.interfaces.ICallback;

import java.util.Collections;
import java.util.Observable;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 验证类加载变量执行顺序
 * @date 2020-04-01 20:45
 */
public class TestMain implements ICallback {
//    private CustomFile customFile = new CustomFile();
    static {
//        Log.d(TestMain.class, "TestMain static 1");
    }

    {
//        Log.d(TestMain.class, "TestMain no static 5");
    }

    public TestMain() {
//        Log.d(TestMain.class, "TestMain constructor 6");
    }

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.doIt();
        String ss = "www";
        ss.compareTo("w");
        //new TestMain的操作：
        //1.类加载器将TestMain加载至JVM内存中
        //2.由于静态代码块在类加载之后就立刻执行，所以执行该类的静态代码块/静态变量
        //3.静态的加载完开始加载非静态的
        //4.按照代码撰写顺序，开始加载new CustomFile()
        //5.CustomFile customFile = new CustomFile()表示该类加载一直执行到将实例对
        // 象赋值给customFile这个引用变量，即一直执行到构造函数结束
        //6.执行TestMain的非静态代码块
        //7.执行TestMain的构造函数
        //ps：非静态代码块要在构造函数之前执行，否则构造函数中的变量引用失败，或者没有初始化赋值的值，导致计算结果异常
    }

    @Override
    public void test() {

    }
}
