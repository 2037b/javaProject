package org.zjl_.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ObjectStream {

  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "盖伦";
    h1.hp = 5000;
    Hero h2 = new Hero();
    h2.name = "易";
    h2.hp = 3500;
    File file = new File("LOL.txt");
    try (
        //创建对象输出流
        OutputStream ops = new FileOutputStream(file);
        ObjectOutputStream oops = new ObjectOutputStream(ops);

        //创建对象输入流
        InputStream ips = new FileInputStream(file);
        ObjectInputStream oips = new ObjectInputStream(ips)
    ) {
      oops.writeObject(h1);
      oops.writeObject(h2);
      for (int i = 0; i < 2; i++) {
        Hero readObj = (Hero) oips.readObject();
        System.out.println(readObj);
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

class Hero implements Serializable {

  //表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
  private static final long serialVersionUID = 1L;
  public String name;
  public float hp;

  @Override
  public String toString() {
    return "Hero{" +
        "name='" + name + '\'' +
        ", hp=" + hp +
        '}';
  }
}
