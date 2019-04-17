package com.gupaoedu.vip.pattren.singleton.register;

/**
 * 枚举式单例（注册式单例）
 * 从JDK层面就保证了枚举类型不会被反序列化和反射破坏单例
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 16:05
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
