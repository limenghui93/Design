package com.lmh.design.proxy.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
