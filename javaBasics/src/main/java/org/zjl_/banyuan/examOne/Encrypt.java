package org.zjl_.banyuan.examOne;

import java.util.Scanner;

public class Encrypt {

  public static void main(String[] args) {
    System.out.println("输入四位数字：");
    System.out.println("加密后的数字为：" + pwd(new Scanner(System.in).nextInt()));
  }

  static int pwd(int num) {
    int[] numArr = new int[4];
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = (num % 10 + 9) % 10;
      num /= 10;
    }
    return numArr[2] + numArr[3] * 10 + numArr[0] * 100 + numArr[1] * 1000;
  }
}
