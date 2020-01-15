package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
            max = max > arr1[i] ? max : arr1[i];
        }
        System.out.println("最大值是：" + max + '\n' + "下标是：" + '\t');
        for (int i = 0; i < 10l; i++) {
            if (arr2[i] == max) {
                System.out.print(i);
            }
        }
    }
}