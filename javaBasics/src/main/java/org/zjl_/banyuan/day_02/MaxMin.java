package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int max, min, num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        max = num;
        min = num;
        while (num != 0) {
            num = scan.nextInt();
            if (num != 0) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
        }
        System.out.println("最大值为：" + max + "  最小值为：" + min);
    }
}
