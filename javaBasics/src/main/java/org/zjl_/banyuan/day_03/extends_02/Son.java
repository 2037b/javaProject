package org.zjl_.banyuan.day_03.extends_02;


public class Son extends Father {
    int a;

    public Son(String name, int age) {
        super(name, age);
    }

    void setA() {
        System.out.println("dsdf");
    }

    public static void main(String[] args) {
        Son ds = new Son("ds", 23);
        ds.setA();
    }
}
