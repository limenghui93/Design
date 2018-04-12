package com.lmh.design.proxy.demo4;

/**
 * Created by lixiansheng on 2018/4/12.
 */
public class BeforeAdvice implements Advice{

    public void execute() {
        System.out.println("我是前置方法,我被执行了");
    }
}