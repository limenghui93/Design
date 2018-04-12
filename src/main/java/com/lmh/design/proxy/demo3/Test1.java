package com.lmh.design.proxy.demo3;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class Test1 {
    private static DynamicProxy proxy;



    public static void main(String[] args) {
        Subject subject = new RealSubject();
        proxy = new DynamicProxy(subject);
        proxy.exec("doSomething","abc");
    }
}
