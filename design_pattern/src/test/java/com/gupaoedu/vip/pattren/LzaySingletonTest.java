package com.gupaoedu.vip.pattren;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 10:25
 */
public class LzaySingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());
        t1.start();
        t2.start();
        System.out.println("Executor End");
    }
}
