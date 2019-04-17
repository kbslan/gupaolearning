package com.gupaoedu.vip.pattren.singleton.threadlocal;

/**
 * ThreadLocal单例模式
 * 伪线程安全，在同一个线程内是安全的
 *
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 20:04
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
