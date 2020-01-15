package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class Odevity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        System.out.println("输入一个数，判断奇偶数，输入-1退出");
        int i = sc.nextInt();
        while (i != -1) {
            if (i > 0) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                System.out.println(odd + " " + even);
                i = sc.nextInt();
            } else {
                System.out.println("输入不合法，请重新输入。");
                i = sc.nextInt();
            }
        }
    }
}
