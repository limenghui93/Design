package com.lmh.design.proxy.demo1;

/**
 * Created by limenghui on 2018/4/12.
 */
public class RealSubject implements Subject {
    public void operate() {
        System.out.printf("RealSubject");
    }
}
