package org.zjl_.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GetTxt {

  public static void main(String[] args) throws IOException {
    File file = new File("/Users/edz/project");
    getFiles(file);
  }

  static void getFiles(File file) throws IOException {
    File[] files = file.listFiles();
    File newFile = new File("AllTxt.txt");

    assert files != null;
      for (File tempFile : files)
          if (tempFile.isDirectory()) {
              getFiles(tempFile);
          } else if (tempFile.getAbsolutePath().endsWith(".txt")) {
              InputStream ips = new FileInputStream(tempFile);
              byte[] by = new byte[(int) tempFile.length()];
              ips.read(by);
              String str = new String(by);
              OutputStream osB = new FileOutputStream(newFile, true);
              osB.write('\n');
              osB.write(str.getBytes());
              osB.close();
          }
  }
}