package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num;
        int i;
        int num1 = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("请输入正数！");
        } else {
            while (num > 0) {
                i = num % 10;
                num = num / 10;
                num1 = num1 * 10 + i;
            }
            System.out.println("结果： " + num1);
        }
    }
}
