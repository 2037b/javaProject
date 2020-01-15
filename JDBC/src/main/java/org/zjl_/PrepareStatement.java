package org.zjl_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatement {

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    // 与创建 Statement 不同的是，需要根据sql语句创建 PreparedStatement
    // 而不是 .createStatement()
    // 除此之外，还能够通过设置参数，指定相应的值，而不是Statement那样使用字符串拼接
    String sql = "INSERT INTO student(stuName,score,address) VALUES(?,?,?)";

    try (Connection connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "123456");
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      // 设置参数，java 唯二 参数为 基1 的用法
      preparedStatement.setString(1, "John");
      preparedStatement.setFloat(2, (float) 78.3);
      preparedStatement.setString(3, "Miami");
      // 执行
      preparedStatement.execute();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
