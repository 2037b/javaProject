package org.zjl_.banyuan.day_03.extends_01;

public class Example {
    {
        System.out.println("我是构造代码块" + a);
    }

    static int a = 3;

    static {
        System.out.println("我是静态代码块" + a);
    }

    public Example() {
        System.out.println("我是构造函数" + a);
    }
}
