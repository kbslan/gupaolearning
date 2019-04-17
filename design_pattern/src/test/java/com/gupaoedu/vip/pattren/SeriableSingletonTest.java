package com.gupaoedu.vip.pattren;

import com.gupaoedu.vip.pattren.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 14:55
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton o1 = null;
        SeriableSingleton o2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o2);
            oos.flush();
            oos.close();

            fis = new FileInputStream("SeriableSingleton.obj");

            ObjectInputStream ois = new ObjectInputStream(fis);
            o1 = (SeriableSingleton)ois.readObject(); //readObject()方法中会判断是否存在readResolve()方法（JDK层面）
            ois.close();
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
