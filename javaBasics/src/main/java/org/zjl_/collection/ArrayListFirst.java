package org.zjl_.collection;

public class ArrayListFirst {

  public static void main(String[] arg) {
    java.util.ArrayList list = new java.util.ArrayList();
    list.add("1");
    list.add("2");
    list.add(3.0);
    list.add("4");
    list.add("5");
    System.out.println(list.get(2).getClass());
    System.out.println(list.get(0).getClass());
    System.out.println(list);
  }
}
