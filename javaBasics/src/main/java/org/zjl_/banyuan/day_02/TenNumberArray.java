package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class TenNumberArray {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < 10l; i++) {
            System.out.println(arr2[i]);
        }
    }
}
