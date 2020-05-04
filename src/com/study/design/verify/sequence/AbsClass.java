package com.study.design.verify.sequence;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: AbsClass
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-02 20:26
 */
public class AbsClass {
    static String soName;
    //load so 只能放在static里面，否则会加载多次
    {
        Log.d(AbsClass.class, "no static code");
        try {
            Log.d(AbsClass.class, "soName " + soName);
//            System.load(soName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.d(AbsClass.class, "finally");
        }
    }
}
