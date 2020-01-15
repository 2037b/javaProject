package org.zjl_.banyuan.examFour.guessNum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    int res = (int) (Math.random() * 5);
    BufferedReader socketReader = new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
    OutputStreamWriter socketOut = new OutputStreamWriter(socket.getOutputStream());
    BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    while ((line = socketReader.readLine()) != null) {
      System.out.println("服务端接收到的数据：" + line);
      String bingo = Integer.toString(res);
      if (line.equals(bingo)) {
        line = "恭喜你猜对了！";
        socketOut.write(line + "\r\n");
        socketOut.flush();
      } else {
        line = "很遗憾，没有猜对，再试一次！";
        socketOut.write(line + "\r\n");
        socketOut.flush();
      }
    }

    //关闭资源
    serverSocket.close();
  }

}
