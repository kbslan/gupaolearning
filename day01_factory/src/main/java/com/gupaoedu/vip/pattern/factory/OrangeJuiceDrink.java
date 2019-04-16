package com.gupaoedu.vip.pattern.factory;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 10:47
 */
public class OrangeJuiceDrink implements IDrink{
    @Override
    public void make() {
        System.out.println("制作橙汁饮料");
    }

    @Override
    public double getPrice() {
        System.out.println("橙汁8元");
        return 8.0;
    }
}
