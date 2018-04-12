package com.lmh.design.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by limenghui on 2018/4/12.
 */
public class GamePlayIH implements InvocationHandler{
    Object obj = null;

    public  GamePlayIH(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result  = method.invoke(this.obj,args);
        return result;
    }
}
