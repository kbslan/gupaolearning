package com.gupaoedu.vip.pattren.prototype.simple;

import java.util.List;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/18 10:04
 */
public class ConcretePrototypeA implements IPrototype{

    private int age;//年龄
    private String name; //姓名
    private List hobbies;//爱好

    @Override
    public IPrototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
