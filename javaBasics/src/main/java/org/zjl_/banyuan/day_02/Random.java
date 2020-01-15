package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int scanNum;
        int count = 0;
        int[] randomNum = new int[10];
        System.out.println("请输入一个数：");
        Scanner scan = new Scanner(System.in);
        scanNum = scan.nextInt();
        for (int i = 0; i < 10; i++)
            randomNum[i] = (int) (Math.random() * 30);
        for (int i : randomNum
        ) {
            System.out.print(i + "  ");
            if (i == scanNum) count++;
        }
        System.out.println("");
        System.out.println(count);
    }
}