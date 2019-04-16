package com.gupaoedu.vip.pattern.factory.abstractfactory;


import com.gupaoedu.vip.pattern.factory.IDrink;
import com.gupaoedu.vip.pattern.factory.ISweetmeats;

/**
 * 抽象工厂
 * 要求所有的子工厂都要实现这个工厂
 *
 * 优点：1.具体的产品在应用层代码隔离，无需关系创建细节
 *      2.将一系列的产品族统一到一起创建
 *
 * 缺点：1.不符合开闭原则，新增一个产品时，所有的工厂都需要修改代码
 *      2.增加了系统的抽象性和理解难度
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:40
 */
public interface IDrinkFactory {
    IDrink createDirnk();

    ISweetmeats createSweetmeats();

}
