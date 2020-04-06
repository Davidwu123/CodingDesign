package com.study.design.pattern.behavior.observer.eventbus;

import com.study.design.common.Log;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author wuwei
 * @title: ObserverRegistry
 * @projectName CodingDesign
 * @description: 观察者注册表，作为全局消息转发机制中转模块
 * @date 2020-03-17 08:55
 */
public class ObserverRegistry {
    private ConcurrentMap<Class, CopyOnWriteArraySet<ObserverAction>> mClassCollectionConcurrentMap = new ConcurrentHashMap<>();

    public void register(Object object) {
        //先按照obj找出该类中注册event和method所有的映射关系,然后加入到全局的map中
        Map<Class, Collection<ObserverAction>> classCollectionMap = getEventTypeAndAllObserverActionMap(object);
//        Log.d(ObserverRegistry.class, "class register map " + classCollectionMap.toString());
        //按照key,val取出
        for (Map.Entry<Class, Collection<ObserverAction>> entry : classCollectionMap.entrySet()) {
            Class eventType = entry.getKey();
            Collection<ObserverAction> observerActions = entry.getValue();
            //判断全局map是否含有该event对应的集合
            CopyOnWriteArraySet copyOnWriteArraySet = mClassCollectionConcurrentMap.get(eventType);
            if (copyOnWriteArraySet == null) {
                mClassCollectionConcurrentMap.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
                copyOnWriteArraySet = mClassCollectionConcurrentMap.get(eventType);
            }
            copyOnWriteArraySet.addAll(observerActions);
        }
    }


    /**
     * 获取某个类中根据eventType作为key，(对象，方法)作为集合的map。表示一个类中支持多个eventType，且能够找到对应的执行函数
     * @param obj
     * @return
     */
    private Map<Class, Collection<ObserverAction>> getEventTypeAndAllObserverActionMap(Object obj) {
        Map<Class, Collection<ObserverAction>> retMap = new HashMap<>();//局部map用最简单的即可，全局的用并发map
        for (Method method : getAnnotatedMethods(obj)) {
            Class eventType = method.getParameterTypes()[0];
            if (!retMap.containsKey(eventType)) {//在同一个类中,可能多个接口注册了同一个参数类型
                retMap.put(eventType, new ArrayList<>());
            }
            retMap.get(eventType).add(new ObserverAction(obj, method));
        }
        return retMap;
    }



    /**
     * 获取obj中含有Subscribe类注解的且参数只有一个的方法集合(可能一个类有多个方法注解了)
     *
     * @param obj
     * @return
     */
    private List<Method> getAnnotatedMethods(Object obj) {
        List<Method> retMethods = new ArrayList<>();
        Class clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();//获取所有方法，不限访问修饰符(public,private,protected,default..)
        for (Method method : methods) {
            if (method.isAnnotationPresent(Subscribe.class)) {//只筛选出被注解的方法，至于是否是指定类型参数，由上层调用者判断
                Class[] paramsTypes = method.getParameterTypes();
                //如果不满足就会抛出错误
                Preconditions.checkArgument(paramsTypes.length == 1,
                        "Method %s has @Subscribe annotation but has %s parameters." +
                                "Subscriber methods must have exactly 1 parameter.",
                        method, paramsTypes.length);
                retMethods.add(method);
            }
        }
        return retMethods;
    }


    /**
     * 对外提供的list集合
     * @param event
     * @return
     */
    public List<ObserverAction> getMatchedObserveActions(Object event) {
        List<ObserverAction> retList = new ArrayList<>();
        //如果不需要返回event的子类，则直接返回map.get(event.getClass())
        Class postEventType = event.getClass();
//        Log.d(ObserverRegistry.class, "current event is " + event.toString());
//        Log.d(ObserverRegistry.class, "map " + mClassCollectionConcurrentMap.toString());
        for (Map.Entry<Class, CopyOnWriteArraySet<ObserverAction>> entry : mClassCollectionConcurrentMap.entrySet()) {
            Class eventType = entry.getKey();
            CopyOnWriteArraySet<ObserverAction> set = entry.getValue();
//            Log.d(ObserverRegistry.class, "current set is " + set.toString());
//            Log.d(ObserverRegistry.class, "postEventType class is " + postEventType.getSimpleName());
//            Log.d(ObserverRegistry.class, "eventType class is " + eventType.getSimpleName());
//            Log.d(ObserverRegistry.class, "postEventType class is eventType supperClass " + postEventType.isAssignableFrom(eventType));

            //找出传入event类型的父类作为参数的方法，然后传入该方法中(子类覆盖父类参数)
            if (eventType.isAssignableFrom(postEventType)) {//postEventType是eventType的父类或者就是eventType
                retList.addAll(set);
            }
        }
//        Log.d(ObserverRegistry.class, "final get matched list " + retList.toString());
        return retList;
    }
}
