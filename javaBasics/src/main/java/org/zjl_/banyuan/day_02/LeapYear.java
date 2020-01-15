package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("这是闰年");
        else
            System.out.println("这不是闰年");
    }
}
