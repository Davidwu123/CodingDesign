package com.study.design.pattern.singleton;

import com.study.design.common.Log;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: IdGenerator
 * @projectName CodingDesign
 * @description: 进程唯一的单例
 * @date 2020-02-19 11:01
 */
public class IdGeneratorForProcess implements IIdGenerator{
    private static AtomicLong mAtomicLong = new AtomicLong(0);

    /**
     * 【饿汉式】：在类加载时就已经创建好了，且该类的构造函数也执行好了，执行了一次
     * <p>
     * 1.创建过程是线程安全(多线程调用问题)：没调用之前就已经创建好了
     * 2.不支持延迟加载：类加载实例就创建好了，不是用的时候才创建
     * 弊端(不一定坏处，真正场景还是提前初始化耗时操作较好)：初始化构造函数时间长；成员变量占用内存多
     * 3.getInstance()方法高性能：只有读取实例操作，且读取操作没有线程安全问题，不需要加锁保证读写一致
     */
    private static final IdGeneratorForProcess sInstance1 = new IdGeneratorForProcess(1);


    /**
     * 【懒汉式】：用到的时候才创建和初始化
     * <p>
     * 1.创建的时候在方法上加了锁，是线程安全的
     * 2.支持延迟加载，用到的时候才创建和加载
     * 3.getInstance()方法上加了锁，会影响性能
     * 弊端：如果频繁使用，每使用一次都会获取/释放锁，性能?
     */
    private static IdGeneratorForProcess sInstance2;


    /**
     * 【双重检测】：既支持延迟加载，有支持高性能的getInstance方法调用
     * <p>
     * 1.创建时在方法里面加了锁，是线程安全的
     * 2.支持延迟加载：在调用时候创建
     * 3.getInstance()方法在实例非空时没有锁，性能较高
     * <p>
     * PS：volatile关键字为了禁止指令重排(指令重排：会出现thread-1 sInstance3已经new成功,
     * 但释放锁后thread-2就开始获取到并调用了，但是初始化构造函数还没有执行完，加上该关键字就可以禁止指令重排)
     */
    private static volatile IdGeneratorForProcess sInstance3;


    /**
     * 【静态内部类】
     * <p>
     * 1.创建过程线程安全：在静态内部类加载时就创建并初始化
     * 2.支持延迟加载：获取实例方法时才会触发子类的加载，并进行该类的创建和初始化
     * PS：和饿汉式加载过程正好相反，如果该类占用内存过多/初始化耗时较长，则第一次使用时会有性能问题
     * 3.getInstance()方法没有性能瓶颈
     */
    private static class SingletonHolder {
        static {
            Log.d(SingletonHolder.class, "静态内部类加载");
        }

        private static final IdGeneratorForProcess sInstance4 = new IdGeneratorForProcess(1);
    }


    static {
        Log.d(IdGeneratorForProcess.class, "类加载");
    }


    private IdGeneratorForProcess() {
        Log.d(IdGeneratorForProcess.class, "类初始化");
    }

    private IdGeneratorForProcess(int arg) {
        Log.d(IdGeneratorForProcess.class, "带参数类初始化\t" + arg);
    }


    //饿汉式
    public static IdGeneratorForProcess getInstance1() {
        return sInstance1;
    }

    //懒汉式
    public static synchronized IdGeneratorForProcess getInstance2() {
        if (sInstance2 == null) {
            sInstance2 = new IdGeneratorForProcess();
        }
        return sInstance2;
    }

    //双重检测
    public static IdGeneratorForProcess getInstance3() {
        if (sInstance3 == null) {
            /**
             * 多个同时进入后，第一个调用线程获取锁，第二个线程等待,
             * 等待Nms后(Nms内第一个线程进入，为空则创建实例了)，第一线程释放锁
             * 第二个线程获取锁，并进入，进入后非空则不创建
             */
            synchronized (IdGeneratorForProcess.class) {//一般锁对象或在锁类都可以，但是该方法为静态方法，里面引用的全局变量必须是静态的，且当前类非静态类，不可以作为静态上下文
                if (sInstance3 == null) {
                    sInstance3 = new IdGeneratorForProcess();
                }
            }
        }
        return sInstance3;
    }


    //静态内部类
    public static IdGeneratorForProcess getInstance4() {
        return SingletonHolder.sInstance4;
    }


    public long getId() {
        Log.d(IdGeneratorForProcess.class, "id: " + sInstance1.toString());
        return mAtomicLong.incrementAndGet();
    }


}
