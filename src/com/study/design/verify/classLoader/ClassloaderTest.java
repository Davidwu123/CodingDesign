package com.study.design.verify.classLoader;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: ClassloaderTest
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-22 11:26
 */
public class ClassloaderTest {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path");
//        Log.d(ClassloaderTest.class, "class path: " + path);
        String[] strings = path.split(":");
        for (String s : strings) {
            System.out.println("class path " + s);
        }
        System.out.println("+++++++++++++++++");
        System.out.println("+++++++++++++++++");

        String extPath = System.getProperty("java.ext.dirs");
//        Log.d(ClassloaderTest.class, "s path: " + extPath);
        String[] stringsExt = extPath.split(":");
        for (String s : stringsExt) {
            System.out.println("ext dir " + s);
        }

        System.out.println("+++++++++++++++++");
        System.out.println("+++++++++++++++++");
        String bootstrapPath = System.getProperty("sun.boot.class.path");
//        Log.d(ClassloaderTest.class, "bootstrap path: " + bootstrapPath);
        String[] stringsBootstrap = bootstrapPath.split(":");
        for (String s : stringsBootstrap) {
            System.out.println("bootstrap class path " + s);
        }


        /**
         * 检测是否已经加载 findLoadedClass
         * 没有，找父类加载 parent/bootstrap load
         * 没有自己加载 findClass
         *
         * ClassloaderTest属于app，app自己检测没加载
         * 找父类ext加载
         * ext自检没加载过，且ext父类为null，找bootstrap加载
         * bootstrap自检没加载过，且父类为null,自己就是bootstrap，然后自己加载
         * bootstrap find 为null(不在上面打印出来的里面)
         * ext由于父类返回的是null，然后findClass,也不在ext文件夹里面，返回null
         * app由于父类返回的是null,然后findClass，发现在自己的列表里面，就自己加载
         *
         */

        //application classLoader
        Log.d(ClassloaderTest.class, "current loader " + ClassloaderTest.class.getClassLoader().toString());
        //extensions classLoader
        Log.d(ClassloaderTest.class, "current parent loader " + ClassloaderTest.class.getClassLoader().getParent());
        //bootstrap classLoader
        Log.d(ClassloaderTest.class, "current parent parent loader " + ClassloaderTest.class.getClassLoader().getParent().getParent());

    }
}
