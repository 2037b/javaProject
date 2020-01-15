package org.zjl_.banyuan.day_04.extends_exp_02;

public class Function {
    static int name = 2;

    static int teach() {
        return 100;
    }

    public static void main(String[] args) {
        int b = new Function().teach();

        System.out.println(b);
    }
}
