package com.lmh.design.proxy.demo1;

/**
 * Created by limenghui on 2018/4/12.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.operate();
    }
}
