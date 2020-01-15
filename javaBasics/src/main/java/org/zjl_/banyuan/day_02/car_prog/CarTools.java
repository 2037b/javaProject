package org.zjl_.banyuan.day_02.car_prog;

public class CarTools {
    static Car[] car = new Car[20];
    static int count = 0;

    //程序在启动的时候  就把对象值初始化完毕了
    static {
        for (int i = 0; i < 5; i++) {
            car[i] = new Car("S" + i + "系列", "奔驰", "RGB" + i, "2019-12-" + i, "USA");
            count++;
        }
    }

    //做添加操作  按照顺序往数组里面添加对象
    public static void addCar(Car ca) {   //ca  是堆里面的 对象的地址
        car[count++] = ca;
    }

    //移除
    public static void delCar(String type) {
        for (int i = 0; i < count; i++) {
            //equals方法比较字符串的内容是否一样
            if (car[i].getCarId().equals(type)) {
                for (int j = i; j < count; j++) {
                    car[j] = car[j + 1];
                    if (j == count - 1) {
                        car[j] = null;
                        break;
                    }
                }
                count--;
                break;
            }
            //移除一个之后 count--  为了方便统计有效对象个数
        }
    }

//    类变量遇到输出方法时自动调用toString，return 里面的值;
public static void println() {
    for (int i = 0; i < count; i++) {
        System.out.println(car[i].toString());
    }
}
}
