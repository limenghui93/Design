package com.lmh.design.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by limenghui on 2018/4/12.
 */
public class Test1 {
    public static void main(String[] args) {
        IGameplayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGameplayer proxy = (IGameplayer) Proxy.newProxyInstance(cl,new Class[]{IGameplayer.class},handler);
        proxy.login("张三","password");
        proxy.killBoss();
        proxy.upgrade();

    }
}
