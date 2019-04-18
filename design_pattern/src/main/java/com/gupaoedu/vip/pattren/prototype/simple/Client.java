package com.gupaoedu.vip.pattren.prototype.simple;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/18 10:09
 */
public class Client {

    public IPrototype startClone(IPrototype concretePrototype){
        return concretePrototype.clone();
    }
}
