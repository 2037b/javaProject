package org.zjl_.banyuan.examFour.login;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    ObjectInputStream ois
        = new ObjectInputStream(socket.getInputStream());
    DataOutputStream dos
        = new DataOutputStream(socket.getOutputStream());
    User user = (User) ois.readObject();
    System.out.println("我是服务器，收到的信息是：" + user);
    boolean flag = false;
    if ("bjsxt".equals(user.getUsername())
        && "bjsxt".equals(user.getPassword()))
      flag = true;
    dos.writeBoolean(flag);
    ois.close();
    dos.close();
    socket.close();
  }
}