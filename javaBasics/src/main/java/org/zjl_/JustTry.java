package org.zjl_;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class JustTry {

  final int A;

  int aJust;

  {
    int f = 5;
    aJust = 4;
  }

  int f;

  JustTry() {
    A = 3;
  }

  JustTry(int a, int b) {
    this();
//    A=3;
  }

  void strs(String... strings) {
  }

  void fun(float a, int b) {
  }

  void fun(double a, int b) {
  }

  public static void main(String[] args) {
    int[] arr = new int[]{2, 3, 45, 4, 64};
    String str = Arrays.toString(arr);
    new JustTry().fun(12, 23);
    String name = Objects.requireNonNull(str, "unknown");
    System.out.println(new JustTry().f);
    System.out.println(new Random().nextInt(99));
//    Manager[] managers = new Manager[10];
//    Employee[] employees = new Employee[90];
//    employees = managers;
//    employees[0] = new Manager();
//    Employee employee = new Manager();

//    Manager manager = new Manager();
////    employee = manager;
//    Boss boss = new Boss();
//    manager = (Manager) employee;
//    manager = (Manager) new Employee();
//    System.out.println(new Manager().age);
//    new Manager().print();
//    new Employee().print();
//    Class clazz = Employee.class;
    try {
      Class clazz = Class.forName("org.zjl_.Manager");
      clazz.getDeclaredField("age");
    } catch (ClassNotFoundException | NoSuchFieldException e) {
      e.printStackTrace();
    }
    Manager m = new Manager();
    System.out.println(new Manager());

  }
}

class Manager extends Employee {

  int age = 4;
  protected int id;

  @Override
  Manager print() {
    age = 53;
    System.out.println(age + "+" + super.age);
    return new Manager();
  }
}

class Boss extends Employee {

}

class Employee {

  int age = 2;

  static {
    System.out.println("initialize Employee instance");
  }

  Employee print() {
    System.out.println(age);
    return new Employee();
  }
}
