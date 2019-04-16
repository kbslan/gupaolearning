package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.OrangeJuiceDrink;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:29
 */
public class OrangeJuiceDrinkFactory implements IDrinkFactory {
    @Override
    public IDrink getInstance() {
        return new OrangeJuiceDrink();
    }
}
