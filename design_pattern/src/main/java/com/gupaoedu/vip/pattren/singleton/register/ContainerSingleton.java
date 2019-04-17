package com.gupaoedu.vip.pattren.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例（注册式单例）
 *
 * 优点：对象方便管理，其实也是属于懒加载，存在线程安全问题
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 17:52
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
        }
        return ioc.get(className);
    }
}
