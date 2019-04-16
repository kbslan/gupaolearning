package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.OrangeJuiceDrink;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:04
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        DrinkFactory factory = new DrinkFactory();
        System.out.println("-----------------------------");
        IDrink appleDrink = factory.getInstance("apple");
        appleDrink.make();
        appleDrink.getPrice();

        System.out.println("-----------------------------");
        factory.getInstance("watermelon").getPrice();

        System.out.println("-----------------------------");
        factory.getInstance(OrangeJuiceDrink.class).make();
    }
}
