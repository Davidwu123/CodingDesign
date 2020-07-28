package com.study.design.verify.lock;

import com.study.design.common.Log;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wuwei
 * @title: ObjectLock
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-17 19:56
 */
public class ObjectLock {
    public static void main(String[] args) {
        executeObject();
    }

    private static void executeObject() {
        Object obj = new Object();
        Log.d(ObjectLock.class, "wait before in main");
        new Thread(new Runnable() {
            @Override
            public void run() {
                //blocked表示有其他线程占用锁，还不能进入同步代码块，属于被动阻塞
                //wait为同步代码块主动调用wait，释放当前锁对象，等待被唤醒
                for (int i = 0; i < 5; i++) {
                    synchronized (obj) {

                        Log.d(ObjectLock.class, "run t1 wait before");
                        try {
                            Log.d(ObjectLock.class, "run t1 wait before ww");
                            obj.wait();
                            Log.d(ObjectLock.class, "消费");
                            obj.notifyAll();
                            Log.d(ObjectLock.class, "run t1 wait after ww");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Log.d(ObjectLock.class, "run t1 wait after");
                    }
                }
            }
        }, "inner-thread1").start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (obj) {
//                    Log.d(ObjectLock.class, "run t3 wait before");
//                    try {
//                        Log.d(ObjectLock.class, "run t3 wait before ww");
//                        obj.wait();
//                        Log.d(ObjectLock.class, "run t3 wait after ww");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    Log.d(ObjectLock.class, "run t3 wait after");
//                }
//            }
//        }, "inner-thread3").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(ObjectLock.class, "run t2 notify before");
                for (int i = 0; i < 5; i++) {
                    synchronized (obj) {
                    //有问题是因为t1和t2竞争锁是非公平的
                        try {
                            Thread.sleep(1000);
                            Log.d(ObjectLock.class, "run t2 notify before, ww");
                            obj.notifyAll();
                            Log.d(ObjectLock.class, "生产");
                            obj.wait();
                            Log.d(ObjectLock.class, "run t2 notify after, ww");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                Log.d(ObjectLock.class, "run t2 notify after");
            }
        }, "inner-thread2").start();


    }
}
