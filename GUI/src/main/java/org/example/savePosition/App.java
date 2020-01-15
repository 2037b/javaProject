package org.example.savePosition;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

public class App {

  public static void main(String[] args) {
    JFrame jf = new JFrame("SavePositionAPP");
    jf.setSize(400, 400);
    Point p = getPointFromLocationFile();
    if (p != null)
      jf.setLocation(p.x, p.y);
    else
      jf.setLocation(200, 200);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);
    new SavePosition(jf).start();
  }

  static class Point {

    int x;
    int y;
  }

  static Point getPointFromLocationFile() {
    File file = new File("src/main/java/org/example/savePosition/Location.txt");
    Point p = null;
    try (FileInputStream fis = new FileInputStream(file); DataInputStream dis = new DataInputStream(
        fis)) {
      p = new Point();
      p.x = dis.readInt();
      p.y = dis.readInt();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return p;
  }

}
