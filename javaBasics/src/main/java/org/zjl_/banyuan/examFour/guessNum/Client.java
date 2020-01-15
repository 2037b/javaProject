package org.zjl_.banyuan.examFour.guessNum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

  public static void main(String[] args) throws Exception {
    Socket socket
        = new Socket("192.168.11.203", 8888);
    OutputStreamWriter socketOut = new OutputStreamWriter(socket.getOutputStream());
    BufferedReader socketReader = new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
    BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    while ((line = keyReader.readLine()) != null) {
      socketOut.write(line + "\r\n");
      socketOut.flush();
      line = socketReader.readLine();
      System.out.println("服务端回送的数据是：" + line);
      if (line.equals("quits")) {
        System.out.println("游戏结束！");
        break;
      }
    }
    socket.close();
  }
}
