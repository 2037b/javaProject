package org.zjl_.banyuan.examThree.stuInfoSys;

public class Student {

  private int number;
  private String name;
  private int age;
  private int python;
  private int java;
  private int linux;
  private int sql;
  private int sum;
  private int avg;

  public Student(int number, String name, int age, int python, int java, int linux, int sql) {
    this.number = number;
    this.name = name;
    this.age = age;
    this.python = python;
    this.java = java;
    this.linux = linux;
    this.sql = sql;
    sum = python + java + linux + sql;
    avg = sum / 4;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getPython() {
    return python;
  }

  public void setPython(int python) {
    this.python = python;
  }

  public int getJava() {
    return java;
  }

  public void setJava(int java) {
    this.java = java;
  }

  public int getLinux() {
    return linux;
  }

  public void setLinux(int linux) {
    this.linux = linux;
  }

  public int getSql() {
    return sql;
  }

  public void setSql(int sql) {
    this.sql = sql;
  }

  public int getSum() {
    return sum;
  }

  public int getAvg() {
    return avg;
  }

  @Override
  public String toString() {
    return "Student{" +
        "number=" + number +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", python=" + python +
        ", java=" + java +
        ", linux=" + linux +
        ", sql=" + sql +
        ", sum=" + sum +
        ", avg=" + avg +
        '}';
  }
}
