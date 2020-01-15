package org.zjl_.banyuan.day_01;

/**
 * 有10长度的字符串数组,根据字符串的长度进行降序排序输出
 */
public class Homework08 {
    public static void main(String[] args) {
        String temp;
        String[] list = new String[10];
        System.out.println("请输入10个字符串：");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list[i] = sc.next();
        }
        //通过.length获取数组长度，进行冒泡排序；
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                //获取字符串长度；
                if (list[j].length() < list[j + 1].length()) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + (i + 1) + "个字符串为：" + list[i]);
        }
    }
}
