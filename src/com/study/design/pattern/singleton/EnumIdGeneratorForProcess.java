package com.study.design.pattern.singleton;

import com.study.design.common.Log;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: EnumIdGenerator
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-20 09:54
 */
public enum EnumIdGeneratorForProcess implements IIdGenerator{
    /**
     * 枚举类实现单例：
     * 1.实例的创建线程安全：由JVM保证
     * 2.支持延迟加载：使用实例时候才会执行
     * 3.获取实例没有锁，无性能影响
     */
    INSTANCE{
        @Override
        public long getId() {
            Log.d(EnumIdGeneratorForProcess.class, "enum super getId");
            return super.getId();
        }

        @Override
        public void test() {
            Log.d(EnumIdGeneratorForProcess.class, "override test func");
        }
    };


    EnumIdGeneratorForProcess() {
        Log.d(EnumIdGeneratorForProcess.class, "枚举类构造函数初始化");
    }

    private AtomicLong mAtomicLong = new AtomicLong(0);

    public long getId() {
        Log.d(EnumIdGeneratorForProcess.class, "111");
        return this.mAtomicLong.incrementAndGet();
    }

    public abstract void test();

}
