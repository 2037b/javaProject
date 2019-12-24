package org.zjl_.stuTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Create {

  public static void main(String[] args) {
    // 整行查询语句 作为字符串 和  拼接字符串 作为查询语句都可以
    String sql1 = "INSERT INTO student(stuName,score,address) VALUES('James',98,'Los Angeles')";
    String sql2 = "INSERT INTO student(stuName,score,address) VALUES(" + "'Williams'," + 76
        + ",'Boston')";

//    Date date = new Date();
//    DateFormat sampleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    String attendance = sampleFormat.format(date);
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager
          .getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false",
              "root", "123456");
      Statement statement = connection.createStatement();
      statement.execute(sql1);  // 执行sql语句
      statement.execute(sql2);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
