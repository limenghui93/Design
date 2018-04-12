package com.lmh.design.proxy.demo1;

/**
 * Created by limenghui on 2018/4/12.
 */
public class Proxy implements Subject {

    private Subject subject;

    public void operate() {
        before();
        System.out.printf("处理");
        after();
    }

    private void before(){
        System.out.printf("前置处理");
        if(subject == null){
            subject = new RealSubject();
        }
    }

    private void  after(){
        System.out.printf("后置处理");
    }
}
