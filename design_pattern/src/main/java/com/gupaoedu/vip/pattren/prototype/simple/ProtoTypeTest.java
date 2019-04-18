package com.gupaoedu.vip.pattren.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/18 10:07
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("lanchao");
        List hobbies = new ArrayList<>();
        hobbies.add("吃鸡");
        concretePrototype.setHobbies(hobbies);

//        ConcretePrototypeA copy = concretePrototype.clone();

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(copy);

        System.out.println("克隆对象中引用类型的地址的值：" + copy.getHobbies());
        System.out.println("源对象中引用类型的地址的值：" + concretePrototype.getHobbies());
        System.out.println("对象地址比较：" + (copy.getHobbies() == concretePrototype.getHobbies()));
    }
}
