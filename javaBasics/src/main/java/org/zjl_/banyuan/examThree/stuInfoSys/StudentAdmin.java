package org.zjl_.banyuan.examThree.stuInfoSys;

import java.util.ArrayList;

public class StudentAdmin {

  private ArrayList<Student> stuList = new ArrayList<>();

  public ArrayList<Student> getStuList() {
    return stuList;
  }

  public void menu() {
    System.out.println("10:添加学生");
    System.out.println("11:查找学生");
    System.out.println("12:根据编号更新学生");
    System.out.println("13:根据编号删除学生");
    System.out.println("14:根据编号录入成绩");
    System.out.println("15:按科目成绩排序");
    System.out.println("16:按总成绩排序");
    System.out.println("99:退出系统");
  }

  public void print(ArrayList<Student> stuList) {
    if (stuList.size() == 0)
      System.out.println("没有学生");
    else
      for (Student student : stuList) {
        System.out.println(student);
      }
  }

  public void create(Student stu) {
    for (Student tempStu : stuList)
      if (tempStu.getNumber() == stu.getNumber()) {
        System.out.println("number already exists");
        return;
      }
    stuList.add(stu);
    System.out.println("creation success!");
    System.out.println(stuList);
  }

  public void select(int num) {
    for (Student tempStu : stuList)
      if (tempStu.getNumber() == num) {
        System.out.println(tempStu);
        return;
      }
    System.out.println("没找到该学生");
  }

  public void update(int num, Student stu) {
    for (int i = 0; i < stuList.size(); i++)
      if (stuList.get(i).getNumber() == num) {
        stuList.remove(i);
        stuList.add(i, stu);
        System.out.println("更新成功");
        System.out.println(stuList);
        return;
      }
    System.out.println("没有这个学生，请选择 添加 功能");
  }

  public void delete(int num) {
    for (int i = 0; i < stuList.size(); i++)
      if (stuList.get(i).getNumber() == num) {
        stuList.remove(i);
        System.out.println("删除成功");
        System.out.println(stuList);
        return;
      }
    System.out.println("没找到该学生");
  }

  public void input(int num) {
    for (int i = 0; i < stuList.size(); i++) {

    }
  }
}
