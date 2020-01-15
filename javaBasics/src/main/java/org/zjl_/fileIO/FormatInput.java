package org.zjl_.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FormatInput {

  public static void main(String[] args) throws IOException {
    String str = new Scanner(System.in).nextLine();
    File file = new File("Format.txt");
    OutputStream ops = new FileOutputStream(file);
    int i = 0;

    try {
      do {
        ops.write(str.getBytes(), i, 3);
        i += 3;

          if (i % 15 == 0)
              ops.write(".\n".getBytes());
          else if (str.getBytes().length == i)
              ops.write('.');
          else
              ops.write(',');
      } while (i < str.getBytes().length);

    } catch (Exception e) {
      int length = str.getBytes().length % 3;
      ops.write(str.getBytes(), i, length);
      ops.write('.');

    } finally {
      ops.close();
    }
  }
}
