package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class EightStudent {
    public static void main(String[] args) {
        int[] arr1 = new int[8];
        int max = 0, min = 1000, sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr1[i] = sc.nextInt();
            sum += arr1[i];
            max = max > arr1[i] ? max : arr1[i];
            min = min < arr1[i] ? min : arr1[i];
        }
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + sum / 8);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
    }
}
