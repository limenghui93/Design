package com.lmh.design.proxy.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        if(true){
            (new BeforeAdvice()).execute();
        }

        return (T) Proxy.newProxyInstance(loader,interfaces,handler);

    }
}
