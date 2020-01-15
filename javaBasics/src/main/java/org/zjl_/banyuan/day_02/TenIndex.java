package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class TenIndex {
    public static void main(String[] args) {
        System.out.println("请输入十个整数。");
        int[] arr1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("请输入一个整数。");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (num == arr1[i]) {
                System.out.println("找到，下标是：" + i);
            } else {
                System.out.println("不是");
            }
        }
    }
}
