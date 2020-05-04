package com.study.design.verify.sequence;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TestClass
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-02 20:27
 */
public class TestClass extends AbsClass {
    static {
        soName = "ss";
        Log.d(TestClass.class, "static code");
    }

    public static void main(String[] arg) {
        TestClass testClass = new TestClass();
        TestClass testClass2 = new TestClass();
    }
}
