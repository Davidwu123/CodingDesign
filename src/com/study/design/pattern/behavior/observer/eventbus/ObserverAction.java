package com.study.design.pattern.behavior.observer.eventbus;

import com.study.design.common.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wuwei
 * @title: ObserverAction
 * @projectName CodingDesign
 * @description: 注册的方法对象,一个注册类可以有多个observerAction
 * @date 2020-03-17 11:04
 */
public class ObserverAction {
    private Object observerObj;
    private Method subscribedMethod;


    public ObserverAction(Object obj, Method method) {
        this.observerObj = Preconditions.checkNotNull(obj);
        this.subscribedMethod = method;
        this.subscribedMethod.setAccessible(true);
    }


    /**
     * 根据传入的参数arg自动执行初始化传入的method方法(已经是符合要求的方法)
     * @param arg
     */
    public void execute(Object arg) {
        try {
//            Log.d(ObserverAction.class, subscribedMethod.getName());
//            Log.d(ObserverAction.class, arg.toString());
            this.subscribedMethod.invoke(observerObj, arg);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ObserverAction{" +
                "observerObj=" + observerObj.toString() +
                ", subscribedMethod=" + subscribedMethod.getName() +
                '}';
    }
}
