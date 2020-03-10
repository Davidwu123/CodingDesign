package com.study.design.pattern.structure.flyweight.Integer;

import com.study.design.common.Log;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuwei
 * @title: IntegerCache
 * @projectName CodingDesign
 * @description: 比较笨的方法，还可以用弱引用来实现。本类需要附加太多内存。并且还得主动释放
 * 项目中如果不允许内存对象常驻，可以用该种思路(自己封装引用计数/弱引用)
 * @date 2020-03-10 12:13
 */
public class IntegerCache {
    private static final ConcurrentMap<String, Integer> sIntegerMap = new ConcurrentHashMap<>();
    private static final ConcurrentMap<String, AtomicLong> sIntegerRef = new ConcurrentHashMap<>();


    public static Integer getIntegerById(String id) {
        if (!sIntegerMap.containsKey(id)) {
            sIntegerMap.put(id, new Integer(id));
            Log.d(IntegerCache.class, "add new integer to map");
        }
        if (!sIntegerRef.containsKey(id)) {
            sIntegerRef.put(id, new AtomicLong(0));
            Log.d(IntegerCache.class, "add new ref to map");
        }
        sIntegerRef.get(id).incrementAndGet();
        Log.d(IntegerCache.class, "get ref is " + sIntegerRef.toString());
        Log.d(IntegerCache.class, "get integer map is " + sIntegerMap.toString());
        return sIntegerMap.get(id);
    }

    public static void releaseIntegerById(String id) {
        if (sIntegerRef.containsKey(id)) {
            sIntegerRef.get(id).decrementAndGet();
            if (sIntegerRef.get(id).get() <= 0) {
                sIntegerRef.remove(id);
            }
        }
        if (sIntegerMap.containsKey(id) && !sIntegerRef.containsKey(id)) {
            sIntegerMap.remove(id);
        }
        Log.d(IntegerCache.class, "release ref is " + sIntegerRef.toString());
        Log.d(IntegerCache.class, "release integer map is " + sIntegerMap.toString());
    }
}
