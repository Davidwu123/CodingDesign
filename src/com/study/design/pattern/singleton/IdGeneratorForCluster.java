package com.study.design.pattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: IdGeneratorForCluster
 * @projectName CodingDesign
 * @description: 集群唯一单例(需要将实例存储在外部磁盘空间中，进程读取时需要进行锁操作，同时用完需要删除内存中的实例对象)
 * @date 2020-02-22 21:49
 */
public class IdGeneratorForCluster implements IIdGenerator {
    private AtomicLong mAtomicLong = new AtomicLong(0);


    //TODO ...

    @Override
    public long getId() {
        return mAtomicLong.incrementAndGet();
    }
}
