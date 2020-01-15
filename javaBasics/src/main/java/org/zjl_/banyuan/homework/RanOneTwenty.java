package org.zjl_.banyuan.homework;

import java.util.HashSet;

public class RanOneTwenty {
    public static void main(String[] args) {
        HashSet<Integer> random = new HashSet<>();
        while (random.size() != 10) {
            random.add((int) (Math.random() * 20));
        }
        System.out.println(random);
    }
}
