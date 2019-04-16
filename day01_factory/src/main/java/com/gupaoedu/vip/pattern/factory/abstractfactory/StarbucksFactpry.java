package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.Cappuccino;
import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.ISweetmeats;
import com.gupaoedu.vip.pattern.factory.WatermelonDrink;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 14:40
 */
public class StarbucksFactpry implements IDrinkFactory {
    @Override
    public IDrink createDirnk() {
        return new WatermelonDrink();
    }

    @Override
    public ISweetmeats createSweetmeats() {
        return new Cappuccino();
    }
}
