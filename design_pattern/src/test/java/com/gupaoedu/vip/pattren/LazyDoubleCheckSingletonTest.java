package com.gupaoedu.vip.pattren;


import com.gupaoedu.vip.pattren.singleton.lazy.LazyDoubleCheckSingleton;

import java.lang.reflect.Constructor;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 14:35
 */
public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args) {
        try{
            Class clazz = LazyDoubleCheckSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            //强行访问
            c.setAccessible(true);
            //初始化
            LazyDoubleCheckSingleton lazy1 = (LazyDoubleCheckSingleton) c.newInstance();

            //再次调用相当于调用了两次
            LazyDoubleCheckSingleton lazy2 = (LazyDoubleCheckSingleton) c.newInstance();

            //正常访问渠道
            LazyDoubleCheckSingleton lazy3 = LazyDoubleCheckSingleton.getInstance();

            LazyDoubleCheckSingleton lazy4 = LazyDoubleCheckSingleton.getInstance();
            System.out.println(lazy1 == lazy2);
            System.out.println(lazy1 == lazy3);
            System.out.println(lazy2 == lazy3);
            System.out.println(lazy3 == lazy4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
