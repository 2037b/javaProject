package org.zjl_.banyuan.day_03.extends_04;

class A {
    int i = 1;

    void print() {
        System.out.println(i);
    }
}

class B extends A {
    int i = 2;

    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
