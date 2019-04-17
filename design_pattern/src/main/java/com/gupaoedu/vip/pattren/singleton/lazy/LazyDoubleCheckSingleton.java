package com.gupaoedu.vip.pattren.singleton.lazy;

/**
 * 懒汉式单例
 *
 * 双重检查
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 21:46
 */
public class LazyDoubleCheckSingleton {
    //对象实例化过程：
    //1.分配内存给这个对象
    //2.初始化对象
    //3.设置lazy指向刚分配的内存地址
    //4.初次访问对象

    //在多线程中以上步骤转化为jvm指令存在重新排序的问题
    //使用volatile关键字解决指令重排序问题
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){
        //防止反射破坏单例
        if(lazy != null){
            throw  new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
