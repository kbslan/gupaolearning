package com.gupaoedu.vip.pattern.factory.factorymethod;


import com.gupaoedu.vip.pattern.factory.IDrink;

/**
 * 工厂方法模式：
 * 优点：1.使用者只需要关系所需要产品对应的工厂，无需关心创建细节
 *      2.新增产品时也符合开闭原则（不会修改原有的代码，只需要新建对应的产品和工厂实现类即可），提高了系统的可扩展性
 * 缺点：1.类的个数容易过多，增加了代码的接口复杂度
 *      2.增加了系统的抽象性和理解难度
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/16 11:27
 */
public interface IDrinkFactory {
    IDrink getInstance();
}
