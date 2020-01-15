package org.zjl_.banyuan.day_02;

public class PrintPatern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
