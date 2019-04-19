package com.gupaoedu.vip.pattren.prototype.homework;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/19 14:40
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        SongFormBean formBean = SongFormBean.getDefault();
        SongEntity songEntity = (SongEntity)formBean.clone();

        System.out.println(songEntity);
        System.out.println(formBean.getSingerArea() == songEntity.getSingerArea());


    }
}
