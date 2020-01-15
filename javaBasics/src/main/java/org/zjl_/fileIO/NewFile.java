package org.zjl_.fileIO;

import java.io.File;

public class NewFile {

  public static void main(String[] args) {
    File file = new File("ArrayList.doc");
    System.out.println(file.getAbsolutePath());
  }
}
