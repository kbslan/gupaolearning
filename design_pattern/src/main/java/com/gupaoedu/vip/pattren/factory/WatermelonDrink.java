package com.gupaoedu.vip.pattren.factory;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 10:49
 */
public class WatermelonDrink implements IDrink {
    @Override
    public void make() {
        System.out.println("制作西瓜汁");
    }

    @Override
    public double getPrice() {
        System.out.println("西瓜汁10元");
        return 10.0;
    }
}
