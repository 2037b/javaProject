package org.zjl_.banyuan.day_03.extends_04.homework_01;

public class Cuboid extends Rectangular {
    double height;

    double getVolume() {
        return getArea() * height;
    }
}
