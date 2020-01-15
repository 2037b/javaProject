package org.zjl_.banyuan.day_03.extends_04.homework_01;

public class Test {
    public static void main(String[] args) {
        Cuboid cuboid_01 = new Cuboid();
        cuboid_01.width = 3;
        cuboid_01.length = 5;
        cuboid_01.height = 6;
        System.out.println("长方体底面积为：" + cuboid_01.getArea());
        System.out.println("长方体体积为：" + cuboid_01.getVolume());
    }
}
