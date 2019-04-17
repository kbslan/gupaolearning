package com.gupaoedu.vip.pattren;

import com.gupaoedu.vip.pattren.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 20:07
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                System.out.println(ThreadLocalSingleton.getInstance());
                System.out.println(ThreadLocalSingleton.getInstance());
                System.out.println(ThreadLocalSingleton.getInstance());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                System.out.println(ThreadLocalSingleton.getInstance());
                System.out.println(ThreadLocalSingleton.getInstance());
                System.out.println(ThreadLocalSingleton.getInstance());
            }
        });

        t1.start();
        t2.start();
        System.out.println("End");
    }
}
