package com.study.design.pattern.singleton;

import com.study.design.common.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: IdGeneratorForMulti
 * @projectName CodingDesign
 * @description: 进程中有限制的多例模式
 * @date 2020-02-22 21:58
 */
public class IdGeneratorForMulti implements IIdGenerator {
    private AtomicLong mAtomicLong = new AtomicLong(0);
    private String mString;
    private static final int DEFAULT_COUNT = 3;
    private static final Map<Integer, IdGeneratorForMulti> sMap = new HashMap<>();//在进程共享内存中

    //在类加载时就已经执行了，比构造函数还早
    static {
        //非延迟加载，如果要延迟加载需要用到并发HashMap(因为需要读写)
        sMap.put(0, new IdGeneratorForMulti("0"));
        sMap.put(1, new IdGeneratorForMulti("1"));
        sMap.put(2, new IdGeneratorForMulti("2"));
    }

    private IdGeneratorForMulti(String arg) {
        mString = arg;
        Log.d(IdGeneratorForMulti.class, "arg is " + arg);
    }


    public static IdGeneratorForMulti getInstance(int id) {
        IdGeneratorForMulti retInstance = sMap.get(id);
        Log.d(IdGeneratorForMulti.class, "id " + id + " retInstance " + retInstance.toString());
        return retInstance;
    }

    public static IdGeneratorForMulti getRandomInstance() {
        Random random = new Random();
        return sMap.get(random.nextInt(DEFAULT_COUNT) + 1);
    }

    public String getString() {
        return mString;
    }

    @Override
    public long getId() {
        return mAtomicLong.incrementAndGet();
    }
}
