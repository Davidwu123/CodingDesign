package com.study.design.verify.classLoader;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wuwei
 * @title: CustomClassLoaderTest
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-22 21:25
 */
public class CustomClassLoaderTest {
    private static final String CLASS_PATH = new File("/Users/wuwei/Desktop/").toURI().toString();

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader(CLASS_PATH);
        //通过自定义类加载器实例化自定义类
        try {
            //最终会走到自定义的findClass函数中
            Class clazz = customClassLoader.loadClass("CustomClass");
            Object obj = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("print", null);
            method.setAccessible(true);
            method.invoke(obj);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
