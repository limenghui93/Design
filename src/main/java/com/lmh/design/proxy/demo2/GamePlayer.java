package com.lmh.design.proxy.demo2;

/**
 * Created by limenghui on 2018/4/12.
 */
public class GamePlayer implements IGameplayer{
    private String name = "";


    public GamePlayer(String name){
        this.name = name;
    }

    public void login(String user, String password) {
        System.out.println("登录名"+user +"的用户"+this.name+"登陆成功!");
    }

    public void killBoss(){
        System.out.println("this.name" + "打野怪");
    }

    public void upgrade() {
        System.out.println(this.name+"又升级了");
    }


}
