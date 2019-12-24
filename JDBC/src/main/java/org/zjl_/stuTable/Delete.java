package org.zjl_.stuTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

  public static void main(String[] args) {
    Connection connection = null;
    Statement statement = null;
    String sql = "DELETE FROM student WHERE stuName='James'";

    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager
          .getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false",
              "root", "123456");
      statement = connection.createStatement();
      statement.execute(sql);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      // 关闭连接：
      // 先关闭 Statement对象 后 关闭 Connection对象
      if (statement != null)
        try {
          statement.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      if (connection != null)
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
    }
  }
}
