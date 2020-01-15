package org.example.impleClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.dao.Dao;
import org.example.pojo.Student;
import org.example.util.DBUtil;

public class JdbcDao implements Dao {

  Connection connection = null;
  PreparedStatement preparedSta;

  @Override
  public void insertStudent(Student student) {
    String sql = "insert into student (stuName,score,address)values(?,?,?)";
    connection = DBUtil.getConnection();
    try {
      preparedSta = connection.prepareStatement(sql);
      preparedSta.setString(1, student.getStuName());
      preparedSta.setFloat(2, (float) student.getScore());
      preparedSta.setString(3, student.getAddress());

      preparedSta.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBUtil.close();
    }
  }
}
