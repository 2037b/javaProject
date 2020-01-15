package org.zjl_.banyuan.examTwo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountNum {

  public static void main(String[] args) {
    Map<Character, Integer> map = new TreeMap<>();
    Scanner scan = new Scanner(System.in);
    char[] charArray = scan.next().toCharArray();
    for (char cur : charArray)
      map.compute(cur, (k, v) -> {
        if (v == null && k != ',') {
          return 1;
        } else if (k != ',') {
          return v + 1;
        }
        return v;
      });
    System.out.println(map);
  }
}
