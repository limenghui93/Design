package com.lmh.design.proxy.demo4;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class RealSubject implements Subject {
    public void doSomething(String abc) {
        System.out.println("do something>>>>>>>" + abc);
    }
}
