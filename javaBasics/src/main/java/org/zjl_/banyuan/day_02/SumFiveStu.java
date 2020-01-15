package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class SumFiveStu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int[] stu = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            stu[i] = scan.nextInt();
            sum += stu[i];
        }
        System.out.print(sum);
    }
}
