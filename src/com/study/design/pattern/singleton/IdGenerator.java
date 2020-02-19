package com.study.design.pattern.singleton;

import com.study.design.common.Log;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: IdGenerator
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-19 11:01
 */
public class IdGenerator {
    private static AtomicLong mAtomicLong = new AtomicLong(0);

    /**
     * 【饿汉式】：在类加载时就已经创建好了，且该类的构造函数也执行好了，执行了一次
     *
     * 1.创建过程是线程安全(多线程调用问题)：没调用之前就已经创建好了
     * 2.不支持延迟加载：类加载实例就创建好了，不是用的时候才创建
     * 弊端(不一定坏处，真正场景还是提前初始化耗时操作较好)：初始化构造函数时间长；成员变量占用内存多
     * 3.getInstance()方法高性能：只有读取实例操作，且读取操作没有线程安全问题，不需要加锁保证读写一致
     */
    private static final IdGenerator sInstance1 = new IdGenerator();


    /**
     * 【懒汉式】：用到的时候才创建和初始化
     *
     * 1.创建的时候在方法上加了锁，是线程安全的
     * 2.支持延迟加载，用到的时候才创建和加载
     * 3.getInstance()方法上加了锁，会影响性能
     * 弊端：如果频繁使用，每使用一次都会获取/释放锁，性能?
     */
    private static IdGenerator sInstance2;


    /**
     * 【双重检测】：既支持延迟加载，有支持高性能的getInstance方法调用
     *
     * 1.创建时在方法里面加了锁，是线程安全的
     * 2.支持延迟加载：在调用时候创建
     * 3.getInstance()方法在实例非空时没有锁，性能较高
     *
     * PS：volatile关键字为了禁止指令重排(指令重排：会出现thread-1 sInstance3已经new成功,
     * 但释放锁后thread-2就开始获取到并调用了，但是初始化构造函数还没有执行完，加上该关键字就可以禁止指令重排)
     */
    private static volatile IdGenerator sInstance3;



    static {
        Log.d(IdGenerator.class, "static code");
    }



    private IdGenerator() {
        Log.d(IdGenerator.class, "construct function");
    }


    //饿汉式
    public static IdGenerator getInstance1() {
        return sInstance1;
    }

    //懒汉式
    public static synchronized IdGenerator getInstance2() {
        if (sInstance2 == null) {
            sInstance2 = new IdGenerator();
        }
        return sInstance2;
    }

    //双重检测
    public static IdGenerator getInstance3() {
        if (sInstance3 == null) {
            /**
             * 多个同时进入后，第一个调用线程获取锁，第二个线程等待,
             * 等待Nms后(Nms内第一个线程进入，为空则创建实例了)，第一线程释放锁
             * 第二个线程获取锁，并进入，进入后非空则不创建
             */
            synchronized (IdGenerator.class) {//锁加在类上面，表示多个线程进入时都是操作同一个类锁。如果是对象锁(和调用线程相关)，则不能保证是同一个
                if (sInstance3 == null) {
                    sInstance3 = new IdGenerator();
                }
            }
        }
        return sInstance3;
    }




    public long getId() {
        Log.d(IdGenerator.class, "id: " + sInstance1.toString());
        return mAtomicLong.incrementAndGet();
    }

}
