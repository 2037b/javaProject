package org.zjl_.banyuan.homework;


import java.util.Scanner;

public class AnyRangeRandom {
    public static void main(String[] args) {
        startRandom(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
    }

    static void startRandom(int num1, int num2) {
        System.out.println(num1 < num2 ?
                (int) (Math.random() * (num2 - num1)) + num1 :
                (int) (Math.random() * (num1 - num2)) + num2);
    }
}
