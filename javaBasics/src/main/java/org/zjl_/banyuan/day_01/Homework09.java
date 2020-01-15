package org.zjl_.banyuan.day_01;

import java.util.*;

/**
 * 循环输入10个数,统计每个数出现的次数
 */
public class Homework09 {
    public static void main(String[] args) {
        int temp;
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入10个整数：");
        for (int i = 0; i < 10; i++) {
//            手动输入10个数；
//            num[i] = sc.nextInt();
//            用 Math.random函数 随机生成十个数；
            num[i] = (int) (Math.random() * 50);
        }
        //进行冒泡排序；
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        int sum = 1;
        for (int i = 0; i < num.length; i++) {
            if (i != 9) {
                if (num[i] == num[i + 1]) {
                    sum++;
                } else {
                    System.out.println(num[i] + "的个数为：" + sum);
                    sum = 1;
                }
            }
        }
        System.out.println(num[9] + "的个数为：" + sum);
//        Map<Integer, Integer> map = new TreeMap<>();
//        Integer[] num = new Integer[10];
      /*      int cur = sc.nextInt();
            map.compute(cur, (k, v) -> {
                if(v == null){
                    return 1;
                }else{
                    return v+1;
                }
            });

            if (map.containsKey(cur)) {
                map.put(cur, map.get(cur) + 1);
            } else {
                map.put(cur, 1);
            }
        }

        for (Map.Entry<Integer, Integer> one : map.entrySet()) {
            System.out.println(one.getKey() + "的个数为：" + one.getValue());
        }*/
    }
}
