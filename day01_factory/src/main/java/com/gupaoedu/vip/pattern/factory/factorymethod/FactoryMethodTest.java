package com.gupaoedu.vip.pattern.factory.factorymethod;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:30
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IDrinkFactory factory = new WatermelonDrinkFactory();
        factory.getInstance().make();

        factory = new OrangeJuiceDrinkFactory();
        factory.getInstance().getPrice();
    }
}
