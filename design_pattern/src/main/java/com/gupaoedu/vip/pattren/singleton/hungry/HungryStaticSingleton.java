package com.gupaoedu.vip.pattren.singleton.hungry;

/**
 * 饿汉式单例
 *
 * 静态块写法
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 21:40
 */
public class HungryStaticSingleton {
    //final修饰初始化后值不能更改
    private static final HungryStaticSingleton SINGLETON;

    static {
        SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return SINGLETON;
    }


}
