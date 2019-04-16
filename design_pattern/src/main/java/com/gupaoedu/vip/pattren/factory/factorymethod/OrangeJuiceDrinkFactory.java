package com.gupaoedu.vip.pattren.factory.factorymethod;


import com.gupaoedu.vip.pattren.factory.IDrink;
import com.gupaoedu.vip.pattren.factory.OrangeJuiceDrink;

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
