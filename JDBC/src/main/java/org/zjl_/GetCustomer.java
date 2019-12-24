package org.zjl_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetCustomer {

  public static void main(String[] args) {
    try {
      ArrayList<Customer> cusArr = new ArrayList<>();

      // 初始化 数据库，并 建立连接
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager
          .getConnection(
              "jdbc:mysql://localhost:3306/crushcourse?useSSL=false",
              "root", "123456");

      // Statement 用于执行SQL语句
      // 使用的是 java.sql.Statement
      Statement statement = con.createStatement();

      String sql = "SELECT * FROM customers";
      ResultSet resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        Customer customer = new Customer();
        customer.setCust_id(resultSet.getInt(1));
        customer.setCust_name(resultSet.getString(2));
        customer.setCust_address(resultSet.getString(3));
        customer.setCust_city(resultSet.getString(4));
        cusArr.add(customer);
      }

      for (Customer tempCus : cusArr)
        System.out.println(tempCus);

    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
