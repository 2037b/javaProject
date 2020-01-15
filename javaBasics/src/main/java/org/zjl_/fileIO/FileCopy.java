package org.zjl_.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

  public static void main(String[] args) throws IOException {
    File fileA = new File("A.txt");
    File fileB = new File("B.txt");

    OutputStream osA = new FileOutputStream(fileA);
    osA.write("这是FileA的内容".getBytes());
    osA.close();

    InputStream is = new FileInputStream(fileA);
    byte[] by = new byte[(int) fileA.length()];
    is.read(by);
    String str = new String(by);

    OutputStream osB = new FileOutputStream(fileB);
    osB.write(str.getBytes());
    osB.close();
  }
}
