package com.study.design.pattern.behavior.observer.eventbus;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author wuwei
 * @title: AsyncEventBus
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 16:41
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }

    public AsyncEventBus() {
        this(Executors.newSingleThreadExecutor());
    }
}
