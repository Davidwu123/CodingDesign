package com.study.design.pattern.creation.prototype;

import com.study.design.common.Log;


/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-07 21:24
 */
public class TestMain {
    public static void main(String[] args) {
        try {
            shallowClone();
            Log.d(TestMain.class, "\n++++++++++\n");
            deepCLone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void deepCLone() {
        FileBean2 fileBean2 = new FileBean2();
        fileBean2.setName("2.txt");
        fileBean2.setSize(2048);
        fileBean2.setCustomBean(new CustomBean(1));
        FileBean2 fileBean2Clone = fileBean2.clone();
        Log.d(TestMain.class, "original2 obj " + fileBean2);
        Log.d(TestMain.class, "clone2    obj " + fileBean2Clone);
        Log.d(TestMain.class, "original2 custom obj " + fileBean2.getCustomBean());
        Log.d(TestMain.class, "clone2   custom  obj " + fileBean2Clone.getCustomBean());
    }

    private static void shallowClone() throws CloneNotSupportedException {
        FileBean fileBean = new FileBean();
        fileBean.setName("1.txt");
        fileBean.setSize(1024);
        fileBean.setCustomBean(new CustomBean(2));
        FileBean fileBeanClone = fileBean.clone();
        Log.d(TestMain.class, "original obj " + fileBean);
        Log.d(TestMain.class, "clone    obj " + fileBeanClone);
        Log.d(TestMain.class, "original custom  obj " + fileBean.getCustomBean());
        Log.d(TestMain.class, "clone custom     obj " + fileBeanClone.getCustomBean());
    }
}
