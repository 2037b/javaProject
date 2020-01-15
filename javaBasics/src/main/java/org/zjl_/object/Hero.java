package org.zjl_.object;

/*
隐藏，就是子类覆盖父类的类方法;
 */
public class Hero {
    static void battlewin() {
        System.out.println("Hero battle win");
    }

    public static void main(String[] args) {
        Hero.battlewin();
        ADHero.battlewin();
        Hero h = new ADHero();

        // 调用父类方法，因为是静态方法，和类是否实例化无关，区别于 覆盖;
        h.battlewin();
    }
}

class ADHero extends Hero {

    static void battlewin() {
        System.out.println("ADHero battle win");
    }
}
