package org.zjl_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Initialization {

  public static void main(String[] args) {
    Connection con = null;
    ArrayList<Customer> cusArr = new ArrayList<>();
    try {

      // 1.初始化 驱动类 com.mysql.jdbc.Driver
      // 这个 驱动类  就存放在 mysql-connector-java-5.1.47.jar 中
      Class.forName("com.mysql.jdbc.Driver");

      // 2.使用驱动管理工具 DriverManager，建立与数据库的 Connection 连接,
      // 需提供 url 数据库所处的 ip地址 (本机使用 localhost) + 端口号 + 数据库名
      // user 数据库用户名 password 数据库用户密码
      String url = "jdbc:mysql://localhost:3306/crushcourse?useSSL=false";
      con = DriverManager.getConnection(url, "root", "123456");

      System.out.println(con.isClosed());

    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      if (con != null)
        try {
          con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
    }
  }
}
