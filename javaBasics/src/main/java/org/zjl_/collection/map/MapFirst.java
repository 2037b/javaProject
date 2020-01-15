package org.zjl_.collection.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// 获取字符串里面每个字符出现的个数；

public class MapFirst {

  public static void main(String[] args) {
    Map<Character, Integer> map = new TreeMap<>();
    Scanner scan = new Scanner(System.in);
    char[] charArray = scan.next().toCharArray();
    /*
            if (map.containsKey(cur)) {
                map.put(cur, map.get(cur) + 1);
            } else {
                map.put(cur, 1);
            }
            }
    */
    /*
        for (Map.Entry<Integer, Integer> one : map.entrySet()) {
            System.out.println(one.getKey() + "的个数为：" + one.getValue());
        }*/
      for (char cur : charArray)
          map.compute(cur, (k, v) -> {
              if (v == null) {
                  return 1;
              } else {
                  return v + 1;
              }
          });
    System.out.println(map);
  }
}