package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.WatermelonDrink;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:30
 */
public class WatermelonDrinkFactory implements IDrinkFactory {
    @Override
    public IDrink getInstance() {
        return new WatermelonDrink();
    }
}
