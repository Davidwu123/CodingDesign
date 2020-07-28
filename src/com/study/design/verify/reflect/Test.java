package com.study.design.verify.reflect;

import com.study.design.common.Log;

import java.lang.reflect.Field;

/**
 * @author wuwei
 * @title: Test
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-06-15 10:42
 */
public class Test {
    public static void main(String[] a) {
        Class clazz = Topic.class;
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            try {
                Log.e(Test.class, field.get(clazz));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
