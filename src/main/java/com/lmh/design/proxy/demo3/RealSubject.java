package com.lmh.design.proxy.demo3;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class RealSubject implements Subject{

    public void doSomething(String str) {
        System.out.println("doSomething"+str);
    }
}
