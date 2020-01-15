package org.zjl_.banyuan.day_02.car_prog;

//引用类；

public class CarTest {
   /* public static void main(String[] args) {
        System.out.println(new CarTools());
    }
}*/

    public static void main(String[] args) {
        //直接用类名只能调用静态方法，不用先声明类变量，非静态方法必须通过先声明类变量来被调用；
        CarTools.addCar(new Car("S" + 3 + "系列", "奔驰", "RGB" + 6, "2019-12-" + 9, "Germany"));
        // CarTools.println();

        //通过有参构造器来创建对象，对象变量名为c1；
        Car c1 = new Car("S" + 5 + "系列", "奔驰", "RGB" + 9, "2019-12-1" + 3, "China");

        // CarTools.addCar(new Car("S" + 5 + "系列", "奔驰", "RGB" + 9, "2019-12-1" + 3, "USA"));
        CarTools.addCar(c1);


        CarTools.println();
        System.out.println("-----modify-----");
        CarTools.delCar("S5系列");
        CarTools.println();
    }
}