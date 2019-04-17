package com.gupaoedu.vip.pattren;

import com.gupaoedu.vip.pattren.singleton.lazy.LazySimpleSingleton;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 10:37
 */
public class ExcutorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazy = LazySimpleSingleton.getInstance();
        System.out.println(lazy);
    }
}
