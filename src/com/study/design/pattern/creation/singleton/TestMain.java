package com.study.design.pattern.creation.singleton;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-19 11:02
 */
public class TestMain {

    /**
     * 不同范围的单例不一样
     * 1.进程唯一单例：只初始化了一次实例，该实例对象存储在进程的共享内存空间中
     * 2.线程唯一单例(线程间不唯一，即同一进程下的线程每个都各自的实例对象)：管理这么多的对象的映射表还是要在进程的共享内存中
     * 3.集群唯一单例
     * 4.多例模式(可以自己维护多实例；枚举多值也是一种多实例的实现，即每个枚举值即为各自独立的实例对象)
     */


    public static void main(String[] arg) {

//        new Thread(() -> Log.d(TestMain.class, "run thread 1" + "\t" + IdGeneratorForProcess.getInstance4().getId()), "thread-1").start();
//
//        new Thread(()-> Log.d(TestMain.class, "run thread 2" + "\t" + IdGeneratorForProcess.getInstance4().getId()), "thread-2").start();
//
//        new Thread(() -> Log.d(TestMain.class, "run thread 3" + "\t" + EnumIdGeneratorForProcess.INSTANCE.getId()), "thread-3").start();
//
//        IIdGenerator iIdGenerator = IdGeneratorForProcess.getInstance1();
//        getCustomId(iIdGenerator);//该方式虽然可以解决多态和抽象的功能，但是不是佷"友好"，易读性较差(有些人看不懂)
//
//        new Thread(() -> Log.d(TestMain.class, "run thread 4 " + IdGeneratorForThread.getInstance().getId()), "thread-4").start();
//        new Thread(() -> Log.d(TestMain.class, "run thread 5 " + IdGeneratorForThread.getInstance().getId()), "thread-5").start();
//        new Thread(() -> Log.d(TestMain.class, "run thread 6 " + IdGeneratorForThread.getInstance().getId()), "thread-6").start();


        new Thread(() -> Log.d(TestMain.class, "run thread 7, id is 0" + IdGeneratorForMulti.getInstance(0).getString()), "thread-7").start();
        new Thread(() -> Log.d(TestMain.class, "run thread 8, id is 1 " + IdGeneratorForMulti.getInstance(1).getString()), "thread-8").start();
        new Thread(() -> Log.d(TestMain.class, "run thread 9, id is 2 " + IdGeneratorForMulti.getInstance(2).getString()), "thread-9").start();
        new Thread(() -> Log.d(TestMain.class, "run thread 10, id is 1 " + IdGeneratorForMulti.getInstance(1).getString()), "thread-10").start();
        new Thread(() -> Log.d(TestMain.class, "run thread 11, id is 0 " + IdGeneratorForMulti.getInstance(0).getString()), "thread-11").start();
        new Thread(() -> Log.d(TestMain.class, "run thread 12, random " + IdGeneratorForMulti.getRandomInstance().getString()), "thread-12").start();


    }

    private static void getCustomId(IIdGenerator iIdGenerator) {
        Log.d(TestMain.class, "custom get id: " + iIdGenerator.getId());
    }
}
