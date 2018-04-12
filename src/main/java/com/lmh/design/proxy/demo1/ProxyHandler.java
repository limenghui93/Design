package com.lmh.design.proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Created by limenghui on 2018/4/12.
 */
public class ProxyHandler implements InvocationHandler {

    private Object object = null;

    public Object newProxyInstance(Object realObj){
        this.object = realObj;
        Class<?> classType = this.object.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("I'm Proxy, I'm invoking");
        method.invoke(object,args);
        System.out.printf("invoked end!");
        return null;
    }
}
