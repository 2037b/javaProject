package org.zjl_.banyuan.day_03.extends_04;


class Test {

    public static void main(String[] args) {
        new Circle();

    }
}

class Draw {

    public Draw(String type) {

        System.out.println(type + " draw constructor");       //  1:shape draw constructor

    }
}

class Shape {

    private Draw draw = new Draw("shape");

    public Shape() {

        System.out.println("shape constructor");            //  2:shape constructor

    }
}

class Circle extends Shape {

    private Draw draw = new Draw("circle");             //  3:circle draw constructor

    public Circle() {

        System.out.println("circle constructor");           //  4:circle constructor

    }
}