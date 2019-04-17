package com.gupaoedu.vip.pattren;

import com.gupaoedu.vip.pattren.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 * 解决方案：在私有的构造方法中判断是否已经实例化了
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 14:28
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try{
            Class clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            //强行访问
            c.setAccessible(true);
            //初始化
            LazyInnerClassSingleton lazy1 = (LazyInnerClassSingleton) c.newInstance();

            //再次调用相当于调用了两次
            LazyInnerClassSingleton lazy2 = (LazyInnerClassSingleton) c.newInstance();

            //正常访问渠道
            LazyInnerClassSingleton lazy3 = LazyInnerClassSingleton.getInstance();

            LazyInnerClassSingleton lazy4 = LazyInnerClassSingleton.getInstance();
            System.out.println(lazy1 == lazy2);
            System.out.println(lazy1 == lazy3);
            System.out.println(lazy2 == lazy3);
            System.out.println(lazy3 == lazy4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
