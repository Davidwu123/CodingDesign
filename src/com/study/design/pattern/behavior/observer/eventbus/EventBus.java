package com.study.design.pattern.behavior.observer.eventbus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author wuwei
 * @title: EventBus
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-17 15:01
 */
public class EventBus {
    private ObserverRegistry mObserverRegistry = new ObserverRegistry();
    private Executor mExecutor;

    public EventBus(Executor executor) {
        this.mExecutor = executor;
    }

    public EventBus() {
        this(MoreExecutors.directExecutor());
    }

    public void register(Object object) {
        mObserverRegistry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> actionList = mObserverRegistry.getMatchedObserveActions(event);
        for (ObserverAction observerAction : actionList) {
            mExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }
}
