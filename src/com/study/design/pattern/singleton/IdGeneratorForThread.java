package com.study.design.pattern.singleton;

import com.study.design.common.Log;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: IdGenerator2
 * @projectName CodingDesign
 * @description: 实现线程唯一的单例(即线程间不唯一)
 * @date 2020-02-22 21:05
 */
public class IdGeneratorForThread implements IIdGenerator{
    private AtomicLong mAtomicLong = new AtomicLong(10);

    private static final ConcurrentHashMap<Long, IdGeneratorForThread> sInstanceMap = new ConcurrentHashMap<>();

    public static IdGeneratorForThread getInstance() {
        Long tId = Thread.currentThread().getId();
        String tName = Thread.currentThread().getName();
        sInstanceMap.putIfAbsent(tId, new IdGeneratorForThread());
        IdGeneratorForThread retInstance = sInstanceMap.get(tId);
        Log.d(IdGeneratorForThread.class, "tName is :" + tName +
                " tid is :" + tId + " instance is " + retInstance.toString()) ;
        return retInstance;
    }

    public long getId() {
        return mAtomicLong.incrementAndGet();
    }
}
