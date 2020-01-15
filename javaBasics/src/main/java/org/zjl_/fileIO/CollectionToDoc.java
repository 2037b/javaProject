package org.zjl_.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CollectionToDoc {

  public static void main(String[] args) throws IOException {
    ArrayList<Person> perArr = new ArrayList();
    Person p1 = new Person("Jerry", 20, "New York");
    Person p2 = new Person("James", 19, "Boston");
    Person p3 = new Person("Williams", 23, "Los Angeles");
    perArr.add(p1);
    perArr.add(p2);
    perArr.add(p3);
    File fd = new File("ArrayList.doc");
    FileWriter fw = new FileWriter(fd, true);
    for (Person per : perArr) {
      fw.write(per.toString());
      fw.write('\n');
    }
    fw.close();
       /* OutputStream ops = new FileOutputStream(fd);
        for (Person per : perArr) {
            ops.write(per.toString().getBytes());
            ops.write('\n');
        }
        ops.close();*/
  }
}
