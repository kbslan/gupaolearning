package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.ISweetmeats;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 14:45
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IDrinkFactory factory = new StarbucksFactpry();
        IDrink drink = factory.createDirnk();
        drink.make();
        drink.getPrice();

        ISweetmeats sweetmeats = factory.createSweetmeats();
        sweetmeats.make();

        factory = new BeYourSelfFactory();
        drink = factory.createDirnk();
        drink.make();
        drink.getPrice();

        sweetmeats = factory.createSweetmeats();
        sweetmeats.make();
    }
}
