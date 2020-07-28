package com.study.design.verify.thead_pool;

import java.util.concurrent.*;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-05-23 13:47
 */
public class TestMain {
    public static void main(String[] args) {
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
        task = new FutureTask(new Runnable() {
            @Override
            public void run() {

            }
        }, "");
        task.run();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

            }
        }, 500, 500, TimeUnit.MILLISECONDS);
    }
}
