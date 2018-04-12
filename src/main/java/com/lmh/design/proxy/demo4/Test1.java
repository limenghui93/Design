package com.lmh.design.proxy.demo4;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class Test1 {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamiProxy.newProxyInstance(subject);
        proxy.doSomething("写程序");
    }
}
