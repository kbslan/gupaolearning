package com.gupaoedu.vip.pattren;

import com.gupaoedu.vip.pattren.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 16:07
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        //测试反序列化是否破坏单例：  枚举类型的反序列化不会破坏单例
        EnumSingleton o1 = null;
        EnumSingleton o2 = EnumSingleton.getInstance();
        o2.setData(new Object());

        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o2);
            oos.flush();
            oos.close();

            fis = new FileInputStream("EnumSingleton.obj");

            ObjectInputStream ois = new ObjectInputStream(fis);
            o1 = (EnumSingleton)ois.readObject(); //readObject()方法中会判断是否存在readResolve()方法（JDK层面）
            ois.close();
            System.out.println(o1.getData());
            System.out.println(o2.getData());
            System.out.println(o1.getData() == o2.getData());
        }catch (Exception e){
            e.printStackTrace();
        }

        //测试反射是否会破坏单例：抛出异常，不允许反射创建对象实例

        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton singleton  = (EnumSingleton) c.newInstance("test",666);//查看newInstance源码，发现判断枚举类型，会直接抛出异常，不允许创建实例
            System.out.println(singleton); //java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
