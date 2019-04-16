package com.gupaoedu.vip.pattern.factory.factorymethod;


import com.gupaoedu.vip.pattern.factory.AppleDrink;
import com.gupaoedu.vip.pattern.factory.IDrink;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:29
 */
public class AppleDrinkFactory implements IDrinkFactory {
    @Override
    public IDrink getInstance() {
        return new AppleDrink();
    }
}
