package org.zjl_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Match {

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    try (
        Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "123456");
        Statement statement = connection.createStatement()
    ) {
      String name = "Tom";
      String sql = "SELECT * FROM student WHERE stuName='" + name + "'";
      ResultSet resultSet = statement.executeQuery(sql);
      if (resultSet.next())
        System.out.println("存在");
      else
        System.out.println("不存在");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
