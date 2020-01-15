package org.zjl_.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileAppend {

  public static void main(String[] args) throws IOException {
    File f = new File("A.txt");
    OutputStream ops = new FileOutputStream(f, true);
    ops.write("\nWho am i?".getBytes());
    ops.write("\ti'm tab".getBytes());
  }
}
