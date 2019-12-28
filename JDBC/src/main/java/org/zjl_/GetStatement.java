package org.zjl_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetStatement {

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager
          .getConnection("jdbc:mysql://localhost:3306/crushcourse?useSSL=false", "root", "123456");

      // 用 java.sql.Statement 包
      // .create 创建 并 获取 Statement 对象，通过 对象 将 SQL 语句发送到数据库
      Statement statement = connection.createStatement();
      System.out.println("Get Statement object: " + statement);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
