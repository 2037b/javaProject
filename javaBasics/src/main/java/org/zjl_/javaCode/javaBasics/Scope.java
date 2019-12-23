package javaCode.javaBasics;

public class Scope {
    int i = 2;

    void print(int i) {
        System.out.println(i);
        System.out.println(this.i);
    }

    public static void main(String[] args) {
        int i = 3;
//        {int i=3;}
//        for (int i = 0; i < ; i++) {
//
//        }
        System.out.println(i);
        {
            int j = 3;
        }
        int j = 3;
        new Scope().print(5);
    }
}
