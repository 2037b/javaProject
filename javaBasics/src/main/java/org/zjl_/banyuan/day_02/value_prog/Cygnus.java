package org.zjl_.banyuan.day_02.value_prog;

public class Cygnus {
    /*static int value = 9; //注意value是静态的成员变量；

    public static void main(String[] args) throws Exception {
        new Cygnus().printValue();
    }

    private void printValue() {
        int value = 69; //局部变量和全局变量可以重名；
        System.out.println(this.value);
    }
}*/
    static {
        int x = 5;
    }

    static int x, y;

    public static void main(String[] args) {
        x--;
        myMethod();
        System.out.println(x + y++ + x);
    }

    public static void myMethod() {
        y = x++ + ++x;
    }
}
