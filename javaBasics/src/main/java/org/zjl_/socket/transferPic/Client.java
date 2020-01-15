package org.zjl_.socket.transferPic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(final String[] args) throws FileNotFoundException {
        final File file = new File("/Users/edz/Downloads/111.jpg");
        final BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos;
        Socket socket;
        try {
            socket = new Socket("192.168.11.203", 8888);
            bos = new BufferedOutputStream(socket.getOutputStream());
            final byte[] bytes = new byte[(int) (file.length())];
            int length = 0;
            while ((length = bis.read(bytes, 0, bytes.length)) != -1) {
                bos.write(bytes, 0, length);
                bos.flush();
            }
        } catch (final UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (final IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}