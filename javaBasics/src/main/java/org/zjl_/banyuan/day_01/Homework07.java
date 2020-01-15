package org.zjl_.banyuan.day_01;

/**
 * 7.Int count=0;
 * For(int i=0;i<100;i++){
 * count=count++;
 * }
 * 求count的值
 */
public class Homework07 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count = count++;
        }
        System.out.println("count=" + count);//count=0;
    }
}
