package org.zjl_.stuTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    // 使用try-with-resource的方式自动关闭连接，因为Connection和Statement都实现了AutoCloseable接口;
    try (Connection connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false",
            "root", "123456");
        Statement statement = connection.createStatement()) {

      String sql = "UPDATE student SET stuName='Tom' WHERE address='New York'";
      statement.execute(sql);

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
