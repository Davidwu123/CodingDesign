package com.study.design.verify.thread;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TestThread
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-25 20:21
 */
public class TestThread {
    private static long count = 1;
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TestThread.class, "Thread.interrupted() " + Thread.interrupted());
                while (!Thread.interrupted()) {
                    Log.d(TestThread.class, "Thread.interrupted() " + Thread.interrupted());
                    count++;
//                    if (count % 100000 == 0) {
                        Log.d(TestThread.class, "invoke thread run");
//                    }
                }

            }
        });
        thread.start();
        Log.d(TestThread.class, "start sleep");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Log.d(TestThread.class, "start end, ready to interrupt");
            thread.interrupt();
            thread.start();
            Log.d(TestThread.class, "interrupt end");
            Log.d(TestThread.class, thread.isAlive());
            Log.d(TestThread.class, thread.isInterrupted());
        }

    }
}
