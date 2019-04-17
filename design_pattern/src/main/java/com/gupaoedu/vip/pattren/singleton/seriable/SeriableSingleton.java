package com.gupaoedu.vip.pattren.singleton.seriable;

import java.io.Serializable;

/**
 * 反序列化时导致单例破坏
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 14:41
 */
public class SeriableSingleton implements Serializable {

    private static final long serialVersionUID = 6364180607498870500L;

    private static final SeriableSingleton SINGLETON = new SeriableSingleton();

    private SeriableSingleton(){

    }

    public static SeriableSingleton getInstance(){
        return SINGLETON;
    }

    /**
     * 此方法用于解决反序列化破坏单例，JDK底层实现会判断是否存在此方法，如果存在此方法则反序列化时返回此方法的返回值(Object rep = desc.invokeReadResolve(obj);)，
     * 否则采用new的方式创建新对象返回，这样就破坏了单例
     *
     * 重写readResovle方法只不过是覆盖了反序列化出来的对象，还是创建了两次，只是这发生在JVM层面，相对来说比较安全，之前发序列化出来的对象会被GC回收
     */
    private Object readResolve(){
        return SINGLETON;
    }
}
