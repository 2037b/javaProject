package org.zjl_.banyuan.day_04.extends_exp_03;

public class Inner01 {
    public static void main(String[] args) {
        int c = 2;
        System.out.println(c);
        A a = new B();
        System.out.println(a.i);
    }
}

class A {
    int i = 2;

    void out() {
        System.out.println(this.i);
    }
}

class B extends A {
    private int i = 3;

    @Override
    void out() {
        System.out.println(i);
    }
}


