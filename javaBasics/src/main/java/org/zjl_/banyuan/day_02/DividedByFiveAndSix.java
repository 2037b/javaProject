package org.zjl_.banyuan.day_02;

public class DividedByFiveAndSix {
    public static void main(String[] args) {
        for (int num = 5; num < 100; num++) {
            if ((num % 5 == 0 || num % 6 == 0) && !(num % 5 == 0 && num % 6 == 0))
                System.out.println(num + ",");
        }
    }
}
