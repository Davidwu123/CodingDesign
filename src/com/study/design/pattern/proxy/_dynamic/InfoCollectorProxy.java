package com.study.design.pattern.proxy._dynamic;

import com.study.design.common.Log;
import com.study.design.pattern.proxy.InfoCollector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wuwei
 * @title: InfoCollectorProxy
 * @projectName CodingDesign
 * @description:
 * 1.可以封装成一个通用的Proxy类生成器
 * 2.一般proxy类中含有其他模块的逻辑，也可以各自定制生成
 * @date 2020-03-01 14:24
 */
public class InfoCollectorProxy {
    private InfoCollector mCollector;

    public InfoCollectorProxy() {
        mCollector = new InfoCollector();
    }


    /**
     * @param proxiedObj 被代理的实例对象
     * @return 代理类
     */
    public Object createProxy(Object proxiedObj) {
        Class<?>[] interfaces = proxiedObj.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObj);
        return Proxy.newProxyInstance(proxiedObj.getClass().getClassLoader(),
                interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObj;

        public DynamicProxyHandler(Object obj) {
            this.proxiedObj = obj;
        }


        /**
         * 该方法可以给具体业务类增加非本业务的逻辑代码，本类中即为Collector信息
         * 该方法，只要调用到具体业务接口所欲方法都会进入
         * @param proxy
         * @param method
         * @param args
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object methodRet = method.invoke(proxiedObj, args);
            String apiName = proxiedObj.getClass().getName() + ":" + method.getName();
            String argsStr = args != null ? Arrays.toString(args) : "empty";
            String printLog = "apiName is " + apiName + " arg is " + argsStr;
            mCollector.recordRequest(printLog);
            Log.d(InfoCollectorProxy.class, "methodRet " + methodRet);
            return methodRet;
        }
    }
}
