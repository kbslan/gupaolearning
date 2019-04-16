package com.gupaoedu.vip.pattren.singleton.lazy;

/**
 * 懒汉式单例
 *
 * 外部调用时才进行实例化
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 21:43
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){

    }

    public static LazySimpleSingleton getInstance(){
        //这种写法存在线程安全问题
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
