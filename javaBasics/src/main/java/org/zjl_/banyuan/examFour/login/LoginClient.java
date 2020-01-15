package org.zjl_.banyuan.examFour.login;

import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {

  public static void main(String[] args) throws Exception {
    Socket socket
        = new Socket("192.168.11.203", 8888);
    DataInputStream dis
        = new DataInputStream(socket.getInputStream());
    ObjectOutputStream oos
        = new ObjectOutputStream(socket.getOutputStream());
    Scanner input = new Scanner(System.in);
    System.out.println("请输入用户名");
    String username = input.nextLine();
    System.out.println("请输入密码");
    String password = input.nextLine();
    User user = new User(username, password);
    oos.writeObject(user);
    boolean flag = dis.readBoolean();
    if (flag)
      System.out.println("登录成功");
    else
      System.out.println("登录失败");
    dis.close();
    oos.close();
    socket.close();
  }
}