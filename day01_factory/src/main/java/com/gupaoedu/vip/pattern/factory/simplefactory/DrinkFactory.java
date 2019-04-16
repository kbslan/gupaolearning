package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.AppleDrink;
import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.OrangeJuiceDrink;
import com.gupaoedu.vip.pattern.factory.WatermelonDrink;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * 简单工厂：
 * 优点：只需要传入一个正确的参数，就可以获取到所需要的对象而无需关心其创建细节
 *
 * 缺点：1.工厂类职责过重（过多的if else 逻辑判断），增加新的产品时需要修改工厂类的判断逻辑，违背了开闭原则
 *      2.不易于扩展过于复杂的产品结构
 *
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 10:50
 */
public class DrinkFactory {
    public IDrink getInstance(String drinkName) {
        if (StringUtils.isEmpty(drinkName)) {
            System.err.println("Drink name can not be null");
            return null;
        }
        if (Objects.equals("orange", drinkName)) {
            return new OrangeJuiceDrink();
        } else if (Objects.equals("watermelon", drinkName)) {
            return new WatermelonDrink();
        } else if (Objects.equals("apple", drinkName)) {
            return new AppleDrink();
        } else {
            System.err.println("The " + drinkName + " drink not found!");
            return null;
        }
    }

    public IDrink getInstance(Class<?> clazz){
        try {
            if(null != clazz){
                return (IDrink) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
