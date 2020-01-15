package org.zjl_.object;

public class FatherSon {

  public static void main(String[] args) {
    Father fs = new Son();
    System.out.println(((Son) fs).i);
//        fs.print();
//        Son son=new Son();
//        System.out.println(((Father)son).i);
//        System.out.println(son.i);
//        son.i=3;
//        son.print();
  }
}

class Father {

  int i = 2;

  void print() {
    System.out.println(i);
  }
}

class Son extends Father {

  int i = 3;
}