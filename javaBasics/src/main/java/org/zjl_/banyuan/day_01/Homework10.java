package org.zjl_.banyuan.day_01;

/**
 * @author edz
 * @description 杨辉三角
 */
public class Homework10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);        //调用输入方法；
        System.out.print("请输入行数：");
        int num = sc.nextInt();
        int[][] elements = new int[100][100];
        elements[0][0] = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == num) {
                    elements[i][j] = 1;
                } else {
                    elements[i][j] = elements[i - 1][j - 1] + elements[i - 1][j];
                }
                System.out.print(elements[i][j]);
            }
            System.out.println("");
        }
    }
}