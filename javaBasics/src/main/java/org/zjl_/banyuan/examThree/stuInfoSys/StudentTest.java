package org.zjl_.banyuan.examThree.stuInfoSys;

import java.util.Scanner;

public class StudentTest {

  public static void main(String[] args) {

    StudentAdmin stuAdm = new StudentAdmin();

    outer:
    while (true) {
      stuAdm.menu();
      System.out.printf("选择功能:");

      int num = new Scanner(System.in).nextInt();

      switch (num) {
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 99:
          break outer;
      }
//      stuAdm.print(stuAdm.getStuList());
    }
  }
}
