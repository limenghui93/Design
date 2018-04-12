package com.lmh.design.proxy.demo2;

/**
 * Created by limenghui on 2018/4/12.
 */
public class Test2 {
    public static void main(String[] args) {
        IGameplayer player = new GamePlayer("张三");
        GamePlayIH proxy  = new GamePlayIH(player);

        String str[] = new String[] {"张三","password"};
        Class<?> type[] = {String.class,String.class};

        try {
            proxy.invoke(null,player.getClass().getMethod("login", type),str);
            proxy.invoke(null,player.getClass().getMethod("killBoss", null),null);
            proxy.invoke(null,player.getClass().getMethod("upgrade", null),null);

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
