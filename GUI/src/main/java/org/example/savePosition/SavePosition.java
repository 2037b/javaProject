package org.example.savePosition;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFrame;

public class SavePosition extends Thread {

  JFrame jf;
  File file = new File("src/main/java/org/example/savePosition/Location.txt");

  public SavePosition(JFrame jf) {
    this.jf = jf;
  }

  @Override
  public void run() {
    while (true) {
      try (FileOutputStream fos = new FileOutputStream(file);
          DataOutputStream dos = new DataOutputStream(fos)) {
        dos.write(jf.getX());
        dos.write(jf.getY());
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
