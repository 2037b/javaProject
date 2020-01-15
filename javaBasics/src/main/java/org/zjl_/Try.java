package org.zjl_;

public class Try {

  static {
    System.out.println("initialize Try instance");
  }

  public static void main(String[] args) throws ClassNotFoundException {
    var i = 23;
    var d = 22.03;
    i = (int) d;
    System.out.println(i);
    String str = String.valueOf(234);
    System.out.println(str);
    Class clazz = Class.forName("Try");
  }
}
