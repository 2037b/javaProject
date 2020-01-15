package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class CountOneNine {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[30];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < 30; i++) {
            arr[arr1[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + arr[i]);
        }
    }
}
