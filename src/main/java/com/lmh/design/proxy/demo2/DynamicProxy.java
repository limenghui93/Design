package com.lmh.design.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by limenghui on 2018/4/12.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        T newProxyInstance = (T) Proxy.newProxyInstance(loader,interfaces, h);
        return newProxyInstance;
    }
}
