package org.example.impleClass;

import org.example.pojo.Student;
import org.example.service.Service;

public class JdbcService implements Service {


  @Override
  public void insertStudent(String stuName, float score, String address) {
    Student student = new Student(stuName, score, address);
    new JdbcDao().insertStudent(student);
  }
}
