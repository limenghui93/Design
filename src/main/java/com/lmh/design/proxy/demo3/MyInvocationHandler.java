package com.lmh.design.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        this.before();
        result = method.invoke(this.target,args);
        this.after();
        return result;
    }

    private void before(){
        System.out.println("预处理");
    }

    private void after(){
        System.out.println("后置处理");
    }
}
