package org.zjl_.socket.firstTry;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) {

        try {
            // 一个计算机对应一个IP地址。
            // 通过服务端(即 本机)的8888端口来建立连接,
            // 客户端的端口号由系统随机分配；
            Socket s = new Socket("192.168.11.203", 8888);
            System.out.println(s);
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}