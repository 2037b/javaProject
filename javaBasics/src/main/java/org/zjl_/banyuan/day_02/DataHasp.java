package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class DataHasp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[8];
        int i = 0;
        do {
            arr[i] = num % 10;
            num = num / 10;
            i++;
        } while (num != 0);
        for (int j = 0; j < 8; j++) {
            arr[j] = (arr[j] + 5) % 10;
        }
        int temp;
        temp = arr[7];
        arr[7] = arr[0];
        arr[0] = temp;
        for (int j = 0; j < 8; j++) {
            System.out.print(arr[j]);
        }
    }
}
