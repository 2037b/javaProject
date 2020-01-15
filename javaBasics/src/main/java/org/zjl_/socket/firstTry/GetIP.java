package org.zjl_.socket.firstTry;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[] args) {
        InetAddress host;
        try {
            host = InetAddress.getLocalHost();
            String ip = host.getHostAddress();
            System.out.println("本机ip地址：" + ip);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}