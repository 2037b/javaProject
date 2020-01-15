package org.example.pojo;

public class Student {

  private int stuId;
  private String stuName;
  private float score;
  private String address;
  private String attendance;

  public Student(int stuId, String stuName, float score, String address, String attendance) {
    this.stuId = stuId;
    this.stuName = stuName;
    this.score = score;
    this.address = address;
    this.attendance = attendance;
  }

  public Student(String stuName, float score, String address) {
    this.stuName = stuName;
    this.score = score;
    this.address = address;
  }

  public int getStuId() {
    return stuId;
  }

  public String getStuName() {
    return stuName;
  }

  public float getScore() {
    return score;
  }

  public String getAddress() {
    return address;
  }

  public String getAttendance() {
    return attendance;
  }
}
