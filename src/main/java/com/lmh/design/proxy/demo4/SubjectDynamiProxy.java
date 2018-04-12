package com.lmh.design.proxy.demo4;

import java.lang.reflect.InvocationHandler;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class SubjectDynamiProxy extends DynamicProxy {

    public static <T> T newProxyInstance(T subject){
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader,classes,handler);
    }
}
