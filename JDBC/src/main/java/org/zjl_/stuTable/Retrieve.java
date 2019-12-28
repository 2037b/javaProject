package org.zjl_.stuTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrieve {

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    try (Connection connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
            "123456"); Statement statement = connection.createStatement()) {

      // executeQuery 执行 查询语句，并把结果集返回给 ResultSet对象
      String sql = "SELECT * FROM student where stuName LIKE '%m%'";
      ResultSet rs = statement.executeQuery(sql);

      // 在取第二列的数据的时候，用的是rs.get(2) ，而不是get(1).
      // 这个是整个Java自带的api里唯二的地方，使用 基1 的，即2就代表第二个。
      while (rs.next()) {
        // next()  表中的数据 逐行 依次存储在ResultSet中， .next()方法返回boolean值
        int stuId = rs.getInt("stuId");     // 可以用 字段名
        String stuName = rs.getString(2);   // 也可以用 字段顺序
        float score = rs.getFloat("score");
        String address = rs.getString("address");
        System.out
            .printf("stuId=%d,stuName=%s,score=%.1f,address=%s%n", stuId, stuName, score, address);
      }

      // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
      // rs.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
