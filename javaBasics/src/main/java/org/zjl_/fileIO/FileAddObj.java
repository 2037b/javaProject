package org.zjl_.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileAddObj {

  public static void main(String[] args) throws IOException {
    Person p1 = new Person("Jerry", 20, "New York");
    Person p2 = new Person("James", 19, "Boston");
    Person p3 = new Person("Williams", 23, "Los Angeles");
    File fper = new File("Person.txt");
    OutputStream ops = new FileOutputStream(fper);
    ops.write(p1.toString().getBytes());
    ops.write('\n');
    ops.write(p2.toString().getBytes());
    ops.write('\n');
    ops.write(p3.toString().getBytes());
    ops.close();
  }
}

class Person {

  private String name;
  private int age;
  private String address;

  Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }
}
