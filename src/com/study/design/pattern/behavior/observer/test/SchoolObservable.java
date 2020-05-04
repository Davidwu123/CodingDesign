package com.study.design.pattern.behavior.observer.test;

import com.study.design.common.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wuwei
 * @title: SchoolObservable
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-12 09:17
 */
public class SchoolObservable {
    private List<IObserver> mList = new ArrayList<>();
    private ExecutorService mExecutorService;

    public SchoolObservable() {
        mExecutorService = Executors.newSingleThreadExecutor();
    }

    public void registerObserver(IObserver observer) {
        if (!mList.contains(observer)) {
            mList.add(observer);
        }
    }

    public void unregisterObserver(IObserver observer) {
        mList.remove(observer);
    }

    public void sendMsg(String msg) {
        long start = System.currentTimeMillis();
        Log.d(SchoolObservable.class, "before send msg");
        for (IObserver observer : mList) {
//            mExecutorService.execute(new Runnable() {
//                @Override
//                public void run() {
                    msg = observer.handleMsg(msg);
//                }
//            });
        }
        Log.d(SchoolObservable.class, "final msg is " + msg);

        long end = System.currentTimeMillis();
        long delta = end - start;
        Log.d(SchoolObservable.class, "send msg cost " + delta + "ms");
    }
}
