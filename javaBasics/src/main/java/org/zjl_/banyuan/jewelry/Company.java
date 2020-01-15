package org.zjl_.banyuan.jewelry;

public class Company {
    int i = 3;

    void bark() {
        System.out.println("wowowo!");
    }

    public static void main(String[] args) {
        Company c1 = new SmallCompany();
        c1.bark();
        System.out.println(c1.i);
    }
}

class SmallCompany extends Company {
    int i = 4;

    @Override
    void bark() {
        System.out.println("woooooo!");
    }
}