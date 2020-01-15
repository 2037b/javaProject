package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("请输入n：");
        n = new Scanner(System.in).nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "  ");
            }
            System.out.println("");
        }
    }
}
