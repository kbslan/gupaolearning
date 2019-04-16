package com.gupaoedu.vip.pattren.singleton.hungry;

/**
 * 饿汉式单例
 * 绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好
 * 缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间,浪费内存
 *
 * 应用场景：适用在单例对象较少的情况
 *
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 19:20
 */
public class HungrySingleton {
    //final修饰初始化后值不能更改
    private static final HungrySingleton SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return SINGLETON;
    }
}
