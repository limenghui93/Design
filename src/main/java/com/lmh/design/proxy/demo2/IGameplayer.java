package com.lmh.design.proxy.demo2;

/**
 * Created by limenghui on 2018/4/12.
 */
public interface IGameplayer {

    //登录游戏
    public void login(String user,String password);

    //杀怪
    public void killBoss();

    //升级
    public void upgrade();
}
