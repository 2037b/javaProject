package org.zjl_.banyuan.day_02;

import java.util.Scanner;

public class ThreeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("请输入" + (i + 1) + "班" + "第" + (j + 1) + "个学生成绩");
                int num = sc.nextInt();
                sum += num;
            }
            arr[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "班" + "总分：" + arr[i]);
            System.out.println("平均分：" + (double) arr[i] / 10);
        }

    }

}
