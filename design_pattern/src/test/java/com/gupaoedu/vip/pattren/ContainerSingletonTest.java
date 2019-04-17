package com.gupaoedu.vip.pattren;

import com.gupaoedu.vip.pattren.singleton.register.ContainerSingleton;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/17 17:56
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {

        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getBean(Pojo.class.getName());
                    System.out.println(System.currentTimeMillis() + ":" +obj);
                }
            },20,10);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
