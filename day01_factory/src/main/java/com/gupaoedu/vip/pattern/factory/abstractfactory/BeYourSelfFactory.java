package com.gupaoedu.vip.pattern.factory.abstractfactory;


import com.gupaoedu.vip.pattern.factory.DoubleSkinMilk;
import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.ISweetmeats;
import com.gupaoedu.vip.pattern.factory.OrangeJuiceDrink;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 14:43
 */
public class BeYourSelfFactory implements IDrinkFactory {
    @Override
    public IDrink createDirnk() {
        return new OrangeJuiceDrink();
    }

    @Override
    public ISweetmeats createSweetmeats() {
        return new DoubleSkinMilk();
    }
}
