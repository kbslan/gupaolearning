package com.gupaoedu.vip.pattern.factory;

/**
 * 饮料接口
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 10:45
 */
public interface IDrink {
    /**
     * 饮料制作
     */
    void make();

    /**
     * 价格
     * @return
     */
    double getPrice();
}
