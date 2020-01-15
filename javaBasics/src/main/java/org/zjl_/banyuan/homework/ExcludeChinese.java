package org.zjl_.banyuan.homework;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ExcludeChinese {

  public static void main(String[] args) throws UnsupportedEncodingException {
    System.out.println(
        subStrExCh(new Scanner(System.in).nextLine(),
            new Scanner(System.in).nextInt()));
  }

  static String subStrExCh(String str, int length) throws UnsupportedEncodingException {
    int count = 0;
    String newStr = "";

      if (length <= 0)
          return null;

    for (char ch : str.toCharArray()) {
      String tempStr = ch + "";
      if (tempStr.getBytes("GBK").length < 2 && count < length) {
        newStr += ch;
        count++;
      } else if (tempStr.getBytes("GBK").length == 2 && count + 2 <= length) {
          newStr += ch;
          count += 2;
      } else
          return newStr;
    }
    return newStr;
  }
}
