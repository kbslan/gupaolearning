package com.gupaoedu.vip.pattren.factory;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 10:48
 */
public class AppleDrink implements IDrink{
    @Override
    public void make() {
        System.out.println("制作苹果汁");
    }

    @Override
    public double getPrice() {
        System.out.println("苹果汁6元");
        return 6.0;
    }
}
