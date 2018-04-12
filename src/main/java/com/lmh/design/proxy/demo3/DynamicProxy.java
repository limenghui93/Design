package com.lmh.design.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class DynamicProxy {

    private Object target = null;

    private InvocationHandler handler;

    public DynamicProxy(Object target) {
        Class<? extends Object> c = target.getClass();
        handler = new MyInvocationHandler(target);
        this.target = Proxy.newProxyInstance(c.getClassLoader(),c.getInterfaces(),handler);
    }

    public Object exec(String methodName,Object...args){
        Object result = null;
        Class<?>[] c = null;
        if(args != null){
            c = new Class[args.length];
            int i = 0;
            //获得参数类型
            for(Object o : args){
                c[i] = o.getClass();
                i++;
            }
        }

        try {
            Method method = this.target.getClass().getMethod(methodName,c);
            result = method.invoke(this.target,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
}
