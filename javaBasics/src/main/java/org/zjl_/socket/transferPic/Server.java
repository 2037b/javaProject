package org.zjl_.socket.transferPic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        File directory = new File("/Users/edz/javaCode/111.jpg");
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[69191];
        int length = 0;
        OutputStream os = new BufferedOutputStream(new FileOutputStream(directory));
        while ((length = is.read(bytes, 0, bytes.length)) != -1) {
            os.write(bytes, 0, length);
            os.flush();
        }
        server.close();
        os.close();
    }

}